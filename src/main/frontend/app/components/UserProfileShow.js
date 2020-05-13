import React from "react";
import UserProfileReview from "./UserProfileReviews";

const UserProfileShow = (props) => {
  const profile = props.profile;
  const reviews = profile.reviews;

  let mapReviews = <h4>Loading...</h4>;
  
  if (reviews !== undefined) {
    mapReviews = reviews.map((review) => (
      <UserProfileReview key={review.id} review={review} />
    ));
  }

  return (
    <div className="box">
      <h3>{profile.username}'s Profile</h3>
      <div className="clearfix">
        <img src={profile.imageUrl} className="profile-img-thumb-resize" />
        <p>
          <strong>Username:</strong> {profile.username}
          <br />
        </p>
        <p>
          <strong>First Name:</strong> {profile.firstName}
        </p>
        <p>
          <strong>Last Name:</strong> {profile.lastName}
        </p>
        <p>
          <strong>Display Name:</strong> {profile.firstName + " "}
          {profile.lastName && profile.lastName[0]}.
        </p>
        <p>
          <strong>Review Count:</strong> {reviews && reviews.length}
        </p>
      </div>

      <h3>{profile.username}'s Reviews</h3>
      <div>{mapReviews}</div>
    </div>
  );
};

export default UserProfileShow;

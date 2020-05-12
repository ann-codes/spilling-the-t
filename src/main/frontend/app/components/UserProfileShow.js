import React from "react";

const UserProfileShow = (props) => {
  const profile = props.profile;
  const reviews = profile.reviews;

  let mapReviews = <h4>Loading...</h4>;

  console.log(profile); /////////// ===================
  console.log(reviews); /////////// ===================

  if (reviews !== undefined) {
    mapReviews = reviews.map((review) => (
      <div>
        <h5>{review.title}</h5>
        <p>{review.review}</p>
        <i className="fa fa-star" aria-hidden="true"></i>

      </div>
    ));
  }

  return (
    <div className="box">
      <h3>{profile.username}'s Profile</h3>
      <img src={profile.imageUrl} className="profile-img-thumb-resize" />
      <div>{mapReviews}</div>
    </div>
  );
};

export default UserProfileShow;

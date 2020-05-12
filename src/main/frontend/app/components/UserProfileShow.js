import React from "react";

const UserProfileShow = (props) => {
  const profile = props.profile;
  const reviews = profile.reviews;

  let mapReviews = <h4>Loading...</h4>;

  console.log(profile); /////////// ===================
  console.log(reviews); /////////// ===================

  if (reviews !== undefined) {
    mapReviews = reviews.map((review) => {
      return (
        <div>
          <h5>{review.title}</h5>
          <p>
            {review.station.name} Station on the {review.station.lineName} Line
            ({review.station.network}), {review.station.city},{" "}
            {review.station.state}
          </p>
          <p>
            <strong>{review.date.split("T")[0]}:</strong> {review.review}
          </p>
          <table>
            <tbody>
              <tr>
                <td>Cleanliness: {review.cleanliness}</td>
                <td>Timeliness: {review.onTime}</td>
              </tr>
              <tr>
                <td>Capacity: {review.capacity}</td>
                <td>Overall Rating: {review.overallRating}</td>
              </tr>
            </tbody>
          </table>
        </div>
      );
    });
  }

  //   <i className="fa fa-star" aria-hidden="true"></i>

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

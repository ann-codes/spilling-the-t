import React from "react";
const StationInfo = (props) => {
  const reviews = props.station.reviews;
  let mapReviews = <p>LOADING...</p>;

  if (reviews !== undefined) {
    mapReviews = reviews.map((review) => (
      <div key={review.id}>
        <p>Title: {review.title}</p>
        <p>Date: {review.date}</p>
        <p>Clean: {review.cleanliness} out of 5</p>
        <p>{review.review}</p>
      </div>
    ));
  }

  return (
    <div className="text-center">
      <h2>{props.station.name}</h2>
      <img className="img-tweaks" src={props.station.imageUrl} />
      <p className="lead bold-me">
        {props.station.name} is {props.station.lineName}
        {props.station.address}
      </p>
      <p className="lead">
        <span className="bold-me">My State: </span>
        {props.station.state}
      </p>
      <h2>Reviews</h2>
      {mapReviews}
    </div>
  );
};
export default StationInfo;

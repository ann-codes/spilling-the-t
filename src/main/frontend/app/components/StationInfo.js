import React from "react";
import StationInfoReviews from "./StationInfoReviews";
const StationInfo = (props) => {
  const reviews = props.station.reviews;
  let mapReviews = <p>LOADING...</p>;

  if (reviews !== undefined) {
    mapReviews = reviews.map((review) => (
      <StationInfoReviews key={review.id} review={review} />
    ));
  }

  return (
    <div className="box">
      <h2>{props.station.name} Station</h2>
      <img src={props.station.imageUrl} />
      <p>
        <strong>Network:</strong> {props.station.network}
      </p>
      <p>
        <strong>Line:</strong> {props.station.lineName} Line
      </p>
      <p>
        <strong>Address:</strong> <br />
        {props.station.name} Station
        <br />
        {props.station.address}
        <br />
        {props.station.city}, {props.station.state} {props.station.zip}
      </p>
      <p>{props.station.description}</p>
      <h2>{props.station.name} Station Reviews</h2>
      {mapReviews}
    </div>
  );
};
export default StationInfo;

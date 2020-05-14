import React, { Fragment } from "react";
import { Link } from "react-router-dom";
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
    <Fragment>
      <h2 className="section-h align-center">{props.station.name} Station</h2>
      <div className="box">
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
        <Link className="button secondary large" to={`/reviews/new`}>
          Add Your Review
        </Link>
      </div>
      <h2 className="section-h align-center">
        {props.station.name} Station Reviews
      </h2>

      <div className="box">{mapReviews}</div>
    </Fragment>
  );
};
export default StationInfo;

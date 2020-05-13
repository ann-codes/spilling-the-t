import React from "react";
import { Link } from "react-router-dom";

const StationCard = (props) => {
const station = props.station

  return (
    <div className="callout">
      <div className="media-object">
        <div className="media-object-section">
          <div className="thumbnail">
            <img
              className="img-thumb-resize"
              src={station.imageUrl}
              alt={station.name}
            />
          </div>
        </div>
        <div className="media-object-section">
          <Link to={`station/${station.id}`}>
            <h3>{station.name} Station</h3>
          </Link>
          <p>
            {station.name} Station is in {station.state} in the {station.network}{" "}
            Network on the {station.lineName} Line.
            {station.reviews.title} Reviews. {station.reviews.date}
            <Link to={`station/${station.id}`}>Learn more!</Link>
          </p>
        </div>
      </div>
    </div>
  );
};

export default StationCard;

import React from "react";
import { Link } from "react-router-dom";
import StarMaker from "./StarMaker";

const StationInfoReviews = (props) => {
  const review = props.review;
  return (
    <div>
      <h5 className="review-head">{review.title}</h5>
      <p>
        By{" "}
        <Link to={`/profile/${review.user.username}`}>
          {review.user.username}
        </Link>
      </p>
      <p>
        <strong>{review.date.split("T")[0]}:</strong> {review.review}
      </p>
      <table>
        <tbody>
          <tr>
            <td className="align-right">Cleanliness: </td>
            <td>
              <StarMaker number={review.cleanliness} /> {review.cleanliness}/5
            </td>
            <td className="align-right">Timeliness: </td>
            <td>
              <StarMaker number={review.onTime} /> {review.onTime}/5
            </td>
          </tr>
          <tr>
            <td className="align-right">Capacity: </td>
            <td>
              <StarMaker number={review.capacity} /> {review.capacity}
              /5
            </td>
            <td className="align-right">Overall Rating: </td>
            <td>
              <StarMaker number={review.overallRating} /> {review.overallRating}
              /5
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  );
};

export default StationInfoReviews;

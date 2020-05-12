import React from "react"

const ReviewsInfo = (props) => {
	return (
		<div className="text-center">
			<h2>{props.station.reviews.title}</h2>
			<img className="img-tweaks" src={props.station.reviews.date} />
			<p className="lead bold-me">
				{props.station.reviews.review} is {props.station.reviews.cleanliness}
				{props.station.reviews.onTime}
			</p>
			<p className="lead">
				<span className="bold-me">My State: </span>
				{props.station.reviews.cleanliness}
			</p>
		</div>
	)
}

export default ReviewsInfo

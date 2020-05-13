import React from "react"
const StationInfo = (props) => {
	const reviews = props.station.reviews
	console.log(reviews)
	const mapReviews = reviews.map((review) => {
		return (
			<div>
				<p>
					Title: <h2>{review.title}</h2>
					Date: <h5>{review.date}</h5>
					Clean: <h5>{review.cleanliness} out of 5</h5>
					<p>
						<h4>{review.review}</h4>
					</p>
				</p>
			</div>
		)
	})
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
	)
}
export default StationInfo

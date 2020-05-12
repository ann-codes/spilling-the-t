import React from "react"
import { Link } from "react-router-dom"

const StationCard = (props) => {
	//reviewContainer renders in here function similar stationcard
	//create new array for props.review use the reviews through props
	//take props from statuion container create new array
	//new array should have props.reviews.first & .last

	//render the reviewList passing down the new review array as props
	//add stationinfo have a review list array render

	let reviewArray = [props.reviews.first, props.last]

	const reviewsListItems = reviewArray.map((map) => {
		return (
			<ReviewContainer
				key={map.id}
				id={map.id}
				network={map.network}
				name={map.name}
				lineName={map.lineName}
				state={map.state}
				imageUrl={map.imageUrl}
				reviews={map.reviews}
			/>
		)
	})
	return (
		<div className="callout">
			<div className="media-object">
				<div className="media-object-section">
					<div className="thumbnail">
						<img
							className="img-thumb-resize"
							src={props.imageUrl}
							alt={props.name}
						/>
					</div>
				</div>
				<div className="media-object-section">
					<Link to={`station/${props.id}`}>
						<h3>{props.name} Station</h3>
					</Link>
					<p>
						{props.name} Station is in {props.state} in the {props.network}{" "}
						Network on the {props.lineName} Line.
						{props.station.reviews.title} Reviews. {props.station.reviews.date}
						<Link to={`station/${props.id}`}>Learn more!</Link>
					</p>
				</div>
				<h1>{reviewsListItems}</h1>
			</div>
		</div>
	)
}

export default StationCard

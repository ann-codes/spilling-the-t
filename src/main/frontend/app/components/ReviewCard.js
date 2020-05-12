import React from "react"
import { Link } from "react-router-dom"

const ReviewCard = (props) => {
	//reviewContainer renders in here function similar stationcard
	//create new array for props.review use the reviews through props
	//take props from statuion container create new array
	//new array should have props.reviews.first & .last
	//create review card file
	//create review list container file
	//render the reviewList passing down the new review array as props
	//add stationinfo have a review list array render

	return (
		<div>
			Review:{props.title}
			Date: {props.date}
			Station Review {props.review}
			Cleanliness {props.cleanliness}
		</div>
	)
}

export default ReviewCard

import React, { useState, useEffect } from "react"
import fetchData from "../functions/fetchData"
import ReviewCard from "../components/ReviewCard"

const ReviewContainer = (props) => {
	const [reviews, setReviews] = useState([])

	const reviewApiPath = "/api/v1/stations/all"

	const loadReviews = () => {
		fetchData(reviewApiPath, setReviews)
	}

	useEffect(loadReviews, [])
	console.log()
	const reviewListItems = reviews.map((map) => {
		return (
			<ReviewCard
				key={map.id}
				id={map.id}
				title={map.title}
				date={map.date}
				review={map.review}
				cleanliness={map.cleanliness}
			/>
		)
	})

	return (
		<div>
			<h1>{reviewListItems}</h1>
		</div>
	)
}

export default ReviewContainer

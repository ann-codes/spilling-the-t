import React, { useState, useEffect } from "react"
import fetchData from "../functions/fetchData"
import StationCard from "../components/StationCard"
import ReviewsCard from "../components/ReviewsCard"

const StationContainer = (props) => {
	const [stations, setStations, reviews, setReviewsb] = useState([])

	const stationApiPath = "/api/v1/stations/all"

	const loadStations = () => {
		fetchData(stationApiPath, setStations)
	}

	useEffect(loadStations, [])

	const stationsListItems = stations.map((map) => {
		return (
			<div>
				<StationCard
					key={map.id}
					id={map.id}
					network={map.network}
					name={map.name}
					lineName={map.lineName}
					state={map.state}
					imageUrl={map.imageUrl}
				/>
				<ReviewsCard
					key={map.reviews.id}
					id={map.reviews.id}
					reviews={map.reviews}
				/>
			</div>
		)
	})

	return <h1>{stationsListItems}</h1>
}

export default StationContainer

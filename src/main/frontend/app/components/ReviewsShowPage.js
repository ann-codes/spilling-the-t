import React, { useState, useEffect } from "react"
import ReviewsInfo from "./ReviewsInfo"
import NotFound404 from "./NotFound404"
import fetchData from "../functions/fetchData"

const ReviewsShowPage = (props) => {
	const [station, setStation] = useState({})

	let currentStationId = Number(props.match.params.id)

	const apiEndpoint = `/api/v1/station/${currentStationId}`
	const fetchStation = () => fetchData(apiEndpoint, setStation)

	useEffect(fetchStation, {})
	console.log(station.reviews)
	if (station === null) {
		return <NotFound404 />
	} else if (currentStationId === station.id) {
		return <ReviewsInfo station={station} />
	} else {
		return <NotFound404 />
	}
}

export default StationShowPage

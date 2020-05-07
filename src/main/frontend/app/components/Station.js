import React, { useState, useEffect } from "react"
import fetchData from "../functions/fetchData"
import Station from "../components/Station"
import { Link } from "react-router-dom"

const Station = (props) => {
	const [station, setStation] = useState([])
	const [loading, setLoading] = useState(false)
	//not sure how to show id to show station
	const stationApiPath = `/api/v1/station/:${id}`

	const loadStation = () => {
		fetchData(stationApiPath, setStation)
	}

	useEffect(loadStation, [])
	const stationListItem = station.map((map) => {
		return (
			<li>
				<h2>
					{map.name} {map.network} {map.address} {map.state} {map.lineName}
				</h2>
			</li>
		)
	})
	return (
		<ul>
			{stationListItem}
			{/* <Station /> */}
		</ul>
	)
}

export default StationContainer

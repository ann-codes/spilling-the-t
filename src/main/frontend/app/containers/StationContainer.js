import React, { useState, useEffect } from "react"
import fetchData from "../functions/fetchData"
import Station from "../components/Station"
import { Link } from "react-router-dom"

const StationContainer = (props) => {
	const [stations, setStations] = useState([])
	const [loading, setLoading] = useState(false)

	const stationApiPath = "/api/v1/stations/all"

	const loadStations = () => {
		fetchData(stationApiPath, setStations)
	}

	useEffect(loadStations, [])
	const stationsListItems = stations.map((map) => {
		return (
			<li>
				{/* //how to show ind station, not sure */}
				<Link to={`/station/:${map.id}`}>
					<h2>
						{map.name} {map.network} {map.address} {map.state}
					</h2>
				</Link>
			</li>
		)
	})
	return (
		<ul>
			{stationsListItems}
			{/* <Station /> */}
		</ul>
	)
}

export default StationContainer

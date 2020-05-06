import React, { useState, useEffect } from "react"
import fetchData from "../functions/fetchData"
import { Link } from "react-router"
import ReactDom from "react-dom"

const Station = (props) => {
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
				<Link to="/api/v1/station/{id}">
					<h2>
						{map.name} {map.network} {map.address} {map.state}
					</h2>
				</Link>
			</li>
		)
	})
	return <ul>{stationsListItems}</ul>
}

export default Station

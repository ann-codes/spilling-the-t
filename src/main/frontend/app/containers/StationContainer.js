import React, { useState, useEffect } from "react"
import fetchData from "../functions/fetchData"
import Station from "../components/Station"

const StationContainer = (props) => {
	const [stations, setStations] = useState([])
	const byStation = props.match.params.name

	const stationApiPath = "/api/v1/stations/all"

	const loadStations = () => {
		fetchData(stationApiPath, setStations)
	}

	useEffect(loadStations, [])
	console.log(stations)

	const stationsListItems = stations.map((map) => {
		return (
			<Station
				key={map.id}
				id={map.id}
				network={map.network}
				name={map.name}
				lineName={map.lineName}
				imageUrl={map.imageUrl}
			/>
		)
	})
	console.log(stationsListItems)
	return (
		<h1>
			Hey this is Jasen <Station />
		</h1>
	) //  { stationsListItems }
}

export default StationContainer

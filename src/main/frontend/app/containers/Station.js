import React, { useState, useEffect } from "react"
import fetchData from "../functions/fetchData"
import ReactDom from "react-dom"

const Station = (props) => {
	const [stations, setStations] = useState([])
	const [loading, setLoading] = useState(false)

	const stationApiPath = "/api/v1/stations/all"

	const loadStations = () => {
		fetchData(stationApiPath, setStations)
	}
	//
	//   fetch ("api/v1/stations").then((resp)=>{
	//     if(resp.ok){
	//       return resp
	//     }
	//     else{
	//       throw new Error(resp.Error)
	//     }
	//   }).then(resp => {
	//     return resp.json();
	//   }).then(body => {
	//     setStations(body)
	//     setLoading(false)
	//   })
	// }
	useEffect(loadStations, [])
	console.log(stations)
	const stationsListItems = stations.map((map, index) => {
		return (
			<li>
				<h2>
					{map.name} {map.network} {map.address} {map.state}
				</h2>
			</li>
		)
	})
	return <ul>{stationsListItems}</ul>
}

export default Station

<<<<<<< HEAD
import React, { useState, useEffect } from "react"
import fetchData from "../functions/fetchData"
import { Link } from "react-router"
import ReactDom from "react-dom"
=======
import React, { useState, useEffect } from "react";
import fetchData from "../functions/fetchData";
import ReactDom from "react-dom";
>>>>>>> 67c9cdc22a2366a14305d7ab0ba2b0aa3c99c753

const Station = (props) => {
  const [stations, setStations] = useState([]);
  const [loading, setLoading] = useState(false);

  const stationApiPath = "/api/v1/stations/all";

  const loadStations = () => {
    fetchData(stationApiPath, setStations);
  };

<<<<<<< HEAD
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
=======
  useEffect(loadStations, []);
  console.log(stations);
  const stationsListItems = stations.map((map, index) => {
    return (
      <li>
        <h2>
          {map.name} {map.network} {map.address} {map.state}
        </h2>
      </li>
    );
  });
  return <ul>{stationsListItems}</ul>;
};
>>>>>>> 67c9cdc22a2366a14305d7ab0ba2b0aa3c99c753

export default Station;

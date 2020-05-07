import React, { useState, useEffect } from "react";
import fetchData from "../functions/fetchData";

const Station = (props) => {
  const [stations, setStations] = useState([]);
  const [loading, setLoading] = useState(false);

  const stationApiPath = "/api/v1/stations/all";

  const loadStations = () => {
    fetchData(stationApiPath, setStations);
  };

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

export default Station;

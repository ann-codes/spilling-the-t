import React, { useState, useEffect } from "react";
import fetchData from "../functions/fetchData";
import StationCard from "../components/StationCard";

const StationContainer = (props) => {
  const [stations, setStations] = useState([]);

  const stationApiPath = "/api/v1/stations/all";

  const loadStations = () => {
    fetchData(stationApiPath, setStations);
  };

  useEffect(loadStations, []);

  const stationsListItems = stations.map((map) => {
    return (
      <StationCard
        key={map.id}
        id={map.id}
        network={map.network}
        name={map.name}
        lineName={map.lineName}
        imageUrl={map.imageUrl}
      />
    );
  });

  return <h1>{stationsListItems}</h1>;
};

export default StationContainer;
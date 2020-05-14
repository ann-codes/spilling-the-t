import React, { useState, useEffect, Fragment } from "react";
import fetchData from "../functions/fetchData";
import StationCard from "../components/StationCard";

const StationContainer = (props) => {
  const [stations, setStations] = useState([]);
  const stationApiPath = "/api/v1/stations/all";
  const loadStations = () => fetchData(stationApiPath, setStations);
  useEffect(loadStations, []);

  let stationsListItems = <p>LOADING... </p>;

  if (stations[0] !== undefined) {
    stationsListItems = stations.map((station) => (
      <StationCard key={station.id} station={station} />
    ));
  }

  return (
    <Fragment>
      <h1 className="section-h align-center">Explore the Stations</h1>
      {stationsListItems}
    </Fragment>
  );
};

export default StationContainer;

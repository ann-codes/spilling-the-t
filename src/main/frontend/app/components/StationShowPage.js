import React, { useState, useEffect } from "react";
import StationInfo from "./StationInfo";
import NotFound404 from "./NotFound404";
import fetchData from "../functions/fetchData";

const StationShowPage = (props) => {
  const [station, setStation] = useState({});
  const currentStationId = Number(props.match.params.id);
  const apiEndpoint = `/api/v1/station/${currentStationId}`;
  const fetchStation = () => fetchData(apiEndpoint, setStation);
  useEffect(fetchStation, {});

  if (station === null) {
    return <NotFound404 />;
  } else {
    return <StationInfo station={station} />;
  }
};

export default StationShowPage;

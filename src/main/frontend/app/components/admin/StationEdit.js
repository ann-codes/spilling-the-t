import React, { useState, useEffect } from "react";
import fetchData from "../../functions/fetchData";
import StationEditForm from "./StationEditForm";

const StationEdit = (props) => {
  const [station, setStation] = useState({});
  const stationId = Number(props.match.params.id);

  const apiGetEndpoint = `/api/v1/station/${stationId}`;
  const fetchStation = () => fetchData(apiGetEndpoint, setStation);
  useEffect(fetchStation, {});

  if (Object.entries(station).length > 0) {
    return (
      <div className="callout">
        <StationEditForm stationToEdit={station} />
      </div>
    );
  } else {
    return <h2 className="align-center">LOADING...</h2>;
  }
};

export default StationEdit;

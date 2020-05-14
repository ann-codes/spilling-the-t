import React, { useState, useEffect } from "react";
import fetchData from "../../functions/fetchData";
import putData from "../../functions/putData";
import deleteData from "../../functions/deleteData";
import StationsTableHeading from "./StationsTableHeading";
import StationsTableRows from "./StationsTableRows";

const ManageStations = (props) => {
  const [stations, setStations] = useState([]);
  const [appDecision, setAppDecision] = useState({});

  const stationsGetApi = "/api/v1/stations/all";
  const decisionPutApi = "/api/v1/admin/station";
  const deleteApiEndpoint = "/api/v1/admin/station/delete";

  const fetchStations = () => fetchData(stationsGetApi, setStations);
  useEffect(fetchStations, []);

  const handleChange = (event) => {
    const { name, value, id } = event.currentTarget;
    setAppDecision({
      ...appDecision,
      [name]: value,
      id: Number(id),
    });
  };

  const submitDecision = (event) => {
    const matchId = Number(event.target.getAttribute("data-check-id"));

    if (appDecision.id === matchId) {
      const foundStation = stations.find((station) => station.id === matchId);
      if (appDecision.admin_status === "true") {
        const payloadApproved = {
          ...foundStation,
          adminApproved: true,
        };
        putData(`${decisionPutApi}/${matchId}/approved`, payloadApproved);
      } else if (appDecision.admin_status === "false") {
        const payloadApproved = {
          ...foundStation,
          adminApproved: false,
        };
        putData(`${decisionPutApi}/${matchId}/notapproved`, payloadApproved);
      }
    }
  };

  const deleteOnSubmit = (event) => {
    const matchId = Number(event.target.getAttribute("data-check-id"));
    const stationToDelete = stations.find((app) => app.id === matchId);
    deleteData(`${deleteApiEndpoint}/${matchId}`, stationToDelete);
  };

  const mapStations = stations.map((station) => (
    <StationsTableRows
      key={station.id}
      station={station}
      handleChange={handleChange}
      submitDecision={submitDecision}
      deleteOnSubmit={deleteOnSubmit}
    />
  ));

  return (
    <div>
      <h3 className="section-h align-center">Manage Stations</h3>
      <table className="hover">
        <StationsTableHeading />
        <tbody>{mapStations}</tbody>
      </table>
    </div>
  );
};

export default ManageStations;

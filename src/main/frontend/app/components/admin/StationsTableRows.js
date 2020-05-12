import React from "react";
import { Link } from "react-router-dom";

const StationsTableRows = (props) => {
  return (
    <tr>
      <td>{props.station.id}</td>
      <td>
        <Link to={`/station/${props.station.id}`} target="_blank">
          {props.station.name}
        </Link>
      </td>
      <td>{props.station.lineName}</td>
      <td>{props.station.network}</td>
      <td>{props.station.city}</td>
      <td>{props.station.state}</td>
      <td>{props.station.adminApproved ? "Approved" : "Not Approved"}</td>
      <td>
        <form onSubmit={props.submitDecision} data-check-id={props.station.id}>
          <select
            className="dropdown-width-adj"
            name="admin_status"
            id={props.station.id}
            onChange={props.handleChange}
          >
            <option>-</option>
            <option value="true">Approved</option>
            <option value="false">Not Approved</option>
          </select>
          <br />
          <input className="button" type="submit" value="Update Decision" />
        </form>
      </td>
      <td>
        <Link
          className="button success"
          data-check-id={props.station.id}
          to={`/edit/station/${props.station.id}`}
        >
          Edit Station
        </Link>
        <form onSubmit={props.deleteOnSubmit} data-check-id={props.station.id}>
          <input
            className="button alert button-margin-top"
            type="submit"
            value="Delete Station"
          />
        </form>
      </td>
    </tr>
  );
};

export default StationsTableRows;

import React, { useState, Fragment } from "react";
import ErrorList from "../ErrorList";
import validateForm from "../../functions/validateForm";
import putData from "../../functions/putData";

const StationEditForm = (props) => {
  const [editStation, setEditStation] = useState(props.stationToEdit);
  const [updatedNotice, setUpdatedNotice] = useState(false);
  const [errors, setErrors] = useState({});

  setTimeout(() => setUpdatedNotice(false), 6000);

  const putApiPath = `/api/v1/edit/station/${editStation.id}`;

  const clearForm = () =>
    setEditStation({
      network: "",
      lineName: "",
      name: "",
      address: "",
      city: "",
      zip: "",
      state: "",
      country: "",
      imageUrl: "",
      description: "",
      calculatedCost: "",
    });

  const handleChange = (event) => {
    const { name, value } = event.currentTarget;
    setEditStation({ ...editStation, [name]: value });
  };

  const onEditSubmit = () => {
    event.preventDefault();
    if (
      validateForm(
        [
          "network",
          "lineName",
          "name",
          "address",
          "city",
          "zip",
          "state",
          "country",
          "imageUrl",
          "description",
        ],
        editStation,
        setErrors
      )
    ) {
      putData(putApiPath, editStation);
      setUpdatedNotice(true);
    }
  };

  return (
    <Fragment>
      <h2>
        Editing {editStation.name} Station (#{editStation.id})
      </h2>

      <form onSubmit={onEditSubmit}>
        <ErrorList errors={errors} />
        {updatedNotice && (
          <h5 className="fade-out callout success">Update Successful</h5>
        )}

        <label>Transit Network</label>
        <input
          name="network"
          id="network"
          type="text"
          value={editStation.network}
          onChange={handleChange}
        />
        <br />
        <label>Transit Line Name</label>
        <input
          name="lineName"
          id="lineName"
          type="text"
          value={editStation.lineName}
          onChange={handleChange}
        />
        <br />
        <label>Station Name</label>
        <input
          name="name"
          id="name"
          type="text"
          value={editStation.name}
          onChange={handleChange}
        />
        <br />
        <label>Address</label>
        <input
          name="address"
          id="address"
          type="text"
          value={editStation.address}
          onChange={handleChange}
        />
        <br />
        <label>City</label>
        <input
          name="city"
          id="city"
          type="text"
          value={editStation.city}
          onChange={handleChange}
        />
        <br />
        <label>State/Province</label>
        <input
          name="state"
          id="state"
          type="text"
          value={editStation.state}
          onChange={handleChange}
        />
        <br />
        <label>Zip Code</label>
        <input
          name="zip"
          id="zip"
          type="text"
          value={editStation.zip}
          onChange={handleChange}
        />
        <br />
        <label>Country</label>
        <input
          name="country"
          id="country"
          type="text"
          value={editStation.country}
          onChange={handleChange}
        />
        <br />
        <label>Description</label>
        <input
          name="description"
          id="description"
          type="text"
          value={editStation.description}
          onChange={handleChange}
        />
        <br />
        <label>Fare Cost Calculation Method</label>
        <label>
          <input
            type="radio"
            name="calculatedCost"
            id="calculatedCost"
            value="perRide"
            checked={editStation.calculatedCost === "perRide"}
            onChange={handleChange}
          />
          Per Ride
        </label>
        <label>
          <input
            type="radio"
            name="calculatedCost"
            id="calculatedCost"
            value="byDistance"
            checked={editStation.calculatedCost === "byDistance"}
            onChange={handleChange}
          />
          By Distance
        </label>
        <br />
        <label>Station Photo URL</label>
        <input
          name="imageUrl"
          id="imageUrl"
          type="text"
          value={editStation.imageUrl}
          onChange={handleChange}
        />
        <br />
        <input
          type="submit"
          className="button secondary large"
          value="Update Station"
        />
        <button
          type="button"
          className="button secondary large button-margin-left"
          onClick={clearForm}
        >
          Clear
        </button>
      </form>
    </Fragment>
  );
};

export default StationEditForm;

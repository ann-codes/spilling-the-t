import React, { useState } from "react";
import ErrorList from "./ErrorList";
import validateForm from "../functions/validateForm";

const NewStationForm = (props) => {
  const defaultForm = {
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
  };

  const [form, setForm] = useState(defaultForm);
  const [errors, setErrors] = useState({});

  const clearForm = () => setForm(defaultForm);

  const handleChange = (event) => {
    setForm({
      ...form,
      [event.currentTarget.id]: event.currentTarget.value,
    });
  };

  const handleSubmit = (event) => {
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
        form,
        setErrors
      )
    ) {
      const formPayload = {
        network: form.network,
        lineName: form.lineName,
        name: form.name,
        address: form.address,
        city: form.city,
        zip: form.zip,
        state: form.state,
        country: form.country,
        imageUrl: form.imageUrl,
        description: form.description,
        calculatedCost: form.calculatedCost,
        adminApproved: false,
      };
      props.addNewStation(formPayload);
      setForm(defaultForm);
    }
  };
  return (
    <form onSubmit={handleSubmit}>
      <h2>Hello From the New Station Form</h2>
      <ErrorList errors={errors} />
      <label>Transit Network</label>
      <input
        name="network"
        id="network"
        type="text"
        value={form.network}
        onChange={handleChange}
      />
      <br />
      <label>Transit Line Name</label>
      <input
        name="lineName"
        id="lineName"
        type="text"
        value={form.lineName}
        onChange={handleChange}
      />
      <br />
      <label>Station Name</label>
      <input
        name="name"
        id="name"
        type="text"
        value={form.name}
        onChange={handleChange}
      />
      <br />
      <label>Address</label>
      <input
        name="address"
        id="address"
        type="text"
        value={form.address}
        onChange={handleChange}
      />
      <br />
      <label>City</label>
      <input
        name="city"
        id="city"
        type="text"
        value={form.city}
        onChange={handleChange}
      />
      <br />
      <label>State/Province</label>
      <input
        name="state"
        id="state"
        type="text"
        value={form.state}
        onChange={handleChange}
      />
      <br />
      <label>Zip Code</label>
      <input
        name="zip"
        id="zip"
        type="text"
        value={form.zip}
        onChange={handleChange}
      />
      <br />
      <label>Country</label>
      <input
        name="country"
        id="country"
        type="text"
        value={form.country}
        onChange={handleChange}
      />
      <br />
      <label>Description</label>
      <input
        name="description"
        id="description"
        type="text"
        value={form.description}
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
          checked={form.calculatedCost === "perRide"}
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
          checked={form.calculatedCost === "byDistance"}
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
        value={form.imageUrl}
        onChange={handleChange}
      />
      <br />
      <input type="submit" className="button" />
      <button type="button" className="button" onClick={clearForm}>
        Clear
      </button>
    </form>
  );
};

export default NewStationForm;

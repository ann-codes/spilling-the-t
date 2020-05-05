import React, { useState } from "react";
import ErrorList from "./ErrorList";

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
    const formPayload = {
      network: form.network,
      lineName: form.lineName,
      name: form.name,
      address: form.address,
      city: form.city,
      zip: form.zup,
      state: form.state,
      country: form.country,
      imageUrl: form.imageUrl,
      description: form.description,
      calculatedCost: form.calculatedCost,
      adminApproved: false,
    };
    props.addNewStation(formPayload);
    setForm(defaultForm);
  };
  return (
    <form onSubmit={handleSubmit}>
      <h1>Hello From the New Station Form</h1>
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
      <div onChange={handleChange}>
        <input type="radio" value="perRide" name="calculatedCost" />
        Per Ride
        <input type="radio" value="byDistance" name="calculatedCost" />
        By Distance
      </div>
      <br />
      <label>Station Photo URL</label>
      <input
        name="imgUrl"
        id="imgUrl"
        type="text"
        value={form.imageUrl}
        onChange={handleChange}
      />
      <br />
      <input type="submit" />
      <button type="button" onClick={clearForm}>Clear</button>
    </form>
  );
};

export default NewStationForm;

import React, { useState, useEffect } from "react";
import ErrorList from "./ErrorList";
import fetchData from "../functions/fetchData";

const NewReviewForm = (props) => {
  const defaultForm = {
    title: "",
    date: "",
    review: "",
    cleanliness: "",
    onTime: "",
    capacity: "",
    overallRating: "",
    station: "",
    user: "",
  };

  const [form, setForm] = useState(defaultForm);
  const [errors, setErrors] = useState([]);

  const clearForm = () => setForm(defaultForm);

  const [stations, setStations] = useState([]);
  const apiStationsEndpoint = "/api/v1/stations/all";
  const fetchStations = () => fetchData(apiStationsEndpoint, setStations);
  useEffect(fetchStations, []);
  let listStations;
  if (stations !== undefined) {
    listStations = stations.map((station) => (
      <option key={station.id} type="text" value={station.name}>
        {station.name}
      </option>
    ));
  }

  const [users, setUsers] = useState([]);
  const apiUsersEndpoint = "/api/v1/users/all";
  const fetchUsers = () => fetchData(apiUsersEndpoint, setUsers);
  useEffect(fetchUsers, []);
  let listUsers;
  if (users !== undefined) {
    listUsers = users.map((user) => (
      <option key={user.id} type="text" value={user.username}>
        {user.username}
      </option>
    ));
  }

  const handleChange = (event) => {
    setForm({
      ...form,
      [event.currentTarget.id]: event.currentTarget.value,
    });
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    const formPayload = {
      title: form.title,
      date: form.date,
      review: form.review,
      cleanliness: parseInt(form.cleanliness),
      onTime: parseInt(form.onTime),
      capacity: parseInt(form.capacity),
      overallRating: parseInt(form.overallRating),
      station: {
        ...stations.find((station) => station.name === form.station),
      },
      user: {
        ...users.find((user) => user.username === form.user),
      },
    };
    props.addNewReview(formPayload);
    setForm(defaultForm);
  };

  return (
    <form className="box" onSubmit={handleSubmit}>
      <h2>Submit a New Review</h2>
      <ErrorList errors={errors} />
      <label>Title</label>
      <input
        name="title"
        id="title"
        type="text"
        value={form.title}
        onChange={handleChange}
      />
      <label>Date</label>
      <input
        type="date"
        id="date"
        name="date"
        value={form.date}
        onChange={handleChange}
      />
      <label>Review</label>
      <input
        name="review"
        id="review"
        type="text"
        value={form.review}
        onChange={handleChange}
      />
      <label>Cleanliness Rating</label>
      <select
        name="cleanliness"
        id="cleanliness"
        value={form.cleanliness}
        onChange={handleChange}
        required
      >
        <option type="text" value="">
          -
        </option>
        <option type="number" value="1">
          1
        </option>
        <option type="number" value="2">
          2
        </option>
        <option type="number" value="3">
          3
        </option>
        <option type="number" value="4">
          4
        </option>
        <option type="number" value="5">
          5
        </option>
      </select>
      <label>On-Time Rating</label>
      <select
        name="onTime"
        id="onTime"
        value={form.onTime}
        onChange={handleChange}
        required
      >
        <option type="text" value="">
          -
        </option>
        <option type="number" value="1">
          1
        </option>
        <option type="number" value="2">
          2
        </option>
        <option type="number" value="3">
          3
        </option>
        <option type="number" value="4">
          4
        </option>
        <option type="number" value="5">
          5
        </option>
      </select>
      <label>Capacity Rating</label>
      <select
        name="capacity"
        id="capacity"
        value={form.capacity}
        onChange={handleChange}
        required
      >
        <option type="text" value="">
          -
        </option>
        <option type="number" value="1">
          1
        </option>
        <option type="number" value="2">
          2
        </option>
        <option type="number" value="3">
          3
        </option>
        <option type="number" value="4">
          4
        </option>
        <option type="number" value="5">
          5
        </option>
      </select>
      <label>Overall Rating</label>
      <select
        name="overallRating"
        id="overallRating"
        value={form.overallRating}
        onChange={handleChange}
        required
      >
        <option type="text" value="">
          -
        </option>
        <option type="number" value="1">
          1
        </option>
        <option type="number" value="2">
          2
        </option>
        <option type="number" value="3">
          3
        </option>
        <option type="number" value="4">
          4
        </option>
        <option type="number" value="5">
          5
        </option>
      </select>
      <label>Station</label>
      <select
        name="station"
        id="station"
        value={form.station}
        onChange={handleChange}
        required
      >
        <option type="text" value="">
          -
        </option>
        {listStations}
      </select>
      <label>Post Review As</label>
      <select
        name="user"
        id="user"
        value={form.user}
        onChange={handleChange}
        required
      >
        <option type="text" value="">
          -
        </option>
        {listUsers}
      </select>
      <input type="submit" className="button secondary large" />
      <button
        type="button"
        className="button secondary large button-margin-left"
        onClick={clearForm}
      >
        Clear
      </button>
    </form>
  );
};

export default NewReviewForm;

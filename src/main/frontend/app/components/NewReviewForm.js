import React, { useState } from "react";
import ErrorList from "./ErrorList";
import validateForm from "../functions/validateForm";

const NewReviewForm = (props) => {
  const defaultForm = {
    title: "",
    date: "",
    review: "",
    cleanliness: "",
    onTime: "",
    capacity: "",
    overallRating: "",
    stationId: "",
    userId: "",
  };

  const [form, setForm] = useState([defaultForm]);
  const [errors, setErrors] = useState([]);

  const clearForm = () => setForm(defaultForm);

  const handleChange = (event) => {
    setForm({
      ...form,
      [event.currentTarget.id]: event.currentTarget.value,
    });
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    if (validateForm(["title", "review"], form, setErrors)) {
      const formPayload = {
        title: form.title,
        date: form.date,
        review: form.review,
        cleanliness: form.cleanliness,
        onTime: form.onTime,
        capacity: form.capacity,
        overallRating: form.overallRating,
        stationId: form.stationId,
        userId: form.userId,
      };
      props.addNewReview(formPayload);
      setForm(defaultForm);
    }
  };
  return (
    <form onSubmit={handleSubmit}>
      <h2>Hello From the New Review Form</h2>
      <ErrorList errors={errors} />
      <label>Title</label>
      <input
        name="title"
        id="title"
        type="text"
        value={form.title}
        onChange={handleChange}
      />
      <br />
      <label>Date</label>
      <input type="date" id="date" name="date" value={form.date} />
      <br />
      <label>Review</label>
      <input
        name="review"
        id="review"
        type="text"
        value={form.review}
        onChange={handleChange}
      />
      <br />
      <label>Cleanliness Rating</label>
      <input
        type="range"
        id="cleanliness"
        min="1"
        value={form.cleanliness}
        max="5"
        step="1"
      />
      <label>On-Time Rating</label>
      <input
        type="range"
        id="onTime"
        min="1"
        value={form.onTime}
        max="5"
        step="1"
      />
      <label>Capacity Rating</label>
      <input
        type="range"
        id="capacity"
        min="1"
        value={form.capacity}
        max="5"
        step="1"
      />
      <label>Overall Rating</label>
      <input
        type="range"
        id="overallRating"
        min="1"
        value={form.overallRating}
        max="5"
        step="1"
      />
    </form>
  );
};

export default NewReviewForm;

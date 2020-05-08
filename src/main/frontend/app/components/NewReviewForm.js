import React, { useState } from "react";
import ErrorList from "./ErrorList";
import validateForm from "../functions/validateForm";
import logo from "./logo.svg";
import "bootstrap/dist/css/bootstrap.min.css";
import Icon from "./Icons";
import { Form, Input, FormGroup, Container, Label } from "reactstrap";
import "react-dates/initialize";
import "react-dates/lib/css/_datepicker.css";
import { SingleDatePicker } from "react-dates";

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
      <label>Review Title</label>
      <input
        name="title"
        id="title"
        type="text"
        value={form.title}
        onChange={handleChange}
      />
      <br />
      <label>Date</label>
      <SingleDatePicker
        // showClearDate={true}
        customInputIcon={
          <svg className="icon icon-small">
            <Icon icon="ICON_CALENDER" className="icon icon-large" />
          </svg>
        }
        inputIconPosition="after"
        small={true}
        block={false}
        numberOfMonths={1}
        date={this.state.date}
        onDateChange={(date) => this.handleDateChange(date)}
        focused={this.state.focused}
        onFocusChange={({ focused }) => this.setState({ focused })}
        openDirection="up"
        hideKeyboardShortcutsPanel={true}
      />
      <br />
    </form>
  );
};

export default NewReviewForm;
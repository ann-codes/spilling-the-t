import React, { useState, useEffect } from "react";
import ErrorList from "./ErrorList";
import validateForm from "../functions/validateForm";

const NewUserForm = (props) => {
  const defaultValues = {
    username: "",
    password: "",
    email: "",
    firstName: "",
    lastName: "",
    location: "",
    imageUrl: "",
  };

  const [userForm, setUserForm] = useState(defaultValues);
  const [errors, setErrors] = useState({});

  const clearForm = () => setUserForm(defaultValues);

  const handleChange = (event) => {
    setUserForm({
      ...userForm,
      [event.currentTarget.id]: event.currentTarget.value,
    });
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    if (
      validateForm(
        [
          "username",
          "password",
          "email",
          "firstName",
          "lastName",
          "location",
          "imageUrl",
        ],
        userForm,
        setErrors
      ) &&
      Object.entries(errors).length == 0
    ) {
      props.addNewUser(userForm);
      setUserForm(defaultValues);
    }
  };

  return (
    <form className="callout" onSubmit={handleSubmit}>
      <h2>Create a New Account</h2>
      <ErrorList errors={errors} />
      <label>Username</label>
      <input
        name="username"
        id="username"
        type="text"
        value={userForm.username}
        onChange={handleChange}
      />
      <br />
      <label>Password</label>
      <input
        name="password"
        id="password"
        type="password"
        value={userForm.password}
        onChange={handleChange}
      />
      <br />
      <label>Your Email</label>
      <input
        name="email"
        id="email"
        type="email"
        value={userForm.email}
        onChange={handleChange}
      />
      <br />
      <label>Your First Name</label>
      <input
        name="firstName"
        id="firstName"
        type="text"
        value={userForm.firstName}
        onChange={handleChange}
      />
      <br />
      <label>Your Last Name</label>
      <input
        name="lastName"
        id="lastName"
        type="text"
        value={userForm.lastName}
        onChange={handleChange}
      />
      <br />
      <label>Your Location</label>
      <input
        name="location"
        id="location"
        type="text"
        value={userForm.location}
        onChange={handleChange}
      />
      <br />
      <label>Profile Photo URL</label>
      <input
        name="imageUrl"
        id="imageUrl"
        type="text"
        value={userForm.imageUrl}
        onChange={handleChange}
      />
      <br />
      <input
        type="submit"
        className="button secondary large"
        value="Create Account"
      />
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

export default NewUserForm;

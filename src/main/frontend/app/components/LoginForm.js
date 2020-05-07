import React, { useState, useEffect } from "react";
import ErrorList from "./ErrorList";
import authenticateForm from "../functions/authenticateForm";

const LoginForm = (props) => {
  const [loginForm, setLoginForm] = useState({ username: "", password: "" });
  const [errors, setErrors] = useState({});
  const [userAuth, setUserAuth] = useState({});

  const handleChange = (event) => {
    setLoginForm({
      ...loginForm,
      [event.currentTarget.id]: event.currentTarget.value,
    });
  };

  const handleSubmit = (event) => {
    event.preventDefault();

    let isValid = authenticateForm(
      ["username", "password"],
      loginForm,
      setUserAuth,
      setErrors
    );
    let hasErrors = errors.length == 0

    console.log("isValid", isValid);
    console.log("has errors, ", errors.length == 0);

    if (isValid && hasErrors) {
      console.log("VALID"); // =======
      setLoginForm({ username: "", password: "" });
    } else {
      console.log("NOT VALID", loginForm); // =======
    }
  };

  console.log("user ", userAuth); // =======

  if (Object.entries(userAuth).length > 1) {
    console.log("FOUND");
  }

  return (
    <form onSubmit={handleSubmit}>
      <ErrorList errors={errors} />
      <h2>Login</h2>
      <label>Username</label>
      <input
        name="username"
        id="username"
        type="text"
        value={loginForm.username}
        onChange={handleChange}
      />
      <br />
      <label>Password</label>
      <input
        name="password"
        id="password"
        type="password"
        value={loginForm.password}
        onChange={handleChange}
      />
      <input type="submit" className="button" />
    </form>
  );
};

export default LoginForm;

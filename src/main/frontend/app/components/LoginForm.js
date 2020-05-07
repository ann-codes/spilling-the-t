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
    if (
      authenticateForm(
        ["username", "password"],
        loginForm,
        setUserAuth,
        setErrors
      ) &&
      errors.length == 0
    ) {
      console.log("VALID"); // =======
      setLoginForm({ username: "", password: "" });
    }
    console.log(loginForm); // =======
  };

  console.log("user ", userAuth); // =======
  console.log("check size, ", Object.entries(userAuth).length); // =======

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

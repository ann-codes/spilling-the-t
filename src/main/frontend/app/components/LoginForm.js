import React, { useState, useEffect } from "react";
import ErrorList from "./ErrorList";
import validateLoginForm from "../functions/validateLoginForm";

const LoginForm = (props) => {
  const loginForm = props.loginForm;

  const handleChange = (event) => {
    props.setLoginForm({
      ...loginForm,
      [event.currentTarget.id]: event.currentTarget.value,
    });
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    if (
      validateLoginForm(["username", "password"], loginForm, props.setErrors)
    ) {
      props.authOnSubmit(loginForm);
    }
  };

  return (
    <form className="box" onSubmit={handleSubmit}>
      <ErrorList errors={props.errors} />
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
      <input type="submit" className="button secondary large" value="Login" />
    </form>
  );
};

export default LoginForm;

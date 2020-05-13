import React, { useState, useEffect } from "react";
import { useCookies } from "react-cookie";
import ErrorList from "./ErrorList";
import authenticateForm from "../functions/authenticateForm";

const LoginForm = (props) => {
  const [loginForm, setLoginForm] = useState({ username: "", password: "" });
  const [errors, setErrors] = useState({});
  const [userFound, setUserFound] = useState({});
  const [cookies, setCookie] = useCookies(["SPTlogin"]);

  const handleChange = (event) => {
    setLoginForm({
      ...loginForm,
      [event.currentTarget.id]: event.currentTarget.value,
    });
  };

  const handleSubmit = (event) => {
    event.preventDefault();

    let isAuthed = Object.entries(userFound).length > 1;
    let isValid = authenticateForm(
      ["username", "password"],
      loginForm,
      setUserFound,
      setErrors
    );
    let noErrors = Object.entries(errors).length === 0;

    if (isValid) {
      if (
        loginForm.username.length >= 1 &&
        loginForm.password.length >= 1 &&
        /^[a-zA-Z0-9_]*$/.test(loginForm.username)
      ) {

        const apiAuth = `/api/v1/auth/${loginForm.username}/${loginForm.password}`;

        const fetchAuth = fetch(apiAuth, {
          headers: {
            "Content-Type": "application/json",
            credentials: "same-origin",
          },
        })
          .then((response) => {
            if (response.ok) {
              return response;
            } else {
              throw new Error(`${response.status} (${response.statusText})`);
            }
          })
          .then((response) => response.json())
          .then((body) => {
            if (body.length === 0) {
              setErrors({
                ...errors,
                ["password"]: "and username combination does not match",
              });
            } else if (body.length > 0) {
              setUserFound(body[0]);
              setCookie("SPTlogin", body[0], { path: "/" });
            }
          })
          .catch((error) => console.error(`Error in fetch: ${error.message}`));

        useEffect(fetchAuth, []);
      }
    }

  };

  return (
    <form className="box" onSubmit={handleSubmit}>
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
      <input type="submit" className="button secondary large" value="Login" />
    </form>
  );
};

export default LoginForm;

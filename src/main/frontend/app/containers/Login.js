import React, { useState, useEffect, Fragment } from "react";
import { Link } from "react-router-dom";
import { useCookies } from "react-cookie";
import LoginForm from "../components/LoginForm";

const Login = (props) => {
  const [cookies, setCookie] = useCookies(["SPTlogin"]);
  const [loginForm, setLoginForm] = useState({ username: "", password: "" });
  const [errors, setErrors] = useState({});
  const cookieExist = cookies.SPTlogin !== undefined;
  let username = "";

  if (cookieExist) {
    username = <span> as {cookies.SPTlogin.username}</span>;
  }

  const authOnSubmit = (payload) => {
    return fetch(`/api/v1/auth/${payload.username}/${payload.password}`, {
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
        if (body.length > 0) {
          setCookie("SPTlogin", body[0], { path: "/" });
        }
        if (body.length === 0) {
          setErrors({
            ...errors,
            ["password"]: "and username combination does not match",
          });
        }
      })
      .catch((error) => console.error(`Error in fetch: ${error.message}`));
  };

  return (
    <Fragment>
      {!cookieExist ? (
        <Fragment>
          <LoginForm
            loginForm={loginForm}
            errors={errors}
            setErrors={setErrors}
            setLoginForm={setLoginForm}
            authOnSubmit={authOnSubmit}
          />
          <div className="box">
            <p>Don't have an account?</p>
            <h2>Create New Account</h2>
            <Link className="button secondary large" to={`/users/new`}>
              Register
            </Link>
          </div>
        </Fragment>
      ) : (
        <div className="box">
          <h1>You are now logged in{username}</h1>
        </div>
      )}
    </Fragment>
  );
};

export default Login;

import React, { useState } from "react";
import ErrorList from "../../components/ErrorList";

const FakeLogin = (props) => {
  const [loginForm, setLoginForm] = useState({ username: "", password: "" });
  const [errors, setErrors] = useState({});

  const handleChange = (event) => {
    setLoginForm({
      ...loginForm,
      [event.currentTarget.id]: event.currentTarget.value,
    });
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    console.log(loginForm);
    if (loginForm.username === "admin" && loginForm.password === "password") {
      props.setLoggedIn(true);
      setErrors({});
    } else {
      setErrors({
        ["Administrator login"]: "is incorrect!",
      });
    }
  };

  return (
    <div className="box margin-top2">
      <form onSubmit={handleSubmit}>
        <h2>Admin Login</h2>
        <ErrorList errors={errors} />
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
    </div>
  );
};

export default FakeLogin;

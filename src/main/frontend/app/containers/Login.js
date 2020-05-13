import React, { useState, useEffect, Fragment } from "react";
import LoginForm from "../components/LoginForm";
import postData from "../functions/postData";

const Login = (props) => {
  const [loggedIn, setLoggedIn] = useState(false);
  
  return (
    <Fragment>
      {!loggedIn ? <LoginForm setLoggedIn={setLoggedIn} /> : <p>Logged in</p>}
    </Fragment>
  );
};

export default Login;

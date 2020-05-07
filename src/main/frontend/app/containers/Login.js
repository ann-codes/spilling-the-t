import React, { useState, useEffect, Fragment } from "react";
import LoginForm from "../components/LoginForm";
import postData from "../functions/postData";

const Login = (props) => {
  const [loggedIn, setLoggedIn] = useState(false);

//   if (!loggedIn) {
//     return;
//   } else {
//     return <p>Thanks for logging in!</p>;
//   }

  return (
    <Fragment>
      {!loggedIn ? <LoginForm setLoggedIn={setLoggedIn} /> : <p>Logged in</p>}
    </Fragment>
  );
};

export default Login;

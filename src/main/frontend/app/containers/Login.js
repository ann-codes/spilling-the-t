import React, { Fragment } from "react";
import { useCookies } from "react-cookie";
import LoginForm from "../components/LoginForm";

const Login = (props) => {
  const [cookies, setCookie, removeCookie] = useCookies(["SPTlogin"]);
  const cookieExist = cookies.SPTlogin !== undefined;
  let username = "";

  if (cookieExist) {
    username = <span> as {cookies.SPTlogin.username}</span>;
  }

  return (
    <Fragment>
      {!cookieExist ? (
        <LoginForm />
      ) : (
        <div className="box">
          <h1>You are now logged in{username}</h1>
        </div>
      )}
    </Fragment>
  );
};

export default Login;

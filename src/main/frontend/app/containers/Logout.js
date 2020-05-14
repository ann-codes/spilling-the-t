import React from "react";
import { useCookies } from "react-cookie";

const Logout = (props) => {
  const [cookies, setCookie, removeCookie] = useCookies(["SPTlogin"]);
  removeCookie("SPTlogin", { path: "/", maxAge: 0 });
  const cookieExist = cookies.SPTlogin !== undefined;
  let logoutNotice = <h1>Logging out...</h1>;

  if (cookieExist) {
    logoutNotice = <h1>Logging out as {cookies.SPTlogin.username}</h1>;
  } else {
    logoutNotice = <h1>You are logged out</h1>;
  }

  return <div className="box">{logoutNotice}</div>;
};

export default Logout;

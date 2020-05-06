import React from "react";
import { Link } from "react-router-dom";

const Navigation = (props) => {
  return (
    <nav>
      <ul>
        <li>
          <Link to="/login">Login</Link>
        </li>
        <li>
          <Link to="/stations">Look at Stations</Link>
        </li>
        <li>
          <Link to="/stations/new">Submit a new station</Link>
        </li>
        <li>
          <Link to="/users/new">Create a new account</Link>
        </li>
      </ul>
    </nav>
  );
};

export default Navigation;

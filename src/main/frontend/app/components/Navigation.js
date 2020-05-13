import React from "react";
import { Link } from "react-router-dom";

const Navigation = (props) => {
  return (
    <nav className="cell" data-sticky-container>
      <div className="top-bar">
        <div className="top-bar-title">
          Spill your beans on MBTA stations and beyond!
        </div>
        <div className="top-bar-right">
          <ul className="menu">
            <li>
              <Link to="/stations">Explore Stations</Link>
            </li>
            <li>
              <Link to="/stations/new">Submit a Station</Link>
            </li>
            <li>
              <Link to="/users/new">Create an Account</Link>
            </li>
            <li>
              <Link to="/admin">Admin Login</Link>
            </li>
            <li>
              <Link to="/login">User Login</Link>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  );
};

export default Navigation;

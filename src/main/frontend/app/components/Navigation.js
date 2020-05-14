import React from "react";
import { Link } from "react-router-dom";

const Navigation = (props) => {
  return (
    <nav>
      <header className="header">
        <a href="/" className="logo">
          <i className="fa fa-subway" aria-hidden="true"></i>
        </a>
        <input className="menu-btn" type="checkbox" id="menu-btn" />
        <label className="menu-icon" htmlFor="menu-btn">
          <span className="navicon"></span>
        </label>
        <ul className="menu">
          <li>
            <Link to="/stations">Explore</Link>
          </li>
          <li>
            <Link to="/admin">Admin</Link>
          </li>
          <li>
            <Link to="/login">Login</Link>
          </li>
          <li>
            <Link to="/logout">Logout</Link>
          </li>
        </ul>
      </header>
    </nav>
  );
};

export default Navigation;

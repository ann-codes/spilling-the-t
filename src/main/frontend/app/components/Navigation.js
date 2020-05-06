import React from "react";
import { Link } from "react-router-dom";

const Navigation = (props) => {
  return (
    <nav>
      <ul>
        <li>
          <Link to="/stations/new">Submit a new station</Link>
        </li>
      </ul>
    </nav>
  );
};

export default Navigation;

import React from "react";
import { Link } from "react-router-dom";

const Footer = () => {
  return (
    <footer className="align-center">
      <p>© 2020 Team Supreme, Inc. All rights reserved.</p>
      <div className="quicklinks">
        [<Link to="/stations">Explore Stations</Link>]
        [<Link to="/stations/new">Submit Station</Link>]
        [<Link to="/reviews/new">Add Reviews</Link>]
        [<Link to="/users/new">Create Account</Link>]
        [<Link to="/admin">Admin Login</Link>]
        [<Link to="/login">User Login</Link>]
        [<Link to="/logout">Logout</Link>]
      </div>
    </footer>
  );
};

export default Footer;

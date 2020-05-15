import React, { Fragment, useState } from "react";
import Sections from "../components/admin/Sections";
import FakeLogin from "../components/admin/FakeLogin";

const MainAdmin = (props) => {
  const [loggedIn, setLoggedIn] = useState(false);

  if (loggedIn) {
    return (
      <Fragment>
        <h1 className="align-center section-h">Administrator Portal</h1>
        <Sections />
      </Fragment>
    );
  } else {
    return <FakeLogin setLoggedIn={setLoggedIn}/>;
  }
};

export default MainAdmin;

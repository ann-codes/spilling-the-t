import React, { Fragment } from "react";
import Sections from "../components/admin/Sections";

const MainAdmin = (props) => {
  return (
    <Fragment>
      <h1 className="align-center section-h">Administrator Portal</h1>
      <Sections />
    </Fragment>
  );
};

export default MainAdmin;

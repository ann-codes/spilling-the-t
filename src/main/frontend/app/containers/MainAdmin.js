import React, { Fragment } from "react";
import Sections from "../components/admin/Sections";

const MainAdmin = (props) => {
  return (
    <Fragment>
      <h2 className="align-center section-h">Administrator Portal</h2>
      <Sections />
    </Fragment>
  );
};

export default MainAdmin;

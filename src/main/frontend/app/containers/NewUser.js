import React, { useState, useEffect } from "react";
import NewUserForm from "../components/NewUserForm";
import postData from "../functions/postData";

const NewUser = (props) => {
  const [submitted, setSubmitted] = useState(false);

  const postApiPath = "/api/v1/user/new";

  const addNewUser = (payload) => {
    postData(postApiPath, payload, setSubmitted);
  };

  if (submitted) {
    return (
      <div className="box">
        <h2>Your account has been created, Please login.</h2>
      </div>
    );
  } else {
    return <NewUserForm addNewUser={addNewUser} />;
  }
};

export default NewUser;

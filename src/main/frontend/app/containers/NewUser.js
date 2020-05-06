import React, { useState, useEffect } from "react";
import NewUserForm from "../components/NewUserForm";
import postData from "../functions/postData";

const NewUser = (props) => {
  const [submitted, setSubmitted] = useState(false);

  const postApiPath = "/api/v1/user/new";

  const addNewUser = (payload) => {
    postData(postApiPath, payload, setSubmitted);
  };

  const submittedResponse =
    "Thank you. Your account has been created, Please login";

  if (submitted) {
    return <h2>{submittedResponse}</h2>;
  } else {
    return <NewUserForm addNewUser={addNewUser} />;
  }
};

export default NewUser;

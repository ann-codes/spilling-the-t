import React, { useState, useEffect } from "react";
import NewStationForm from "../components/NewStationForm";
import postData from "../functions/postData";

const NewStation = (props) => {
  const [submitted, setSubmitted] = useState(false);

  const apiPath = "/api/v1/stations";

  const addNewStation = (formPayload) => {
    event.preventDefault();
    postData(apiPath, formPayload, setSubmitted);
  };

  const submittedResponse = "Thank you. Your submission is under review.";

  if (submitted) {
    return <h2>{submittedResponse}</h2>;
  } else {
    return <NewStationForm addNewStation={addNewStation} />;
  }
};
export default NewStation;

import React, { useState, useEffect } from "react";
import NewReviewForm from "../components/NewReviewForm";
import postData from "../functions/postData";

const NewReview = (props) => {
  const [submitted, setSubmitted] = useState(false);

  const postApiPath = "/api/v1/reviews/new";

  const addNewReview = (payload) => {
    postData(postApiPath, payload, setSubmitted);
  };

  const submittedResponse =
    "Thank you. Your review has been submitted";

  if (submitted) {
    return <h2>{submittedResponse}</h2>;
  } else {
    return <NewReviewForm addNewReview={addNewReview} />;
  }
};

export default NewReview;

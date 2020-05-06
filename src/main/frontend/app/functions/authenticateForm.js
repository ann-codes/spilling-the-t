import React, { useState, useEffect } from "react";
import fetchData from "./fetchData";

const authenticateForm = (requiredFields, stateGetter, errorSetter) => {
  let submitErrors = {};
  requiredFields.forEach((field) => {
    if (stateGetter[field].trim() === "") {
      submitErrors = {
        ...submitErrors,
        [field]: "is required.",
      };
    }
  });

  console.log(stateGetter.username && stateGetter.password);

  if (stateGetter.username && stateGetter.password) {
    const apiAuth = `/api/v1/auth/${stateGetter.username}/${stateGetter.password}`;
    fetch(apiAuth, {
      headers: {
        "Content-Type": "application/json",
        credentials: "same-origin",
      },
    })
      .then((response) => {
        if (response.ok) {
          return response;
        } else {
          throw new Error(`${response.status} (${response.statusText})`);
        }
      })
      .then((response) => response.json())
      .then((body) => {
        if (body.length > 0) {
          errorSetter({
            ...submitErrors,
            ["username"]: "has already been taken.",
          });
        }
      })
      .catch((error) => console.error(`Error in fetch: ${error.message}`));
  }

  errorSetter(submitErrors);
  return (
    Object.entries(submitErrors).length === 0 &&
    submitErrors.constructor === Object
  );
};

export default authenticateForm;

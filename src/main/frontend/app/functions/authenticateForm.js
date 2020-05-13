const authenticateForm = (
  requiredFields,
  stateGetter,
  authSetter,
  errorSetter
) => {
  let submitErrors = {};
  requiredFields.forEach((field) => {
    if (stateGetter[field].trim() === "") {
      submitErrors = {
        ...submitErrors,
        [field]: "is required.",
      };
    }
  });

  const alphaNumOnly = /^[a-zA-Z0-9_]*$/;
  if (stateGetter.username) {
    if (!alphaNumOnly.test(stateGetter["username"])) {
      submitErrors = {
        ...submitErrors,
        ["username"]: "may can only contain letters, numbers, and underscores.",
      };
    }
  }

  // if (
  //   stateGetter.username.length >= 1 &&
  //   stateGetter.password.length >= 1 &&
  //   alphaNumOnly.test(stateGetter["username"])
  // ) {
  //   const apiAuth = `/api/v1/auth/${stateGetter.username}/${stateGetter.password}`;

  //   fetch(apiAuth, {
  //     headers: {
  //       "Content-Type": "application/json",
  //       credentials: "same-origin",
  //     },
  //   })
  //     .then((response) => {
  //       if (response.ok) {
  //         return response;
  //       } else {
  //         throw new Error(`${response.status} (${response.statusText})`);
  //       }
  //     })
  //     .then((response) => response.json())
  //     .then((body) => {
  //       if (body.length === 0) {
  //         errorSetter({
  //           ...submitErrors,
  //           ["password"]: "and username combination does not match",
  //         });
  //       } else if (body.length > 0) {
  //         authSetter(body[0]);
  //       }
  //     })
  //     .catch((error) => console.error(`Error in fetch: ${error.message}`));
  // }

  errorSetter(submitErrors);
  return (
    Object.entries(submitErrors).length === 0 &&
    submitErrors.constructor === Object
  );
};

export default authenticateForm;

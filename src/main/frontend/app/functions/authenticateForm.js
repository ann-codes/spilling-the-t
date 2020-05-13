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

  errorSetter(submitErrors);
  return (
    Object.entries(submitErrors).length === 0 &&
    submitErrors.constructor === Object
  );
};

export default authenticateForm;

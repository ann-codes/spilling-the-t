const validateForm = (requiredFields, stateGetter, errorSetter) => {
  let submitErrors = {};
  requiredFields.forEach((field) => {
    if (stateGetter[field].trim() === "") {
      submitErrors = {
        ...submitErrors,
        [field]: "is required.",
      };
    }
  });

  const alphaNumOnly = /^[a-zA-Z0-9_]*$/
  if (stateGetter.username) {
    if (!alphaNumOnly.test(stateGetter["username"])) {
      submitErrors = {
        ...submitErrors,
        ["username"]:
          "may only contain letters, numbers, and underscores only.",
      };
    }
  }

  const strongPassword = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?=.{8,})/;
  if (stateGetter["password"]) {
    if (!strongPassword.test(stateGetter["password"])) {
      submitErrors = {
        ...submitErrors,
        ["password"]:
          "must be more than 8 characters, contain upper and lower case letters, numbers, and a special character(!@#$%^&*).",
      };
    }
  }

  const validEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
  if (stateGetter["email"]) {
    if (
      !validEmail.test(stateGetter["email"]) &&
      stateGetter["email"].trim() !== ""
    ) {
      submitErrors = {
        ...submitErrors,
        ["email"]: "must be in valid email format.",
      };
    }
  }

  errorSetter(submitErrors);
  return (
    Object.entries(submitErrors).length === 0 &&
    submitErrors.constructor === Object
  );
};

export default validateForm;

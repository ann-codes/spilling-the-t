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

  const strongPassword = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?=.{8,})/;

  if (stateGetter["password"]) {
    if (!strongPassword.test(stateGetter["password"])) {
      submitErrors = {
        ...submitErrors,
        ["password"]:
          "must contain upper and lower case letters, numbers, a pecial character(!@#$%^&*) and have more than 8 characters",
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

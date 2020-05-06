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

  errorSetter(submitErrors);
  return (
    Object.entries(submitErrors).length === 0 &&
    submitErrors.constructor === Object
  );
};

export default validateForm;

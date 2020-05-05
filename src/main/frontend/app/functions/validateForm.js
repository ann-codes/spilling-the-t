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

//   const validPhoneNo = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;
//   if (
//     !validPhoneNo.test(stateGetter["phoneNumber"]) &&
//     stateGetter["phoneNumber"].trim() !== ""
//   ) {
//     submitErrors = {
//       ...submitErrors,
//       ["phoneNumber"]:
//         "must be in valid format: xxx-xxx-xxxx, xxx.xxx.xxxx, xxx xxx xxxx",
//     };
//     console.log("is correct");
//   }

//   const validEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
//   if (
//     !validEmail.test(stateGetter["email"]) &&
//     stateGetter["email"].trim() !== ""
//   ) {
//     submitErrors = {
//       ...submitErrors,
//       ["email"]: "must be in valid format.",
//     };
//   }

  errorSetter(submitErrors);
  return (
    Object.entries(submitErrors).length === 0 &&
    submitErrors.constructor === Object
  );
};

export default validateForm;

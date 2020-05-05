const validateForm = (requiredFields, stateGetter, errorSetter) => {
    let submitErrors = {};
    requiredFields.forEach(field => {
        if (stateGetter[field].trim() === "") {
            submitErrors = 
        }
    })
}
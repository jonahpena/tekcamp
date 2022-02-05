// User Input Variables
const firstName = document.getElementById('first-name');
const lastName = document.getElementById('last-name');
const email = document.getElementById('email');
const password = document.getElementById('password');
const formSubmit = document.getElementById('form-submit');
// First Name Field
const hiddenFirst = document.querySelector("#hiddenFirst");
const firstNameError = document.querySelector("#first-name-error");
// Last Name Field
const hiddenLast = document.querySelector("#hiddenLast");
const lastNameError = document.querySelector("#last-name-error");
// Email Field
const hiddenEmail = document.querySelector("#hiddenEmail");
const emailError = document.querySelector("#email-error");
// Password Field
const hiddenPassword = document.querySelector("#hiddenPassword");
const passwordError = document.querySelector("#password-error");

//Listen for submit
formSubmit.addEventListener('click', firstErrorLogic);
formSubmit.addEventListener('click', lastErrorLogic);
formSubmit.addEventListener('click', emailErrorLogic);
formSubmit.addEventListener('click', passwordErrorLogic);

// Error logic for First name Field
function firstErrorLogic(e){
    if (firstName.value === '' || firstName.value == null) {
    showFirstNameError();
    }
    hideFirstError();
}

// Error logic for last name Field
function lastErrorLogic(e){
    if (lastName.value === '' || lastName.value == null) {
    showLastNameError();
    }
    hideLastError();
}

// Error logic for email Field
function emailErrorLogic(e){
    var mailformat = /^\w+([.-]?\w+)@\w+([.-]?\w+)(.\w{2,3})+$/;

    if (email.value === '' || email.value == null) {
        showEmailError()
        }
        hideEmailError()
    if (email.value.match(mailformat));
    else {
    emailError.innerHTML = "Looks like this is not an email";
    showEmailError();
    }
    hideEmailError()
}

// Error logic for password field
function passwordErrorLogic(e){
    if (password.value === '' || password.value == null) {
    showPasswordError();
        }
        hidePasswordError()
}

// Show Error Functions
function showFirstNameError() {
        hiddenFirst.style = "visibility: visible"
        firstNameError.style = "visibility: visible"
        e.preventDefault();
}
function showLastNameError() {
    hiddenLast.style = "visibility: visible"
    lastNameError.style = "visibility: visible"
    e.preventDefault();
}
function showEmailError() {
    hiddenEmail.style = "visibility: visible"
    emailError.style = "visibility: visible"
    e.preventDefault();
}
function showPasswordError() {
    hiddenPassword.style = "visibility: visible"
    passwordError.style = "visibility: visible"
    e.preventDefault();
}

// Hide Error On Change functions
function hideFirstError() {
    hiddenFirst.style = "visibility: hidden"
    firstNameError.style = "visibility: hidden"
}
function hideLastError() {
    hiddenLast.style = "visibility: hidden"
    lastNameError.style = "visibility: hidden"
}
function hideEmailError() {
    hiddenEmail.style = "visibility: hidden"
    emailError.style = "visibility: hidden"
}
function hidePasswordError() {
    hiddenPassword.style = "visibility: hidden"
    passwordError.style = "visibility: hidden"
}

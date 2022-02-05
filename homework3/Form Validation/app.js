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
    var mailFormat = /^\w+([.-]?\w+)@\w+([.-]?\w+)(.\w{2,3})+$/;

    if (email.value === '' || email.value == null || email.value === "email@example/com") {
        showEmailError()
        }
        hideEmailError()
    if (email.value.match(mailFormat));

/*     if (email.value === '' || email.value == null) {
        emailError.innerHTML = "Email cannot be empty";
        }
 */
        else {
    emailError.innerHTML = "Looks like this is not an email";
    email.value = "email@example/com";
    email.style.color = "#ff7a7a";
    email.style.fontFamily = "Poppins"
    email.style.fontSize = "22px";
    showEmailError();
    email.addEventListener('mouseover', clearEmailField());
    }
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
    firstName.style.borderColor = "#ff7a7a";
    firstName.style.borderWidth = "3px";
    firstName.placeholder = '';
    e.preventDefault();
}
function showLastNameError() {
    hiddenLast.style = "visibility: visible"
    lastNameError.style = "visibility: visible"
    lastName.style.borderColor = "#ff7a7a";
    lastName.style.borderWidth = "3px";
    lastName.placeholder = '';
    e.preventDefault();
}
function showEmailError() {
    hiddenEmail.style = "visibility: visible"
    emailError.style = "visibility: visible"
    email.style.borderColor = "#ff7a7a";
    email.style.borderWidth = "3px";
    email.placeholder = '';
    e.preventDefault();
}
function showPasswordError() {
    hiddenPassword.style = "visibility: visible"
    passwordError.style = "visibility: visible"
    password.style.borderColor = "#ff7a7a";
    password.style.borderWidth = "3px";
    password.placeholder = '';
    e.preventDefault();
}

// Hide Error On Change functions
function hideFirstError() {
    hiddenFirst.style = "visibility: hidden"
    firstNameError.style = "visibility: hidden"
    firstName.style.borderColor = "#b9b6d3";
    firstName.style.borderWidth = "1px";
}
function hideLastError() {
    hiddenLast.style = "visibility: hidden"
    lastNameError.style = "visibility: hidden"
    lastName.style.borderColor = "#b9b6d3";
    lastName.style.borderWidth = "1px";
}
function hideEmailError() {
    hiddenEmail.style = "visibility: hidden"
    emailError.style = "visibility: hidden"
    email.style.borderColor = "#b9b6d3";
    email.style.borderWidth = "1px";
}
function hidePasswordError() {
    hiddenPassword.style = "visibility: hidden"
    passwordError.style = "visibility: hidden"
    password.style.borderColor = "#b9b6d3";
    password.style.borderWidth = "1px";
}

// Clear Field when clicked
function clearEmailField(){
    email.value = '';
    email.style.color = "black"
    email.style.fontFamily = "tahoma"
    email.style.fontWeight = "600"
    email.style.fontSize = "1.25vw"
}
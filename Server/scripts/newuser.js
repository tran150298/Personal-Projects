// Minh Thong Tran 041058827

function validate() {
  // Reset any previous error messages
  clearErrorMessages();

  // Get form input elements
  const email = document.getElementById("Email");
  const login = document.getElementById("login");
  const pass = document.getElementById("pass");
  const pass2 = document.getElementById("pass2");
  const newsletter = document.getElementsByName("rememberMe")[0];

  // Array to store error messages and their corresponding elements
  let errorMessages = [];

  // Validate email
  const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
  if (!emailPattern.test(email.value)) {
    errorMessages.push({ element: email, message: "Invalid email format" });
  }

  // Validate login name
  if (login.value.trim() === "") {
    errorMessages.push({ element: login, message: "Login name cannot be empty" });
  }
  if (login.value.length > 30) {
    errorMessages.push({ element: login, message: "Login name should be less than 30 characters" });
  }

  // Convert login name to lowercase
  login.value = login.value.toLowerCase();

  // Validate password
  if (pass.value.trim() === "") {
    errorMessages.push({ element: pass, message: "Passwords cannot be empty" });
  }
  if (pass.value.length < 8) {
    errorMessages.push({ element: pass, message: "Password should be at least 8 characters long" });
  }

  if (pass2.value.trim() === "") {
    errorMessages.push({ element: pass2, message: "Passwords cannot be empty" });
  }

  // Validate password match
  if (pass.value !== pass2.value) {
    errorMessages.push({ element: pass2, message: "Passwords do not match" });
  }

  // Validate newsletter checkbox
  if (newsletter.checked) {
    alert("Be cautious about possible spam.");
  }

  // Display all error messages under their respective input boxes
  if (errorMessages.length > 0) {
    displayError(errorMessages);
    return false;
  }

  // Construct the URI with the submitted data
  const uriParams = new URLSearchParams();
  uriParams.append("email", email.value);
  uriParams.append("login", login.value);

  // Redirect to submit.php with the submitted data
window.location.replace("submit.php?" + uriParams.toString());

  // Prevent the form from submitting
  return false;
}

function displayError(errorMessages) {
  // Add each error message under its respective input box
  errorMessages.forEach(({ element, message }) => {
    const errorElement = document.createElement("div");
    errorElement.className = "error-message";
    errorElement.textContent = message;

    // Insert the error message below the input element
    element.parentNode.appendChild(errorElement);
  });
}

function clearErrorMessages() {
  const errorMessages = document.getElementsByClassName("error-message");
  while (errorMessages.length > 0) {
    errorMessages[0].parentNode.removeChild(errorMessages[0]);
  }
}

// Attach the "validate" function to the form's onsubmit event
const form = document.querySelector("form");
form.onsubmit = validate;

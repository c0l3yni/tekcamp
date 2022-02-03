const firstName = document.getElementById('first-name');
const lastName = document.getElementById('last-name');
const email = document.getElementById('email');
const password = document.getElementById('password');
const button = document.getElementById('form-submit');
const errorFirstName = document.getElementById('first-name-error');
const errorLastName = document.getElementById('last-name-error');
const blankEmail = document.getElementById('email-error');
const errorPassword = document.getElementById('password-error');
const errorImage = document.getElementsByClassName('fas fa-exclamation-circle');
const approvedEmail = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
const passwordErrorText = document.getElementById('id')




button.addEventListener('click', function(){

    if (firstName.value === '' || firstName.value === null) {
      errorFirstName.style.visibility = 'visible';
      errorFirstName.style.fontStyle = 'italic';
      firstName.classList.add('error');
      firstName.placeholder = '';
      errorImage[0].style.visibility = 'visible';
    } else {
      errorFirstName.style.visibility = 'hidden';
      firstName.classList.remove('error');
      errorImage[0].style.visibility = 'hidden';
    }

    if (lastName.value === '' || lastName.value === null) {
      errorLastName.style.visibility = 'visible';
      errorLastName.style.fontStyle = 'italic';
      lastName.classList.add('error');
      lastName.placeholder = '';
      errorImage[1].style.visibility = 'visible';
    } else {
      errorLastName.style.visibility = 'hidden';
      lastName.classList.remove('error');
      errorImage[1].style.visibility = 'hidden';
    }

    if (email.value === '' || email.value === null) {
      blankEmail.style.visibility = 'visible';
      blankEmail.style.fontStyle = 'italic';
      email.classList.add('error');
      email.placeholder = '';
      errorImage[2].style.visibility = 'visible';
    } else if (email.value.match(approvedEmail)) {
      blankEmail.style.visibility = 'hidden';
      email.classList.remove('error');
      errorImage[2].style.visibility = 'hidden';
    } else {
      blankEmail.innerText = 'Looks like this is not an email';
      blankEmail.style.visibility = 'visible';
      blankEmail.style.fontStyle = 'italic';
      email.classList.add('error');
      email.placeholder = '';
      errorImage[2].style.visibility = 'visible';
    }

    if (password.value === '' || password.value === null) {
      errorPassword.style.visibility = 'visible';
      errorPassword.style.fontStyle = 'italic';
      password.classList.add('error');
      password.placeholder = '';
      errorImage[3].style.visibility = 'visible';
    } else {
      errorPassword.style.visibility = 'hidden';
      password.classList.remove('error');
      errorImage[3].style.visibility = 'hidden';
    }    
  })
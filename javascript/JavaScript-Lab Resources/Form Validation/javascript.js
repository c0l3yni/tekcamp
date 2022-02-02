const firstName = document.getElementById('first-name');
const lastName = document.getElementById('last-name');
const email = document.getElementById('email');
const password = document.getElementById('password');
const button = document.getElementById('form-submit');
const errorFirstName = document.getElementById('first-name-error');
const errorLastName = document.getElementById('last-name-error');
const errorEmail = document.getElementById('email-error');
const errorPassword = document.getElementById('password-error');
const errorImage = document.getElementsByClassName('fas fa-exclamation-circle');

button.addEventListener('click', function(){

    if (firstName.value === '' || firstName.value === null) {
      errorFirstName.style.visibility = 'visible';
      firstName.classList.add('error');
      firstName.placeholder = '';
      errorImage[0].style.visibility = 'visible';
    } else {
      errorFirstName.style.visibility = 'hidden';
      firstName.classList.remove('error');
      errorImage[0].style.visibility = 'hidden';
    }

   
  });
const firstName = document.getElementById('first-name');
const lastName = document.getElementById('last-name');
const email = document.getElementById('email');
const password = document.getElementById('password');
const button = document.getElementById('form-submit');
const errorFirstName = document.getElementById('first-name-error');

button.addEventListener('click', function () {

if (firstName.value === '' || firstName.value === null){
    
  if (firstName.value === '' || firstName.value === null) {
    errorFirstName.style.visibility = 'visible';
    firstName.classList.add('error');
    firstName.placeholder = '';
  } else {
    errorFirstName.style.visibility = 'hidden';
    firstName.classList.remove('error');
  }
  


  }

})
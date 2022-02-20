export default function ValidateForm (values) {
  let errors = {}

  if(values.firstname === '') {
    errors.firstname = "First Name is required"
  }

  if(values.lastname === '') {
    errors.lastname = "Last Name is required"
  }

  if(values.country === '') {
    errors.country = "Country is required"
  }

  if(values.city === '') {
    errors.city = "City is required"
  }

  if(values.states === '') {
    errors.states = "State is required"
  }

  if(values.phone.length < 10) {
    errors.phone = "Phone is required"
  }

  if(values.zip.length < 5) {
    errors.zip = "Zipcode is required"
  }

  if(values.cardNum.length < 16) {
    errors.cardNum = "Card Number is required"
  }

  if(values.nameCard === '') {
    errors.nameCard = "Name on Card is required"
  }

  if(values.month < 12) {
    errors.month = "Card month is required"
  }

  if(values.year > 2017) {
    errors.year = "Card year is required"
  }

  if(values.ccv.length == 3) {
    errors.ccv = "Card CCV is required"
  }


}
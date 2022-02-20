export default function ValidateForm (values) {
  let errors = {}

  if(values.firstname.trim()) {
    errors.firstname = "First Name is required"
  }

  if(!values.email) {
    errors.email = "Email is required"
  } else if(!/^[A-Z0-9._%+-]A-Z0-9.-]+\.[A-Z]{2,}$/i.test(values.email)) {
    errors.email = "Email is not valid"
  }


}

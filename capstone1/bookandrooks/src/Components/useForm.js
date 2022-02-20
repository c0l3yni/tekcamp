import { useState, useEffect } from "react";
import ValidateForm from "./ValidateForm";
const useForm = ({ValidateForm, callback}) => {
  const [values, setValues] = useState ({
    firstname: '',
    email: '',
  })
  const [errors, setErrors] = useState({});
  const [isSubmitting, setIsSubmitting] = useState(false)

  const handleChange = e => {
    setValues({
      ...values,
      [e.target.name]: e.target.value
    });
  };

  const handleSubmit = e => {
    e.preventDefault();

    setErrors(ValidateForm(values))
    setIsSubmitting(true)
  };

  useEffect(() => {
    if(Object.keys(errors).length === 0 &&
    isSubmitting) {
      callback();
    }
  },  [errors, isSubmitting, callback])


  return { handleChange, values, handleSubmit, errors };
}

export default useForm;
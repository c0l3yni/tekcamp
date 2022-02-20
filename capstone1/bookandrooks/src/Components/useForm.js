import { useState, useEffect } from "react";

const useForm = ({ callback }) => {
  const [values, setValues] = useState({
    firstname: "",
    lastname: "",
    country: "",
    states: "",
    city: "",
    phone: "",
    zip: "",
    cardNum: "",
    cardName: "",
    month: "",
    year: "",
    ccv: "",
  });
  const [errors, setErrors] = useState({});
  const [isSubmitting, setIsSubmitting] = useState(false);

  const handleChange = (e) => {
    if (e.target.value !== "") {
      setValues({
        ...values,
        [e.target.name]: e.target.value,
      });
      setErrors({ ...errors, [e.target.name]: "" });
    } else {
      setValues({ ...values, [e.target.name]: "" });
      setErrors({ ...errors, [e.target.name]: "Can not be empty" });
    }
  };

  const handleSubmit = (e) => {
    e.preventDefault();

     if(values.firstname === "") {
        setErrors({...errors, firstname: "First Name is required"});
     } else if (values.lastname === "") {
       setErrors({...errors, lastname:"Last Name is required"});
     } else if (values.country === "") {
       setErrors({...errors, country: "Country is required"})
     } else if(values.states === "") {
       setErrors({...errors, states: "State is required"})
     } else if (values.city === "") {
       setErrors({...errors, city: "City is required"})
     } else if (values.zip === "" || values.zip.length != 5 || isNaN(values.zip)) {
       setErrors({...errors, zip: "Zipcode is required (5 digits)"})
     } else if (values.phone === "" || values.phone.length != 10 || isNaN(values.phone)) {
      setErrors({...errors, phone: "Phone Number is required (10 digits)"})
    } else if (values.cardNum === "") {
      setErrors({...errors, cardNum: "Card Number is required"})
    } else if (values.cardName === "") {
      setErrors({...errors, cardName: "Name on card is required"})
    } else if (values.month === "") {
      setErrors({...errors, month: "Month is required"})
    } else if (values.year === "") {
      setErrors({...errors, year: "Year is required"})
    } else if (values.ccv === "") {
      setErrors({...errors, ccv: "CCV is required"})
    } else {
      setValues({
        firstname: "",
        lastname: "",
        country: "",
        states: "",
        city: "",
        phone: "",
        zip: "",
        cardNum: "",
        cardName: "",
        month: "",
        year: "",
        ccv: "",
      });

      setIsSubmitting(true);
    }
  };

  useEffect(() => {
    if (Object.keys(errors).length === 0 && isSubmitting) {
      callback();
    }
  }, [errors, isSubmitting, callback]);

  return { handleChange, values, handleSubmit, errors, isSubmitting };
};

export default useForm;

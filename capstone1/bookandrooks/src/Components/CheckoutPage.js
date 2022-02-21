import React, { useState, useCallback } from "react";
import "../CSS/checkoutpage.css";
import CheckoutForm from "./CheckoutForm";
import FormSuccess from "./FormSuccess";

const CheckoutPage = () => {
  const [isSubmitted, setIsSubmitted] = useState(false);

  const submitFormInputs = useCallback(() => {
    setIsSubmitted(true);
  }, [setIsSubmitted]);

  return (
    <div>
      {!isSubmitted ? (
        <CheckoutForm submitFormInputs={submitFormInputs} />
      ) : (
        <FormSuccess />
      )}
    </div>
  );
};
export default CheckoutPage;

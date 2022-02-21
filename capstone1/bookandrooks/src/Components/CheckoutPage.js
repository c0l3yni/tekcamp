import React, { useState, useCallback } from "react";
import "../CSS/checkoutpage.css";
import CheckoutForm from "./CheckoutForm";

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
        <div className="thanks">Thank you for your purchase!</div>
      )}
    </div>
  );
};
export default CheckoutPage;

import React from "react";
import "../CSS/checkoutpage.css";
import useForm from "./useForm";
import ValidateForm from "./ValidateForm";
  
function CheckoutForm ({submitFormInputs}) {
    const { handleChange, values, handleSubmit, errors } = useForm(ValidateForm, submitFormInputs);
return (
  <div>
    <section className="flex-box">
      <section className="ship-pay-info">
        <strong>Shipping and Payment Information</strong>
      </section> 
      <form onSubmit={handleSubmit}>
        <div className="input-row">
          <input
            type="text"
            name="firstname"
            className="text-input"
            placeholder="First Name"
            required
            value={values.firstname}
            onChange={handleChange}
            {...errors.firstname && <div>{errors.firstname}</div>}
          />
          <p className="error-text" >First Name cannot be empty</p>
          <input
            type="text"
            className="text-input"
            name="lastname"
            placeholder="Last Name"
            value={values.lastname}
            onChange={handleChange}
          ></input>
          <p className="error-text">Last Name cannot be empty</p>
        </div>
        <div className="input-row">
          <input
            type="text"
            name="country"
            className="text-input"
            placeholder="Country"
            value={values.country}
            onChange={handleChange}
          ></input>
          <p className="error-text">Country cannot be empty</p>
          <input
            type="text"
            name="country"
            className="text-input"
            placeholder="State"
            value={values.states}
            onChange={handleChange}
          ></input>
          <p className="error-text">State cannot be empty</p>
        </div>
        <div className="input-row">
          <input
            type="text"
            name="city"
            className="text-input"
            placeholder="City"
            value={values.city}
            onChange={handleChange}
          ></input>
          <p className="error-text">City cannot be empty</p>
          <input
            type="text"
            name="zip"
            className="text-input"
            placeholder="Zipcode"
            value={values.zip}
            onChange={handleChange}
          ></input>
          <p className="error-text">Zipcode cannot be empty</p>
        </div>
        <div className="input-row">
          <input
            type="text"
            name="phone"
            className="text-input"
            placeholder="phone-number"
            value={values.phoneNum}
            onChange={handleChange}
          ></input>
          <p className="error-text">Phone Number cannot be empty</p>
          <input
            type="text"
            className="text-input"
            name="cardNum"
            placeholder="Card Number"
            value={values.cardNum}
            onChange={handleChange}
          ></input>
          <p className="error-text">Card Number cannot be empty</p>
        </div>
        <div className="input-row">
          <input
            type="text"
            name="cardName"
            className="text-input"
            placeholder="Name on Card"
            value={values.nameCard}
            onChange={handleChange}
          ></input>
          <p className="error-text">Name on card cannot be empty</p>
          <input
            type="text"
            name="month"
            className="text-input"
            placeholder="Expiration Month"
            value={values.month}
            onChange={handleChange}
          ></input>
          <p className="error-text">Card expiration month cannot be empty</p>
        </div>
        <div className="input-row">
          <input
            type="text"
            name="year"
            className="text-input"
            placeholder="Expiration Year"
            value={values.year}
            onChange={handleChange}
          ></input>
          <p className="error-text">Card expiration year cannot be empty</p>
          <input 
          type="text" 
          name="ccv"
          className="text-input" 
          placeholder="CCV"
          value={values.ccv}
          onChange={handleChange}
          ></input>
          <p className="error-text">Security code month cannot be empty</p>
        </div>
  
        <div className="button-flex-box">
          <button className="form-submit" onClick={handleChange} type="button">
            Submit Purchase
          </button>
        </div>
      </form>
    </section>
  </div>
);
}
export default CheckoutForm;
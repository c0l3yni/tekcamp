import React, {useState} from "react";
import "../CSS/checkoutpage.css";
import FormSuccess from "./FormSuccess";
import useForm from "./useForm";

function CheckoutForm({ submitFormInputs }) {
  const { handleChange, values, handleSubmit, errors, isSubmitting } =
    useForm(submitFormInputs);

  return (
    <div>
      <section className="flex-box detail-box">
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
            />
            <input
              type="text"
              className="text-input"
              name="lastname"
              placeholder="Last Name"
              value={values.lastname}
              onChange={handleChange}
            ></input>
          </div>
          <section className="errormsg-flex-box">
            {errors.firstname && (<div className="error-text">{errors.firstname}</div>)}
            {errors.lastname && (<div className="error-text">{errors.lastname}</div>)}
          </section>

          <div className="input-row">
            <input
              type="text"
              name="country"
              className="text-input"
              placeholder="Country"
              value={values.country}
              onChange={handleChange}
            ></input>
            <input
              type="text"
              name="states"
              className="text-input"
              placeholder="State"
              value={values.states}
              onChange={handleChange}
            ></input>
          </div>
          <section className="errormsg-flex-box">
            {errors.country && (<div className="error-text">{errors.country}</div>)}
            {errors.states && <div className="error-text">{errors.states}</div>}
          </section>

          <div className="input-row">
            <input
              type="text"
              name="city"
              className="text-input"
              placeholder="City"
              value={values.city}
              onChange={handleChange}
            ></input>
            <input
              type="text"
              name="zip"
              className="text-input"
              placeholder="Zipcode"
              value={values.zip}
              onChange={handleChange}
            ></input>
          </div>
          <section className="errormsg-flex-box">
            {errors.city && <div className="error-text">{errors.city}</div>}
            {errors.zip && <div className="error-text">{errors.zip}</div>}
          </section>
          
          <div className="input-row">
            <input
              type="text"
              name="phone"
              className="text-input"
              placeholder="phone-number"
              value={values.phone}
              onChange={handleChange}
            ></input>
            <input
              type="text"
              className="text-input"
              name="cardNum"
              placeholder="Card Number"
              value={values.cardNum}
              onChange={handleChange}
            ></input>
          </div>
          <section className="errormsg-flex-box">
            {errors.phone && <div className="error-text">{errors.phone}</div>}
            {errors.cardNum && (
              <div className="error-text">{errors.cardNum}</div>
            )}
          </section>

          <div className="input-row">
            <input
              type="text"
              name="cardName"
              className="text-input"
              placeholder="Name on Card"
              value={values.cardName}
              onChange={handleChange}
            ></input>
            <input
              type="text"
              name="month"
              className="text-input"
              placeholder="Expiration Month"
              value={values.month}
              onChange={handleChange}
            ></input>
          </div>
          <section className="errormsg-flex-box">
            {errors.month && <div className="error-text">{errors.month}</div>}
            {errors.cardName && (<div className="error-text">{errors.cardName}</div>)}
          </section>

          <div className="input-row">
            <input
              type="text"
              name="year"
              className="text-input"
              placeholder="Expiration Year"
              value={values.year}
              onChange={handleChange}
            ></input>
            <input
              type="text"
              name="ccv"
              className="text-input"
              placeholder="CCV"
              value={values.ccv}
              onChange={handleChange}
            ></input>
          </div>
          <section className="errormsg-flex-box">
            {errors.year && <div className="error-text">{errors.year}</div>}
            {errors.ccv && <div className="error-text">{errors.ccv}</div>}
          </section>

          <div className="button-flex-box">
            <button
              className="form-submit"
              onClick={handleSubmit}
              type="button"
            >
              Submit Purchase
            </button>
            {isSubmitting && <FormSuccess />}
            {!isSubmitting && <h3>All fields are required</h3>}
          </div>
        </form>
      </section>
    </div>
  );
}
export default CheckoutForm;

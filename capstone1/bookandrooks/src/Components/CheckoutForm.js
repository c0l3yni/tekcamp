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
          {/* <p className="error-text" >First Name cannot be empty</p> */}
          {/* <input
            type="text"
            className="text-input"
            placeholder="Last Name"
            value={last}
            onChange={(e) => setLast(e.target.value)}
          ></input>
          <p className="error-text">Last Name cannot be empty</p>
        </div>

        <div className="input-row">
          <input
            type="text"
            className="text-input"
            placeholder="Country"
            value={country}
            onChange={(e) => setCountry(e.target.value)}
          ></input>
          <p className="error-text">Country cannot be empty</p>

          <input
            type="text"
            className="text-input"
            placeholder="State"
            value={states}
            onChange={(e) => setStates(e.target.value)}
          ></input>
          <p className="error-text">State cannot be empty</p>
        </div>

        <div className="input-row">
          <input
            type="text"
            className="text-input"
            placeholder="City"
            value={city}
            onChange={(e) => setCity(e.target.value)}
          ></input>
          <p className="error-text">City cannot be empty</p>

          <input
            type="text"
            className="text-input"
            placeholder="Zipcode"
            value={zip}
            onChange={(e) => setZip(e.target.value)}
          ></input>
          <p className="error-text">Zipcode cannot be empty</p>
        </div>

        <div className="input-row">
          <input
            type="text"
            className="text-input"
            placeholder="phone-number"
            value={phone}
            onChange={(e) => setPhone(e.target.value)}
          ></input>
          <p className="error-text">Phone Number cannot be empty</p>

          <input
            type="text"
            className="text-input"
            placeholder="Card Number"
            value={cardNum}
            onChange={(e) => setCardNum(e.target.value)}
          ></input>
          <p className="error-text">Card Number cannot be empty</p>
        </div>

        <div className="input-row">
          <input
            type="text"
            className="text-input"
            placeholder="Name on Card"
            value={nameCard}
            onChange={(e) => setNameCard(e.target.value)}
          ></input>
          <p className="error-text">Name on card cannot be empty</p>

          <input
            type="text"
            className="text-input"
            placeholder="Expiration Month"
            value={month}
            onChange={(e) => setMonth(e.target.value)}
          ></input>
          <p className="error-text">Card expiration month cannot be empty</p>
        </div>

        <div className="input-row">
          <input
            type="text"
            className="text-input"
            placeholder="Expiration Year"
            value={year}
            onChange={(e) => setYear(e.target.value)}
          ></input>
          <p className="error-text">Card expiration year cannot be empty</p>

          <input 
          type="text" 
          className="text-input" 
          placeholder="CCV"
          value={ccv}
            onChange={(e) => setCCV(e.target.value)}
          ></input>
          <p className="error-text">Security code month cannot be empty</p>
        </div> */}

        <div className="input-row">
          <input
            type="email"
            name="email"
            className="text-input"
            placeholder="Email Address"
            value={values.email}
            onChange={handleChange}
          ></input>
            {errors.email && <p className="error">{errors.email}</p>}
        </div>
  
        <div className="button-flex-box">
          <button className="form-submit" onClick={handleChange} type="button">
            Submit Purchase
          </button>
        </div>
        </div>
      </form>
    </section>
  </div>
);
}
export default CheckoutForm;

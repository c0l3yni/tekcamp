import React, {useState} from "react";
import "../CSS/checkoutpage.css";

function CheckoutPage() {
  const [first, setFirst] = useState("");
  const [last, setLast] = useState("");
  const [country, setCountry] = useState("");
  const [states, setStates] = useState("");
  const [city, setCity] = useState("");
  const [phone, setPhone] = useState("");
  const [zip, setZip] = useState("");
  const [cardNum, setCardNum] = useState("");
  const [nameCard, setNameCard] = useState("");
  const [month, setMonth] = useState("");
  const [year, setYear] = useState("");
  const [ccv, setCCV] = useState("");
  const [email, setEmail] = useState("");
  // const approvedEmail = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
  // const blankEmail = document.getElementsByClassName('error-text-email');

  function onFormSubmit(e) {
    e.preventDefault("");
    setFirst("");
    setLast("");
    setCountry("");
    setCity("");
    setStates("");
    setZip("");
    setPhone("");
    setCardNum("");
    setNameCard("");
    setMonth("");
    setYear("");
    setCCV("");
    setEmail("");
  }
  // function onInputChange (e) {
  //   validateEmail(email);
  // }

// function validateEmail () {
//   if (email.value === '' || email.value === null) {
//     blankEmail.style.visibility = 'visible';
//     blankEmail.innerText = 'Email cannot be empty';
//     email.classList.add('error');
//     email.placeholder = '';
//   } else if (email.value.match(approvedEmail)) {
//     blankEmail.style.visibility = 'hidden';
//     email.classList.remove('error');
//   } else {
//     blankEmail.innerText = 'Looks like this is not an email';
//     blankEmail.style.visibility = 'visible';
//     email.classList.add('error');
//     email.placeholder = '';
//   }}




  return (
    <div>
      <section className="flex-box">
        <section className="ship-pay-info">
          <strong>Shipping and Payment Information</strong>
        </section>
        <form>
          <div className="input-row">
            <input
              type="text"
              className="text-input"
              placeholder="First Name"
              value={first}
              onChange={(e) => setFirst(e.target.value)}
            />
            <p className="error-text">First Name cannot be empty</p>
            <input
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
          </div>

          <div className="input-row">
            <input
              type="email"
              className="text-input"
              placeholder="Email Address"
              value={email}
              // onChange={validateEmail}
              onChange={(e) => setEmail(e.target.value)}
            ></input>
            <p className="error-text">Email cannot be empty</p>
          </div>
          <div className="button-flex-box">
            <button className="form-submit" onClick={onFormSubmit} type="button">
              Submit Purchase
            </button>
          </div>
        </form>
      </section>
    </div>
  );
}

export default CheckoutPage;

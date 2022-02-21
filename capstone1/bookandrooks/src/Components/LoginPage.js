import React, { useState } from "react";
import { Link } from "react-router-dom";
import "../CSS/login.css";

function LoginPage() {
  const [message, setMessage] = useState("");
  const [errorMessage, setErrorMessage] = useState("");
  const username = "nsulak";
  const password = "password";

  const validatePassword = (e) => {
    if (e.target.value !== password) {
      setMessage("invalid input");
    } else {
      setMessage("");
    }
    return validatePassword;
  };

  const validateUserName = (e) => {
    if (e.target.value !== username) {
      setErrorMessage("invalid input");
      console.log(username);
    } else {
      setErrorMessage("");
    }
    return validateUserName;
  };

  return (
    <div>
      <div className="login-box">
        <h1 className="login-title">Login</h1>
      </div>
      <form className="input-flex-box">
        <div className="input-flex">
          <label className="label">Username:</label>
          <input onChange={validateUserName} className="input-login" />
          {errorMessage}
          <br />
        </div>
        <div className="input-flex">
          <label className="label password">Password:</label>
          <input onChange={validatePassword} className="input-login" />
          {message}
          <br />
        </div>
        <Link to="/private">
          <button className="login-button">Login</button>
        </Link>
      </form>
    </div>
  );
}

export default LoginPage;

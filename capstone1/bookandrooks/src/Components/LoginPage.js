import React from "react";
import { Link } from "react-router-dom";
import "../CSS/login.css";

function LoginPage() {
  return (
    <div>
      <div className="login-box">
      <h1 className="login-title">Login</h1>
      </div>
      <form className="input-flex-box">
      <div className="input-flex">
        <label className="label">Username:</label>  
        <input className="input-login" />
        <br />
        </div>

        <div className="input-flex">
        <label className="label password">Password:</label>
        <input className="input-login" />
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

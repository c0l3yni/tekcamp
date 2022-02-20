import React from "react";
import { Link } from "react-router-dom";

function LoginPage() {
  return (
    <div>
      <h1>Login</h1>
      <form>
        <label>UserName</label>
        <input />
        <br />
        <label>Password</label>
        <input />
        <br />
        <Link to="/private">
          <button>Login</button>
        </Link>
      </form>
    </div>
  );
}

export default LoginPage;

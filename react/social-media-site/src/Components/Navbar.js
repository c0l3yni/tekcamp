import React from "react";
import { Link } from "react-router-dom";

function Navbar() {
  return (
    <div>
      <Link to="/profile">
        <button>My Profile</button>
      </Link>
      <h1 className="appTitle">What the hex is going on...</h1>
      <Link to="/">
        <button>My Newsfeed</button>
      </Link>
    </div>
  );
}

export default Navbar;
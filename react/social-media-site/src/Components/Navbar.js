import React from "react";
import { Link } from "react-router-dom";
import '../CSS/navbar.css'

function Navbar() {
  return (
    <div className="navbar-flex-container">
      <Link to="/profile">
        <button className="profile-btn">My Profile</button>
      </Link>
      <h1 className="app-title">What the hex is going on...</h1>
      <Link to="/">
        <button className="newsfeed-btn">My Newsfeed</button>
      </Link>
    </div>
  );
}

export default Navbar;
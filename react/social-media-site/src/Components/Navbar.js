import React from "react";
import { Link } from "react-router-dom";
import '../CSS/navbar.css'

function Navbar() {
  return (
    
    <div className="navbar-flex-container">
      <Link to="/profile">
        <button className="profile-btn">My Profile</button>
      </Link>
      <section className="title-flex-container">
      <h1 className="app-title">What the HEX is going on...</h1>
      </section>
      <Link to="/">
        <button className="newsfeed-btn">Newsfeed</button>
      </Link>
    </div>
  );
}

export default Navbar;
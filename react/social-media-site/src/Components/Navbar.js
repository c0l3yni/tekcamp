import React from "react";
import { Link } from "react-router-dom";
import "../CSS/navbar.css";

function Navbar() {
  return (
    <div className="navbar-flex-container">
      <Link to="/profile">
        <button className="button-navbar">My Profile</button>
      </Link>
      <section className="title-flex-container">
        <p className="app-title">What the HEX is going on...</p>
      </section>
      <Link to="/">
        <button className="button-navbar">Newsfeed</button>
      </Link>
    </div>
  );
}

export default Navbar;

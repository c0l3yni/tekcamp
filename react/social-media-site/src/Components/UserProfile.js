import React, { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import "../CSS/userprofile.css";

const API_KEY = process.env.REACT_APP_API_KEY; 

function UserProfile() {

  const [user, setUser] = useState([])

  useEffect(() => {
    fetch('https://dummyapi.io/data/v1/user/60d0fe4f5311236168a109ca', {
      headers: {
        'app-id': API_KEY
      }
    })
    .then(response => response.json())
    .then(jsonResponse => setUser(jsonResponse))
  },[]);

  return (
    <div className="user-profile">
      <Link to="/">
        <button>My Newsfeed</button>
      </Link>
      <img src="" alt="" />
      <h1 className="user-profile-name">{user.firstName} {user.lastName}</h1>
      <section className="user-info-container">
        <section className="left-container">
          <p>{user.gender}</p>
          <p>{user.dateOfBirth}</p>
          <p>astro sign</p>
        </section>
        <section className="right-container">
          {/* <p>{user.location.city}</p>
          <p>{user.location.state}</p>
          <p>{user.location.country}</p> */}
        </section>
      </section>
  </div>
  );
}

export default UserProfile;
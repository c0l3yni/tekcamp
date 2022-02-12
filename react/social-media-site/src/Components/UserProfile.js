import React, { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import Navbar from "./Navbar";
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
  }, []);

  return (
     <div className="user-profile">
      <Navbar />

    <div class="t">

      <div>
        <div class="triangle">
        {/* <p className="user-profile-name">{user.firstName} {user.lastName}</p> */}
        </div>
      </div>

      <div>
        <div class="triangle">

        </div>
      </div>

      <div>
        <div class="triangle">

        </div>
      </div>

      <div>
        <div class="triangle">

        </div>
      </div>
      
      <div>
        <div class="triangle">

        </div>
      </div>
      
      <div>
        <div class="triangle">

        </div>
      </div>

    </div>
   

    //   <div className="hex-container">

    //   <section className="user-name-triangle">
    //    
    //   </section>

    //     <section className="dob-triangle">
    //       <p className="dob">{user.dateOfBirth}</p>
    //     </section>

    //     <section className="astro-triangle">
    //       <p className="sign">astro sign</p>
    //     </section>

    //     <section className="gender-triangle">
    //       <p className="gender">{user.gender}</p>
    //     </section>

    //     <section className="location-triangle">
    //       {/* <p>{user.location.city}</p>
    //       <p>{user.location.state}</p>
    //       <p>{user.location.country}</p> */}

    //     <img className="image-triangle" src="" alt="" />
    //     </section>
    //   </div>
    // </div>
  );
}

export default UserProfile;
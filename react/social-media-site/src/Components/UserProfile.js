import React, { useState, useRef, useEffect } from "react";
import { Link } from "react-router-dom";
import Navbar from "./Navbar";
import moment from "moment";
import "../CSS/userprofile.css";

const API_KEY = process.env.REACT_APP_API_KEY;

function UserProfile() {
  let dob = moment("1996-04-30T19:26:49.610Z").utc().format('YYYY-MM-DD')
  const [user, setUser] = useState([])
  const isCancelled = useRef(false)
  console.log(user)

  useEffect(() => {
    fetch('https://dummyapi.io/data/v1/user/60d0fe4f5311236168a109ca', {
      headers: {
        'app-id': API_KEY
      }
    })
      .then(response => response.json())
      .then(jsonResponse => setUser(jsonResponse))
      isCancelled.current = true


      return () => {
        isCancelled.current = true;
      };
  }, []);

if (user) {


  return ( 
    <div>
      <div className="user-profile">
        <Navbar />
        <section className="hex-container">

          <div className="t">

            <div>
              <div className="triangle">
                <p className="user-dob">{dob}</p>
              </div>
            </div>

            <div>
              <div className="triangle"> profile pic
                <section className="image-triangle">
                  <img src={user.picture} alt="" />
                </section>
              </div>
            </div>

            <div>
              <div className="triangle">
                <section className="astro-sign">Taurus</section>
              </div>
            </div>

            <div>
              <div className="triangle">
                <section className="gender">{user.gender}</section>
              </div>
            </div>

            <div>
              <div className="triangle">
                <p className="user-name">{user.firstName} {user.lastName}</p>
              </div>
            </div>

            <div>
              <div className="triangle">
                <ul className="location">
                  <li>{user?.location?.city},</li>
                  <li>{user?.location?.state},</li>
                   <li>{user?.location?.country}</li>
                </ul>

              </div>
            </div>
          </div>
        </section>
      </div>
    </div>
  );
} else {
  return (<p>loading</p>)
} } 

export default UserProfile;
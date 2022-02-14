import React, { useState, useRef, useEffect } from "react";

import Navbar from "./Navbar";
import moment from "moment";
import "../CSS/userprofile.css";

const API_KEY = process.env.REACT_APP_API_KEY;

function UserProfile() {
  // let dob = moment("1996-04-30T19:26:49.610Z").utc().format('YYYY-MM-DD')
  const [user, setUser] = useState([])
  const isCancelled = useRef(false)

  function convertDOB(dob) {
    return moment(dob).utc().format('YYYY-MM-DD')
  }

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
        <div className="profile-container">
        <section className="hex-container">

          <div className="t">

            <div>
              <div className="triangle tri-one">
                <p className="triangle-1">{convertDOB(user.dateOfBirth)}</p>
              </div>
            </div>

            <div>
              <div className="triangle tri-two"> profile pic
                <section className="triangle-2">
                  <img src={user.picture} alt="" />
                </section>
              </div>
            </div>

            <div>
              <div className="triangle tri-three">
                <section className="triangle-3">Taurus</section>
              </div>
            </div>

            <div>
              <div className="triangle tri-six">
                <section className="triangle-6">{user.gender}</section>
              </div>
            </div>

            <div>
              <div className="triangle tri-five">
                <p className="triangle-5">{user.firstName} {user.lastName}</p>
              </div>
            </div>

            <div>
              <div className="triangle tri-four">
                <ul className="triangle-4">
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
    </div>
  );
} else {
  return (<p>loading</p>)
} } 

export default UserProfile;
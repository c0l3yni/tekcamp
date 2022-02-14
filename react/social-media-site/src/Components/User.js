import React from "react";
import "../CSS/user.css";

function User({ UserName }) {
  return (
    <div>
      <section className="user-container">
        <h1 className="user-name">{UserName}</h1>
      </section>
    </div>
  );
}

export default User;

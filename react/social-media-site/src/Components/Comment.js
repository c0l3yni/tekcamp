import React from "react";
import "../CSS/comment.css";


function Comment({ comment }) {
  return (
    <div>
      <div className="image-text-container">
      <div className="image-container">
        <img className="user-pic" src={comment.owner.picture} alt="" />
      </div>
      <section className="text">
        <li className="name">{`${comment.owner.firstName} ${comment.owner.lastName}`}</li>
        <li className="message">{comment.message}</li>
      </section>
      </div>
    </div>
  );
}

export default Comment;

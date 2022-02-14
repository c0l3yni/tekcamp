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
          <ul>
            <li className="name">{`${comment.owner.firstName} ${comment.owner.lastName}`}</li>
            <li className="message">{comment.message}</li>
          </ul>
        </section>
      </div>
    </div>
  );
}

export default Comment;

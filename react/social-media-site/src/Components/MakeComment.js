import React, { useState } from "react";
import "../CSS/makecomment.css";

const API_KEY = process.env.REACT_APP_API_KEY;

function MakeComment({ postId, comments, setComments }) {
  const [message, setMessage] = useState("");

  function onInputChange(event) {
    setMessage(event.target.value);
  }

  function onFormSubmit(event) {
    event.preventDefault();
    addComment();
    setMessage("");
  }

  function addComment() {
    fetch(`https://dummyapi.io/data/v1/comment/create`, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
        "app-id": API_KEY,
      },
      body: JSON.stringify({
        message: message,
        owner: "60d0fe4f5311236168a109ca",
        post: postId,
      }),
    })
      .then((response) => response.json())
      .then((data) => {
        setComments([data, ...comments]);
      });
  }

  return (
    <div>
      <form onSubmit={onFormSubmit}>
        <label>
        <input
          className="input"
          type="text"
          onChange={onInputChange}
          value={message}
        />
        </label>
        <button className="button input-button" type="submit">
          Comment
        </button>
      </form>
    </div>
  );
}

export default MakeComment;

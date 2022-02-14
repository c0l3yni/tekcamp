import React, { useState } from "react";
import "../CSS/likes.css";

function Likes({ quantity }) {
  const [likes, setLikes] = useState(quantity);
  const [isLiked, setIsLiked] = useState(false);

  function addLike() {
    setLikes(likes + 1);
  }

  function unLike() {
    setLikes(likes - 1);
  }

  function handleLike() {
    if (isLiked) {
      unLike();
      setIsLiked(false);
    } else {
      addLike();
      setIsLiked(true);
    }
  }

  return (
    <div>
      <aside className="likes-container">
        <button className="button" onClick={() => handleLike()}>
          {likes} Likes
        </button>
      </aside>
    </div>
  );
}

export default Likes;

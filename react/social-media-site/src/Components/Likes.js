import React, {useState} from "react";


function Likes() {
  const [likes, setLikes] = useState(40);
  const [isLiked, setIsLiked] = useState(false);
  

  function addLike() {
    setLikes(likes + 1)
  }

  function unLike() {
    setLikes(likes - 1)
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
       <section className="like-flex-container">
          <aside className="likesCountHeader">Likes</aside>
      <button className="likeButton" onClick={()=>handleLike()}>{likes} Likes</button>
      </section>
    </div>
  )
  };

export default Likes;
import React from "react";
import Post from "./Post";
import Likes from "./Likes";
import Comment from "./Comment";
import User from "./User"
import "../CSS/hexcontainer.css";

function HexContainer({ post }) {
  return (
    <div>
      <aside className="hex-container">
        <User UserName={`${post.owner.firstName} ${post.owner.lastName}`} />
        {post.publishDate}
        <img className="post-image" src={post.image} alt="" />
        <Likes quantity={post.likes} />
        <Post PostBody={post.text} />
        <Comment postId={post.id} />
      </aside>
    </div>
  )
}

export default HexContainer;
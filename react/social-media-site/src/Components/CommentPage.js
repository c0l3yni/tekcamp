import React from "react";
import Comment from "./Comment";
import Navbar from "./Navbar";
import MakeComment from "./MakeComment";
import { Link } from "react-router-dom";

function CommentPage({ post }) {


  return (
    <div>
      <Navbar />
      <section className="comment-container">
        <input className="add-comment">
          {/* <MakeComment /> */}
        </input>
        <Link to="/commentpage">
          <button className="comment-btn">Add Comment</button>
        </Link>
        {/* <Comment {post.id} /> */}
      </section>
    </div>
  )
};

export default CommentPage;
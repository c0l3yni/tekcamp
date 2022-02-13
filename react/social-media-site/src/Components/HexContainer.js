import React from "react";
import Post from "./Post";
import Likes from "./Likes";
import Comment from "./Comment";
import CommentPage from "./CommentPage";
import User from "./User"
import "../CSS/hexcontainer.css";
import { Link } from "react-router-dom";

function HexContainer({ post }) {

  return (
    <div>
      <section className="hex-container">
        <div className="t">
          <div>
            <div className="triangle">
              <p className="user-name">
                <User UserName={`${post.owner.firstName} ${post.owner.lastName}`} />
              </p>
            </div>
          </div>

          <div>
            <div className="triangle"> profile pic
              <section className="triangle-2">
                <img src={post.owner.picture} alt="" />
              </section>
            </div>
          </div>

          <div>
            <div className="triangle">
              <ul className="post-info">
                <li><Post PostBody={post.text} /></li>
                <li className="post-date">{post.publishDate}</li>
              </ul>
            </div>
          </div>

          <div>
            <div className="triangle">
              <section className="likes">
                <Likes quantity={post.likes} />
              </section>
            </div>
          </div>

          <div>
            <div className="triangle">
            <section className="post-image">
              <img src={post.image} alt="" />
              </section>
            </div>
          </div>

          <div>
            <div className="triangle">
              <section className="comments">
                {/* <Link to="/commentpage"> */}
                  <button>Comments</button>
                {/* </Link> */}
                {/* <Comment postId={post.id} /> */}
              </section>
            </div>
          </div>
        </div>
      </section>
    </div>

  )
}

export default HexContainer;
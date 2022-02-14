import React from "react";
import Post from "./Post";
import Likes from "./Likes";
import CommentSection from "./CommentSection";
import moment from "moment";
import User from "./User";
import "../CSS/hexcontainer.css";

function HexContainer({ post }) {

  function convertPostDate(publishDate) {
    return moment(publishDate).utc().format('MM-DD-YYYY')
  }

  return (
    <div>
      <section className="hex-container">
        <div className="t">
          <div>
            <div className="triangle tri-one">
              <div className="user-name-container">
                <User className="user-name"
                  UserName={`${post.owner.firstName} ${post.owner.lastName}`}
                />
              </div>
            </div>
          </div>

          <div>
            <div className="triangle tri-two">
              <section className="post-owner-picture">
                <img src={post.owner.picture} alt="" />
              </section>
            </div>
          </div>

          <div>
            <div className="triangle tri-three">
              <ul className="post-info">
                <li>
                  <Post PostBody={`"${post.text}"`} />
                </li>
              </ul>
            </div>
          </div>

          <div>
            <div className="triangle tri-six">
              <section className="likes">
                <Likes quantity={post.likes} />
              </section>
            </div>
          </div>

          <div>
            <div className="triangle tri-five">
              <section className="post-image">
                <img src={post.image} alt="" />
              </section>
            </div>
          </div>

          <div>
            <div className="triangle tri-four">
            
              <li className="post-date">{`Posted on ${convertPostDate(post.publishDate)}`}</li>
                {/* <button className="button">Comments</button> */}
              
            </div>
          </div>
          
          <div className="comment-list">
            <CommentSection postId={post.id} />
          </div>
        </div>
      </section>
    </div>
  );
}

export default HexContainer;

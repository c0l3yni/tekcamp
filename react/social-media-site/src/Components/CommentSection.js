import React, { useState, useRef, useEffect } from "react";
import Comment from "./Comment";
import MakeComment from "./MakeComment";
import "../CSS/commentsection.css";

const API_KEY = process.env.REACT_APP_API_KEY;

function CommentSection({ postId }) {
  const [comments, setComments] = useState([]);
  const isCancelled = useRef(true);
  useEffect(() => {
    fetch(`https://dummyapi.io/data/v1/post/${postId}/comment?limit=10`, {
      headers: {
        "app-id": API_KEY,
      },
    })
      .then((response) => response.json())
      .then((jsonResponse) => {
        if (isCancelled.current) {
          setComments(jsonResponse.data);
          createList();
        }
      });

    return () => {
      isCancelled.current = false;
    };
  });

  function createList() {
    let commentList = comments.map((comment) => {
      return <Comment key={comment.id} comment={comment} />;
    });
    return commentList;
  }

  return (
    <div>
      <section className="comment-container">
        <p className="comment-section-header">Comment Section</p>
        <MakeComment
          postId={postId}
          setComments={setComments}
          comments={comments}
        />
        {createList()}
      </section>
    </div>
  );
}

export default CommentSection;

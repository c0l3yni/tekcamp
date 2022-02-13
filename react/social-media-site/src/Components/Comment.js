import React, { useEffect, useRef, useState } from "react";
import '../CSS/comment.css';

const API_KEY = process.env.REACT_APP_API_KEY;

function Comment({ postId }) {
  const [comments, setComments] = useState([]);
  const isCancelled = useRef(false)
  useEffect(() => {

    if (isCancelled.current) {
      fetch(`https://dummyapi.io/data/v1/post/${postId}/comment?limit=10`, {
        headers: {
          'app-id': API_KEY
        }
      })

      .then(response => response.json())
      .then(jsonResponse => setComments(jsonResponse.data))
      isCancelled.current = true
    }


    return () => {
      isCancelled.current = true;
    };
  }, [isCancelled]);
  
  let commentList = comments.map(comment => {
    return (
      <div key={comment.id}>
        <img src={comment.owner.picture} alt="" />
        <li>{`${comment.owner.firstName} ${comment.owner.lastName}`}</li>
        <li>{comment.message}</li>
      </div>
    )
  });

  return (
    <div>
      <section className="comment-container">
        <p className="comment-section-header">Comment Section</p>
        {commentList}
      </section>
    </div>
  )
};

export default Comment;

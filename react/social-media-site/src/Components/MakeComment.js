import React, { useState } from "react";
import CommentPage from "./CommentPage";

const API_KEY = process.env.REACT_APP_API_KEY;

function MakeComment( { comment }) {
  // const history = useHistory();
  const [isSending, setIsSending] = useState(false);
	const { register, errors, handleSubmit } = CommentPage();

	const onSubmit = data => {
		setIsSending(true);


  function addComment(comment) {
    fetch(`https://dummyapi.io/data/v1/comment/create`,
      {
        method: "POST", 
        body: JSON.stringify(comment),
        headers: {
          'Content-Type': 'application.json',
          'app-id': API_KEY,
      }
    }
    ).then(() => {
      history.replace('/');
    })
    )}
  return (
    <form onSubmit={handleSubmit(onSubmit)}>
      <div
        name="comment"
        placeholder="Your Comment"
        rows="5"
        ref={register({ required: true, maxLength: 500 })}
      />
      {errors.comment && (
        <span>You need to write something</span>
      )}
      <button
        type="submit"
        disabled={isSending}
        value={isSending ? "Sending Comment..." : "Send Comment"}
      />
    </form>
    
);
}}

export default MakeComment;
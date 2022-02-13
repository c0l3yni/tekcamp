import React from "react";
import Comment from "./Comment";
import Navbar from "./Navbar";

function CommentPage({}) {

  
const commentList = document.getElementsByClassName('');

// for (let i = 0; i < commentList.length; i++) {
//   questionList[i].addEventListener('mouseenter', () => {
//     document.body.style.cursor = 'pointer';
//   });

//   questionList[i].addEventListener('mouseleave', () => {
//     document.body.style.cursor = 'default';
//   });

//   questionList[i].addEventListener('click', function () {
//     this.classList.toggle('active');
//     let answerList = this.lastElementChild;
//     let question = this.firstElementChild;
//     let arrow = question.firstElementChild

//     if (answerList.style.display === 'block') {
//       answerList.style.display = 'none';
//       question.style.fontWeight = 'normal';
//       arrow.style.transform = 'rotate(0deg)';

//     } else {
//       answerList.style.display = 'block';
//       question.style.fontWeight = 'bold';
//       arrow.style.transform = 'rotate(180deg)';
//     }
//   });
// }
  return (
    <div>
      <Navbar />
      <section className="comment-container">
        <input className="add-comment">{/* <MakeComment /> */}</input>
        <button className="comment-btn">Add Comment</button>
        <Comment />
      </section>
    </div>
  );
}

export default CommentPage;

import React from "react";



function Comment({comment}) {

return (
  <div>
    <section className="comment-flex-container">
          <aside className="commentSectionHeader">Comment Section</aside>
    <ul className="comment-body">{comment}</ul>
    </section>

  </div>
)
};

export default Comment;

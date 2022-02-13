import React from "react";
import '../CSS/post.css';

function Post({PostBody}) {


return (
  <div>
    <section className="post-container">
      <p className="post">{PostBody}</p>
    </section>
  </div>
)};

export default Post;
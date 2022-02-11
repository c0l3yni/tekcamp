import React from "react";
import '../CSS/post.css';

function Post({PostBody}) {


return (
  <div>
    <section className="post-container">
    <h2 className="post">{PostBody}</h2>
    </section>
  </div>
)};

export default Post;
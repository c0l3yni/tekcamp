import React, { useEffect, useRef, useState } from "react";
import HexContainer from "./HexContainer";
import "../CSS/newsfeed.css";
import Navbar from "./Navbar";

const API_KEY = process.env.REACT_APP_API_KEY;

function Newsfeed() {
  const [posts, setPosts] = useState([]);
  const isCancelled = useRef(true);

  useEffect(() => {
    fetch("https://dummyapi.io/data/v1/post", {
      headers: {
        "app-id": API_KEY,
      },
    })
      .then((response) => response.json())
      .then((jsonResponse) => {
        if (isCancelled.current) {
          setPosts(jsonResponse.data);
        }
      });

    return () => {
      isCancelled.current = false;
    };
  }, [isCancelled]);

  let userPostList = posts.map((post) => {
    return <HexContainer key={post.id} post={post} />;
  });

  if (posts) {
    return (
      <div className="flex-container">
        <Navbar />
        <section className="newsfeed-container" key="{userPostList}">
          {userPostList}
        </section>
      </div>
    );
  } else {
    return <p>loading</p>;
  }
}

export default Newsfeed;

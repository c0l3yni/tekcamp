import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import HexContainer from "./HexContainer";
import '../CSS/newsfeed.css';

const API_KEY = process.env.REACT_APP_API_KEY; 

function Newsfeed() {

  const [posts, setPosts] = useState([]);

  useEffect(() => {
    fetch('https://dummyapi.io/data/v1/post', {
      headers: {
        'app-id': API_KEY
      }
    })
    .then(response => response.json())
    .then(jsonResponse => setPosts(jsonResponse.data))
  },[]);

  let userPostList = posts.map(post => {
    return <HexContainer post={post} />
  });
  return (
    <div>
      <Link to="/profile">
        <button>My Profile</button>
      </Link>
      <h1 className="appTitle">What the hex is going on...</h1>
      {userPostList}
  </div>
  );
}

export default Newsfeed;
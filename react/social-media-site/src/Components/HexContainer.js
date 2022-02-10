import React, { useState, useEffect } from "react";
import Post from "./Post";
import Likes from "./Likes";
import Comment from "./Comment";
import User from "./User"

// const API_KEY = process.env.REACT_APP_API_KEY; 

// function HexContainer({Post}) {

//   const [posts, setPosts] = useState([]);

//   useEffect(() => {
//     fetch('https://dummyapi.io/data/v1/post', {
//       headers: {
//         'app-id': API_KEY
//       }
//     })
//     .then(response => response.json())
//     .then(jsonResponse => setPosts(jsonResponse.data))
//   },[]);

//   let userPostList = posts.map(post => {
//     return <Post post={post} />
//   });

//   return (
//     <div className="flex-container">
//       <h1 className="appTitle">What the hex is going on...</h1>
//       {userPostList}
//     </div>
// )};

function HexContainer() {
  return (
    <div className="flex-container">
      <h1 className="appTitle">What the hex is going on...</h1>

        <Comment comment="Beautiful" />
        <Post userName="Anna" />
        <Likes />

        <Comment comment="I love it" />
        <Post userName="Michael" />
        <Likes />

        <Comment comment="Yessss" />
        <Post userName="Torr" />
        <Likes />
        
    </div>
  )
}
// prev post info 

// post info 

// next post info 



// users profile 

// likes 

// comments 

export default HexContainer;
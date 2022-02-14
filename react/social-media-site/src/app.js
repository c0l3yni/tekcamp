import React from "react";
import Newsfeed from "./Components/Newsfeed";
import UserProfile from "./Components/UserProfile";
import "./CSS/app.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";

function App() {

  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path="/" exact element={<Newsfeed />} />
          <Route path="/profile" element={<UserProfile />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;

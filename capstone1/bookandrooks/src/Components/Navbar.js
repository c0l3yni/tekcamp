import react from "react";
import "../CSS/navbar.css";

function Navbar() {
  return (
    <div className="nav-flex">
      <a className="menu" href="#menu">&#9776;</a>
      <div className="title-box">
        <h1 className="title">Books and Rooks</h1>
      </div>

      <div className="flex-left">
        <button className="button login">login</button>
      </div>

      <div className="flex-right">
        <button className="button cart">cart</button>
      </div>
    </div>
  );
}
export default Navbar;

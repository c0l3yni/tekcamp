import react from "react";
import "../CSS/navbar.css";
import { Link } from "react-router-dom";

function Navbar() {
  return (
    <div className="nav-flex">
      <a className="menu" href="#menu">
        &#9776;
      </a>
      <Link className="link" to="/">
        <div className="title-box">
          <h1 className="title">Books and Rooks</h1>
        </div>
      </Link>

      <Link to="/login">
      <div className="flex-left">
        <button className="button login">login</button>
      </div>
      </Link>
      <div className="flex-right">
        <Link className="link" to="/cart">
          <button className="button cart">cart</button>
        </Link>
      </div>
    </div>
  );
}
export default Navbar;

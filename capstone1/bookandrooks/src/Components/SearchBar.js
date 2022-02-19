import { Link } from "react-router-dom";
import SearchPage from "./SearchPage";
import "../CSS/searchbar.css";
import { useState } from "react";

function SearchBar() {
  const [input, setInput] = useState("");

  function onInputChange(event) {
    setInput(event.target.value)
  }

  return (
    <div>
      <section className="search-flex">
        <div>
          <Link to="/">
            <div className="product-button-flex">
              <button className="products-button">More Products</button>
            </div>
          </Link>
        </div>
        <div>
      {/* <form onSubmit={onFormSubmit}> */}
      <label className="search-box">
        <input
          className="search"
          type="text"
          onChange={onInputChange}
        />
        <div className="search-button-flex">

           <Link className="link" to={{pathname: `/search/${input}`}}>
            <button className="search-button" type="submit">
              Search
            </button>
            </Link>
        </div>
      </label>
      {/* </form> */}
    </div>
      </section>
    </div>
  );
}
export default SearchBar;

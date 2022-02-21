import { Link } from "react-router-dom";
import "../CSS/searchbar.css";
import React, { useState } from "react";

function SearchBar() {
  const [input, setInput] = useState("");
  function onInputChange(event) {
    setInput(event.target.value);
  }
  function onFormSubmit(event) {
    setInput("");
  }
  return (
    <div className="searchbar">
      <section className="search-flex">
        <div>
          <Link to="/">
            <div className="product-button-flex">
              <button className="products-button">More Products</button>
            </div>
          </Link>
        </div>
        <div>
          <form onSubmit={onFormSubmit}>
            <label className="search-box">
              <input
                className="search"
                placeholder="search..."
                type="text"
                onChange={onInputChange}
              />
              <div className="search-button-flex">
                <Link className="link" to={{ pathname: `/search/${input}` }}>
                  <button className="search-button" type="submit" value={input}>
                    Search
                  </button>
                </Link>
              </div>
            </label>
          </form>
        </div>
      </section>
    </div>
  );
}
export default SearchBar;

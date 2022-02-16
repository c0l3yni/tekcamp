import react, { useState } from "react";
import "../CSS/searchbar.css";

function SearchBar() {

    const [message, setMessage] = useState("");
  
    function onInputChange(event) {
      setMessage(event.target.value);
    }
  
    function onFormSubmit(event) {
      event.preventDefault();
      setMessage("");
    }
  return (
    <div>
      <section className="search-flex">
        <div>
          <div className="product-button-flex">
          <button className="products-button">
            More Products
          </button>
          </div>
        </div>

      <form onSubmit={onFormSubmit}>
        <label className="search-box">
        <input
          className="search"
          type="text"
          onChange={onInputChange}
          value={message}
        />
         <div className="search-button-flex">
        <button className="search-button" type="submit">
          Search
        </button>
        </div>
        </label>
      </form>
     
      </section>
    </div>
  );
}
export default SearchBar;
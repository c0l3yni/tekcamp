import react, { useState } from "react";
import { Link} from "react-router-dom";
import "../CSS/searchbar.css";

function SearchBar({products}) {
  const { search } = window.location;
    const [message, setMessage] = useState("");
  

    function onInputChange(event) {
      setMessage(event.target.value);
    }
  
    function onFormSubmit(event) {
      event.preventDefault();
      setMessage("");
    }

      function createList() {
    let productList = products.products?.map(function(product) {
      return (
        <p key={product.book} product={product} />
      );
    });
    return productList;
  }


  
  return (
    <div>
      <section className="search-flex">
        <div>
        <Link to="/">
          <div className="product-button-flex">
          <button className="products-button">
            More Products
          </button>
          </div>
          </Link>
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
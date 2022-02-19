import react, { useState } from "react";
import { Link, useParams } from "react-router-dom";
import Product from "./Product";

function SearchPage({ products, removeFromCart, minusFromCart, cart, addToCart }) {
  const { input } = useParams();

  function createList() {
    const listItems = products?.products?.filter(product => product.book.toLowerCase().includes(input.toLowerCase()));
    const prodList = listItems.map((product) => (
          <Product
            key={product.book}
            product={product}
            removeFromCart={removeFromCart}
            cart={cart}
            addToCart={addToCart}
            minusFromCart={minusFromCart}
          />
        )
    ); 
    if (prodList.length === 0) {
      return false;
    }
    return prodList;
  }

  return (
    <div>
      Search page
      {createList() || <p>No products match</p>}
    </div>
  );
}

export default SearchPage;

import react from "react";
import { useParams } from "react-router-dom";
import Product from "./Product";

function SearchPage({
  products,
  removeFromCart,
  minusFromCart,
  cart,
  addToCart,
}) {
  const { input } = useParams();

  function findBook() {
    let bookSearch = products?.products?.filter((product) =>
      product.book.toLowerCase().includes(input.toLowerCase())
    );
    const bookList = bookSearch.map((product) => (
      <Product
        key={product.book}
        product={product}
        removeFromCart={removeFromCart}
        cart={cart}
        addToCart={addToCart}
        minusFromCart={minusFromCart}
      />
    ));
    if (bookList.length === 0) {
      return false
    }
    return bookList;
  }
  function findAuth() {
    let authorSearch = products?.products?.filter((product) =>
      product.author.toLowerCase().includes(input.toLowerCase())
    );
    const authList = authorSearch.map((product) => (
      <Product
        key={product.book}
        product={product}
        removeFromCart={removeFromCart}
        cart={cart}
        addToCart={addToCart}
        minusFromCart={minusFromCart}
      />
    ));
    if (authList.length === 0) {
      return false
    }
    return authList;
  }
  function findCategory() {
    let categorySearch = products?.products?.filter((product) =>
      product.category.toLowerCase().includes(input.toLowerCase())
    );
    const categoryList = categorySearch.map((product) => (
      <Product
        key={product.book}
        product={product}
        removeFromCart={removeFromCart}
        cart={cart}
        addToCart={addToCart}
        minusFromCart={minusFromCart}
      />
    ));
    if (categoryList.length === 0) {
      return false
    }
    return categoryList;
  }

  return (
    <div>
      {findAuth() || <p>No products match in stock authors.</p>}
      {findBook() || <p>No products match in stock book titles.</p>}
      {findCategory() || <p>No products match in stock categories.</p>}
    </div>
  );
}

export default SearchPage;

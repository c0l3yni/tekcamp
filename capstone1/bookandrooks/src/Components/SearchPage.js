import react from "react";
import { useParams } from "react-router-dom";
import Product from "./Product";
import "../CSS/searchpage.css";

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
      return false;
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
      return false;
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
      return false;
    }
    return categoryList;
  }

  return (
    <div className="search-page">
      <div>
        {findBook() ? (
          <div>
            <div>
              <h3 className="item-available">
                Products containing search in Book Title
              </h3>
            </div>
            <div>{findBook()}</div>
          </div>
        ) : (
          <h3 className="item-unavailable">
            Could not find any books with "{input}" in the title.
          </h3>
        )}
      </div>
      <div>
        {findAuth() ? (
          <div>
            <div>
              <h3 className="item-available">
                Products containing search in Author
              </h3>
            </div>
            <div>{findAuth()}</div>
          </div>
        ) : (
          <h3 className="item-unavailable">
            Could not find any books with "{input}" in the author.
          </h3>
        )}
      </div>
      <div>
        {findCategory() ? (
        <div>
          <h3 className="item-available">
            Products containing search in Category
          </h3>
          {findCategory()}
        </div>
      ) : (
        <h3 className="item-unavailable">
          Could not find any books with "{input}" in the category.
        </h3>
      )}
      </div>
      
    </div>
  );
}

export default SearchPage;

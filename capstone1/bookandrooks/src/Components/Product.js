import React from "react";
import { Link } from "react-router-dom";
import "../CSS/product.css";
import AddToCart from "./AddToCart";
import ProductDetailAuthor from "./ProductDetailAuthor";
import ProductDetailBook from "./ProductDetailBook";
import ProductDetailCategory from "./ProductDetailCategory";
import ProductDetailImage from "./ProductDetailImage";
import ProductDetailPrice from "./ProductDetailPrice";
import ProductDetailQuantity from "./ProductDetailQuantity";

function Product({ product, addToCart, cart, listItems }) {
  return (
    <div className="product-detail-box">
      <section>{listItems}</section>
      <Link
        className="link"
        to={{
          pathname: `/productdetail/${product.book}`,
          state: {
            id: product.book,
          },
        }}
      >
        <div className="detail-box">
          <ProductDetailImage product={product} />
          <ProductDetailCategory product={product} />
          <ProductDetailPrice product={product} />
        </div>
        <div className="product-details">
          <ProductDetailBook product={product} />
          <ProductDetailAuthor product={product} />
          <ProductDetailQuantity
            product={product}
            cart={cart}
            addToCart={addToCart}
          />
        </div>
      </Link>
      <AddToCart addToCart={addToCart} product={product} />
    </div>
  );
}
export default Product;

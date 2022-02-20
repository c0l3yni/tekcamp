import React from "react";
import "../CSS/prodimage.css";

function ProductDetailImage({ product }) {
  return (
    <div>
      <section className="book-box">
        <img className="book-image" src={product.image} alt="" />
      </section>
      <br />
    </div>
  );
}
export default ProductDetailImage;
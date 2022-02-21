import React from "react";

function ProductDetailAuthor({ product }) {
  return (
    <div>
      <section>
        <p>
          <strong>Author:</strong> {product.author}
        </p>
      </section>
      <br />
    </div>
  );
}
export default ProductDetailAuthor;

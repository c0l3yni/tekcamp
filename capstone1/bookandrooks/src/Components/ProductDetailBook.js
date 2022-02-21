import React from "react";

function ProductDetailBook({ product }) {
  return (
    <div>
      <section>
        <p>
          <strong>Title:</strong> {product.book}
        </p>
      </section>
    </div>
  );
}
export default ProductDetailBook;

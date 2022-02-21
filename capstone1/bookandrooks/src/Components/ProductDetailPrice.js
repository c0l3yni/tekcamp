import React from "react";

function ProductDetailPrice({ product }) {
  return (
    <div>
      <section>
        <p className="price">${product.price}</p>
      </section>
      <br />
    </div>
  );
}
export default ProductDetailPrice;

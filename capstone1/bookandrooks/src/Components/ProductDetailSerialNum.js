import React from "react";

function ProductDetailSerialNum({ product }) {
  return (
    <div>
      <section>
        <p>
          <strong>Serial Number:</strong> {product.serialNum}
        </p>
      </section>
    </div>
  );
}
export default ProductDetailSerialNum;

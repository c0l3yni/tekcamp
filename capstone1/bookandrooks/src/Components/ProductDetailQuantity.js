import React from "react";

function ProductDetailQuantity({ product, cart }) {
  function getQty() {
    let cartItem = cart?.find((x) => x.book === product.book);
    if (cartItem) {
      return product.quantity - cartItem.qtyInCart;
    } else {
      return product.quantity;
    }
  }

  return (
    <div>
      <section>
        <p>
          <strong>Quantity In Stock:</strong> {getQty()}
        </p>
      </section>
    </div>
  );
}
export default ProductDetailQuantity;

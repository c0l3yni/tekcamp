import react, { useEffect, useState } from "react";
import "../CSS/cartpage.css";
import { Link } from "react-router-dom";
import Cart from "./Cart";

function CartPage({
  products,
  addToCart,
  minusFromCart,
  removeFromCart,
  cart,
  errorMessage,
  setErrorMessage,
}) {
  const cartItems = cart.map((product) => (
    <Cart
      key={product.serialNum}
      product={product}
      addToCart={addToCart}
      minusFromCart={minusFromCart}
      errorMessage={errorMessage}
      setErrorMessage={setErrorMessage}
      removeFromCart={removeFromCart}
    />
  ));

  function getTotal() {
    let tempTotal = 0;
    cart.map((product) => {
      tempTotal += product.qtyInCart * Number(product.price);
    });
    return tempTotal.toFixed(2);
  }

  return (
    <div className="detail-box">
      <div className="cart-and-order-box">
        <section>{cartItems}</section>

        <div className="order-summary-details">
          <div className="order-sum-title">Order Summary:</div>

          <div className="order-summary-flex">
            <div>Total Price: ${getTotal()} </div>
            
            <div className="checkout-button-box">
              <Link to="/checkout">
                <button className="checkout-button">Proceed to Checkout</button>
              </Link>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
export default CartPage;

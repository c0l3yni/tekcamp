// import { useState, useEffect } from "react";
import "../CSS/cartpage.css";
import Cart from "./Cart";

function CartPage({ removeFromCart, cart}) {

  const cartItems = cart.map((product) => (
    <Cart key={product.id} product={product} removeFromCart={removeFromCart} />
  ))

    console.log(cart)
  // for each book in inventory 


  return (
    <div>
      <div className="cart-and-order-box">
        <section>{cartItems}</section>   
        
        <div className="order-summary-details">
          <div className="order-sum-title">Order Summary:</div>

          <div className="order-summary-flex">
            <div className="items-in-cart-box">
              <div className="item-in-cart">
                {/* <div>Price: {product.product.price}</div> */}
              </div>

              <div className="item-in-cart">
                <div>Total Price: $300 </div>
              </div>
            </div>
            <div className="checkout-button-box">
              <button className="checkout-button">Proceed to Checkout</button>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
export default CartPage;

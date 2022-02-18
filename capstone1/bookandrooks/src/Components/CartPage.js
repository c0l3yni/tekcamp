// import { useState, useEffect } from "react";
import "../CSS/cartpage.css";
import Cart from "./Cart";

function CartPage({products, cart, setCart}) {
let productQuantity = products.quantity;
let productPrice = Number(products.price);
console.log(cart)
  function createList() {
    console.log(cart)
    let productList = cart.map(function(product) {
      console.log(product)
      return (
        <Cart key={product.product.book} product={product.product} />
      )
    });
    // let productList = products.products?.map(function(product) {
    //   return (
    //     <Cart key={product.book} product={product} />
    //   )
    // });
    return productList;
  }
  return (
    <div>
      <div className="cart-and-order-box">
        <section>{createList()}</section>        
        <div className="order-summary-details">
          <div className="order-sum-title">Order Summary:</div>

          <div className="order-summary-flex">
            <div className="items-in-cart-box">
              <div className="item-in-cart">
                <div>Price: {products.price}</div>
              </div>

              <div className="item-in-cart">
                <div>Total Price: {productQuantity * productPrice} </div>
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

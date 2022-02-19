import { useEffect, useState } from "react";
import "../CSS/cartpage.css";
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
  const [total, setTotal] = useState(0);
  const cartItems = cart.map((product) => (
    <Cart
      key={product.id}
      product={product}
      addToCart={addToCart}
      minusFromCart={minusFromCart}
      errorMessage={errorMessage}
      setErrorMessage={setErrorMessage}
      removeFromCart={removeFromCart}
    />
  ));
  useEffect(() => {
    let tempTotal = 0;
    cart.map((product) => {
      tempTotal += product.qtyInCart * Number(product.price);
    });
    setTotal(tempTotal.toFixed(2));
  }, []);

  return (
    <div>
      <div className="cart-and-order-box">
        <section>{cartItems}</section>

        <div className="order-summary-details">
          <div className="order-sum-title">Order Summary:</div>

          <div className="order-summary-flex">
            <div className="items-in-cart-box">
              <div className="item-in-cart">
                {/* <div>Tax:</div> */}
              </div>

              <div className="item-in-cart">
                <div>Total Price: ${total} </div>
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

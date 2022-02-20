import react, { useState } from "react";
import "../CSS/cart.css";

function Cart({
  product,
  minusFromCart,
  removeFromCart,
  addToCart,
}) {
  const [showMessage, setShowMessage] = useState(false);
  const [errorMsg, setErrorMsg] = useState("");
  const handleAddToCart = function () {
    if (product.qtyInCart >= product.quantity) {
      setShowMessage(true);
      setErrorMsg("Can not exceed in stock quantity.")
    } else {
      addToCart(product)
      setShowMessage(false);
    }
  }

  const handleMinusFromCart = function () {
    if (product.qtyInCart === 1 && showMessage === false) {
      setShowMessage(true);
      setErrorMsg("Are you sure you want to remove item from your cart?")
    } else {
      setShowMessage(false);
      minusFromCart(product)
      setErrorMsg("");
    }
    
  }
  return (
    <div className="cart-details">
      <div className="error-message-box">
        {showMessage && <div className="error-message"> {errorMsg} </div>}
      </div>
      <div className="cart-book-image-box">
        <img className="cart-book-image" src={product?.image} alt="/" />
      </div>

      <div className="cart-title">{product?.book}</div>

      <div className="descriptive-numbers">
        <div className="cart-indiv-item-quantity">
          <button
            type="submit"
            value="remove"
            className="add-item"
            onClick={() => removeFromCart(product)}
          >
            DEL
          </button>

          <button
            className="item-qty"
            type="submit"
            value="add"
            onClick={handleMinusFromCart}
          >
            -
          </button>

          <div className="quantity-cart">{product?.qtyInCart}</div>

          <button
            className="item-qty"
            type="submit"
            value="add"
            onClick={handleAddToCart}
          >
            +
          </button>
        </div>
        <div className="cart-indiv-item-price">{product?.price}</div>
      </div>
    </div>
  );
}
export default Cart;

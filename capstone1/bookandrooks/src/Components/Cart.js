import react, { useState } from "react";

function Cart({ product, removeFromCart, addToCart }) {
  //   const [cart, setCart] = useState([]);
  //   const [errorMessage, setErrorMessage] = useState('');
  //   function addItem() {
  //     let addQty = product.quantity + 1
  //     if (addQty <= product.quantity) {
  //       setCart({...cart, quantity: addQty})
  //     } else {
  //       setErrorMessage('Exceeded Available Stock!');
  //     }
  //   }
  // if (product.quantity === 0 | product.quantity === null)
  // setErrorMessage('Are you sure you want to remove this item from your cart?');

  // function subtractItem() {
  //     let lessQty = product.quantity - 1
  //     if (lessQty === 0) {
  //       lessQty.value = 0

  //     } else {
  //       setCart({...cart, quantity: lessQty})
  //     }
  //   }

  return (
    <div className="cart-details">
      <div className="cart-book-image-box">
        <img className="cart-book-image" src={product?.image} alt="/" />
      </div>

      <div className="cart-title">{product?.book}</div>

      <div className="descriptive-numbers">
        <div className="cart-indiv-item-quantity">
          {/* {errorMessage && <div className="error"> {errorMessage} </div>} */}
          <button
            type="submit"
            value="remove"
            className="add-item"
            onClick={() => removeFromCart(product.book)}
          >
            DEL
          </button>
          <button
            type="submit"
            value="remove"
            className="add-item"
            // onClick={subtractItem()}
          >
            -
          </button>
          <div className="quantity-cart">{product?.qtyInCart}</div>
          <button
            className="add-item"
            type="submit"
            value="add"
            onClick={() => addToCart(product)}
          >
            +
          </button>
          {/* {errorMessage && <div className="error"> {errorMessage} </div>} */}
        </div>
        <div className="cart-indiv-item-price">{product?.price}</div>
      </div>
    </div>
  );
}
export default Cart;

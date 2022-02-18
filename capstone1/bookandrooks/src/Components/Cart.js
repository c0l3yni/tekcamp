import react, { useState } from "react";

function Cart({ product }) {
  const [book, setBook] = useState(product);
  const [errorMessage, setErrorMessage] = useState('');
  function addItem() {
    let addQty = book.quantity + 1
    if (addQty <= book.quantity) {
      setBook({...book, quantity: addQty})
    } else {
      setErrorMessage('Exceeded Available Stock!');
    }
  }

  function subtractItem() {
    let lessQty = book.quantity - 1
    if (lessQty === 0) {
      lessQty.value =0
   
    } else {
      setBook({...book, quantity: lessQty})
    }
  }
  return (
    <div className="cart-details">
      <div className="cart-book-image-box">
        <img className="cart-book-image" src={product.image} alt="/" />
      </div>

      <div className="cart-title">{product.book}</div>

      <div className="descriptive-numbers">
        <div className="cart-indiv-item-quantity">
        {errorMessage && <div className="error"> {errorMessage} </div>}
          <button className="add-item" onClick={subtractItem}>-</button>
          <div className="quantity-cart">{book.quantity}</div>
          <button className="add-item" onClick={addItem}>+</button>
          {errorMessage && <div className="error"> {errorMessage} </div>}
        </div>
        <div className="cart-indiv-item-price">{product.price}</div>
      </div>
    </div>
  );
}
export default Cart;

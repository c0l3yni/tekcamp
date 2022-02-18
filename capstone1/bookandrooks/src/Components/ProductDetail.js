import react, { useState } from "react";
function ProductDetail({ product, addToCart }) {
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
    if (lessQty >= 0) {
    setBook({...book, quantity: lessQty})
    } else {
      setBook(lessQty)
      setErrorMessage('Are you sure you want to remove this item from your cart?');
    }
  }
  return (
    <div className="detail-box">
      <section className="book-box">
        <img className="book-image" src={product.image} alt="" />
      </section>

      <br />
      <section>
        <p className="category">
          <strong>Category:</strong> <i>{product.category}</i>
        </p>
      </section>

      <section>
        <p className="price">{product.price}</p>
      </section>
      <br />

      <div className="product-details">
        <section>
          <p>
            <strong>Title:</strong> {product.book}
          </p>
        </section>

        <section>
          <p>
            <strong>Author:</strong> {product.author}
          </p>
        </section>
        <br />

        <section>
          <p>
            <strong>Quantity In Stock:</strong> {product.quantity}
          </p>
        </section>
        <section>
          <p>
            <strong>Serial Number:</strong> {product.serialNum}
          </p>
        </section>

        <section>
          <p>
            <strong>Manufactured by:</strong> {product.manufacturer}
          </p>
        </section>

        <div className="add-to-cart-flex">
          <button
            className="add-to-cart"
            type="submit"
            value="add"
            onClick={() => addToCart(product)}
          >
            Add to Cart
          </button>
          <div className="quantity-container">
          {errorMessage && <div className="error"> {errorMessage} </div>}
          <button className="item-qty" onClick={subtractItem}>-</button>
          <div className="quantity-on-detail">{book.quantity}</div>
          <button className="item-qty" onClick={addItem}>+</button>
        </div>
        </div>
      </div>
    </div>
  );
}
export default ProductDetail;

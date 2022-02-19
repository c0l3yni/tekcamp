import React from 'react';

function AddToCart ({ product, addToCart }) {
  return (
    <div className="add-to-cart-flex">
          <button
            className="add-to-cart"
            type="submit"
            value="add"
            onClick={() => addToCart(product)}
          >
            Add to Cart
          </button>
        </div>
  )
}
export default AddToCart;


function Cart() {
  return (
    <div>
      <div className="order-summary-details">
        <div className="order-sum-title">Order Summary:</div>

        <div className="order-summary-flex">
          <div className="items-in-cart-box">
            <div className="item-in-cart">
              <div>Item 1</div>
              <div>Price: $45</div>
            </div>

            <div className="item-in-cart">
              <div>Total Price: $60</div>
            </div>
          </div>
          <div className="checkout-button-box">
            <button className="checkout-button">Proceed to Checkout</button>
          </div>
        </div>
      </div>
    </div>
  );
}
export default Cart;

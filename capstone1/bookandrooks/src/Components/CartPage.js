import Navbar from "./Navbar";
import SearchBar from "./SearchBar";
import "../CSS/cartpage.css";

function CartPage() {
  return (
    <div>
      <Navbar />
      <SearchBar />
      <div className="cart-and-order-box">
        <div className="cart-details">
          <div className="cart-book-image-box">
            <img
              className="cart-book-image"
              src="https://cdn.vox-cdn.com/thumbor/r1ML1I5tFpH5oY28mqoKL4aMVW8=/0x0:1650x2475/920x0/filters:focal(0x0:1650x2475):format(webp):no_upscale()/cdn.vox-cdn.com/uploads/chorus_asset/file/13757614/817BsplxI9L.jpg"
              alt="/"
            />
          </div>

          <div className="cart-title">Book Title</div>

          <div className="descriptive-numbers">
            <div className="cart-indiv-item-quantity">+ [ 5 ] -</div>
            <div className="cart-indiv-item-price">Price: $45</div>
          </div>
        </div>

        <div className="order-summary-details">
          <div className="order-sum-title">Order Summary:</div>

          <div className="order-summary-flex">
            <div className="items-in-cart-box">
              <div className="item-in-cart">
                <div>Item 1</div>
                <div>Price: $45</div>
              </div>

              <div className="item-in-cart">
                <div>Item 2</div>
                <div>Price: $15</div>
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
    </div>
  );
}
export default CartPage;

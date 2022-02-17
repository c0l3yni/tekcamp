import Navbar from "./Navbar";
import SearchBar from "./SearchBar";
import "../CSS/cartpage.css";
import Cart from "./Cart";

function CartPage({ products }) {
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

        <Cart />
      </div>
    </div>
  );
}
export default CartPage;

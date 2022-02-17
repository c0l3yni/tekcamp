
import { Link } from "react-router-dom";
import "../CSS/product.css";

function Product({ product, addToCart }) {

  return (
    <div className="detail-box">
      <Link
        className="link"
        to={{
          pathname: `/productdetail/${product.book}`,
          state: {
            id: product.book,
          },
        }}
      >
        <section className="book-box">
          <img className="book-image" src={product.image} alt="book" />
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
        </div>
      </Link>
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
    </div>
  );
}
export default Product;

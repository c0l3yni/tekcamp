import { Link } from "react-router-dom";
import "../CSS/product.css";
function Product({ product }) {
  return (
    <div className="detail-box">
      <Link className="link" to={{
        
        pathname: `/productdetail/${product.index}`,
        state: {
          id: product.index
        }
        }}>
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
        <Link className="link" to="/cart">
          <button className="add-to-cart">Add to Cart</button>
        </Link>
      </div>
    </div>
  );
}
export default Product;

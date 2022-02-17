
 
function ProductDetail({product}) {
  return (
    <div className="detail-box">
      <section className="book-box">
        <img
          className="book-image"
          src={product.image}
          alt=""
        />
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
          <button className="add-to-cart">Add to Cart</button>
        </div>
      </div>
    </div>
  );
}
export default ProductDetail;

import react from "react";

function Product () {

return (

  <div className="detail-box">
      <section className="book-box">
        <img
          className="book-image"
          src="https://pictures.depop.com/b0/5543036/839068852_c1e52c291997446c869fb88ae389bc6d/P0.jpg"
          alt=""
        />
      </section>

      <br />
      <section>
        <p className="category">
          <strong>Category:</strong> <i>Romance/Young Adult</i>
        </p>
      </section>

      <section>
        <p className="price">$45</p>
      </section>
      <br />

      <div className="product-details">
        <section>
          <p>
            <strong>Title:</strong> A Court of Thrones and Roses
          </p>
        </section>

        <section>
          <p>
            <strong>Author:</strong> Sarah J. Maas
          </p>
        </section>
        <br />

        <section>
          <p>
            <strong>Quantity In Stock:</strong> 3 books left
          </p>
        </section>
    
        <div className="add-to-cart-flex">
          <button className="add-to-cart">Add to Cart</button>
        </div>
      </div>
      </div>
);
}
export default Product;
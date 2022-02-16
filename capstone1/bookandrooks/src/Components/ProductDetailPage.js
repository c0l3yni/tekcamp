import react from "react";
import "../CSS/productdetailpage.css";

function ProductDetailPage() {
  return (
    <div className="detail-box">
      <section className="book-box">
        <img
          className="book-image"
          src="https://pictures.depop.com/b0/5543036/839068852_c1e52c291997446c869fb88ae389bc6d/P0.jpg"
          alt=""
        />
      </section>
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

        <section>
          <p>
            <strong>Category:</strong> Romance/Young Adult
          </p>
        </section>

        <section>
          <p>
            <strong>Price:</strong> $45
          </p>
        </section>

        <section>
          <p>
            <strong>Stock:</strong> 3 books left
          </p>
        </section>

        <section>
          <p>
            <strong>Serial Number:</strong> 4CE0460D0G
          </p>
        </section>

        <section>
          <p>
            <strong>Manufactured by:</strong> Edwards Brothers Malloy
          </p>
        </section>
      </div>
    </div>
  );
}
export default ProductDetailPage;

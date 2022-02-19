import { Link } from "react-router-dom";
import "../CSS/product.css";
import AddToCart from "./AddToCart";
import ProductDetailAuthor from "./ProductDetailAuthor";
import ProductDetailBook from "./ProductDetailBook";
import ProductDetailCategory from "./ProductDetailCategory";
import ProductDetailImage from "./ProductDetailImage";
import ProductDetailPrice from "./ProductDetailPrice";
import ProductDetailQuantity from "./ProductDetailQuantity";

function Product({ product, addToCart, listItems }) {
  return (
    <div className="detail-box">
      <section>{listItems}</section>
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
          <ProductDetailImage product={product} />
        </section>
        <ProductDetailCategory product={product} />
        <ProductDetailPrice product={product} />
        <div className="product-details">
          <ProductDetailBook product={product} />
          <ProductDetailAuthor product={product} />
          <ProductDetailQuantity product={product} />
        </div>
      </Link>
      <AddToCart addToCart={addToCart} product={product} />
    </div>
  );
}
export default Product;

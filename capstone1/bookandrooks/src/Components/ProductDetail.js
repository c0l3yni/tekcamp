import React from "react";
import ProductDetailImage from "./ProductDetailImage";
import ProductDetailCategory from "./ProductDetailCategory";
import ProductDetailPrice from "./ProductDetailPrice";
import ProductDetailBook from "./ProductDetailBook";
import ProductDetailAuthor from "./ProductDetailAuthor";
import ProductDetailQuantity from "./ProductDetailQuantity";
import ProductDetailSerialNum from "./ProductDetailSerialNum";
import ProductDetailManufacturer from "./ProductDetailManufacturer";
import AddToCart from "./AddToCart";
import "../CSS/productdetailpage.css";


function ProductDetail({ addToCart, cart, product }) {
  return (
    <div className="product-details">
      <div className="detail-box">
        <ProductDetailImage product={product} />
        <ProductDetailCategory product={product} />
        <ProductDetailPrice product={product} />
        <div className="product-details">
          <ProductDetailBook product={product} />
          <ProductDetailAuthor product={product} />
          <ProductDetailQuantity
            product={product}
            cart={cart}
            addToCart={addToCart}
          />
          <ProductDetailSerialNum product={product} />
          <ProductDetailManufacturer product={product} />
          <AddToCart addToCart={addToCart} product={product} />
        </div>
      </div>
    </div>
  );
}
export default ProductDetail;

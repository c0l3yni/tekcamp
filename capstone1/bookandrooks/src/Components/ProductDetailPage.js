import ProductDetail from "./ProductDetail";
import "../CSS/productdetailpage.css";
import { useParams } from "react-router-dom";

function ProductDetailPage({ products, cart, addToCart }) {
  const { book } = useParams();
    function grabProduct() {
      let productDetailView = products.products?.map(function(product) {
        if (product.book === book) {
          return (
          <ProductDetail 
          key={product.book} 
          product={product} 
          cart={cart} 
          addToCart={addToCart} />
          );
        }});
      return productDetailView;
    }
    
  return (
    <div>
      {grabProduct()}
    </div>
  );
}
export default ProductDetailPage;

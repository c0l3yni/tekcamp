import ProductDetail from "./ProductDetail";
import "../CSS/productdetailpage.css";
import { useParams } from "react-router-dom";

function ProductDetailPage({ products, addToCart }) {
  const { book } = useParams();

  function grabProduct() {

    let productDetailView = products.products?.map(function(product) {
      if (product.book === book) {
        
        return (
        <ProductDetail key={product.book} product={product} addToCart={addToCart} />
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

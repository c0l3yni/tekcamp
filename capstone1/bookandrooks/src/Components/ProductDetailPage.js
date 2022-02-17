import ProductDetail from "./ProductDetail";
import "../CSS/productdetailpage.css";
import SearchBar from "./SearchBar";
import Navbar from "./Navbar";
import { useParams } from "react-router-dom";

function ProductDetailPage({ products, addToCart }) {
  const { book } = useParams();
console.log(book);
  function grabProduct() {
    console.log(products.products);
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
      <Navbar />
      <SearchBar />
      {grabProduct()}
    </div>
  );
}
export default ProductDetailPage;

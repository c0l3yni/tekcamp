import react, { useEffect, useState } from "react";
import ProductDetail from "./ProductDetail";
import "../CSS/productdetailpage.css";
import SearchBar from "./SearchBar";
import Navbar from "./Navbar";
function ProductDetailPage() {

  const [products, setProducts] = useState([]);
  useEffect(() => {
    fetch("../data.json", {
      headers: {
        "Content-Type": "application/json",
        Accept: "application/json",
      },
    })
      .then(function (response) {
        return response.json();
      })
      .then(function (products) {
        setProducts(products);
      });
  }, []);
    // let i = []
    let productList = products.products?.map(function (product) {
      return <ProductDetail key={product.book} product={product} />;
    });
  return (
    <div>
      <Navbar />
      <SearchBar />
      <section>{productList}</section>
    </div>
  );
}
export default ProductDetailPage;




import react, { useState, useEffect } from "react";
import ProductDetail from "./ProductDetail";
import "../CSS/productdetailpage.css";
import SearchBar from "./SearchBar";
import Navbar from "./Navbar";
import { useParams } from "react-router-dom";

function ProductDetailPage() {

  const params = useParams();

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


function grabProduct() {
  let productDetailView = products.products?.map((product) => {
    if (product.index === params.index )  {
        return <ProductDetail key={product.book} product={product} />;
      }
    });
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

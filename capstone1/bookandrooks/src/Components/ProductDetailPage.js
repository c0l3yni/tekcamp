import react, { useState, useEffect } from "react";
import ProductDetail from "./ProductDetail";
import "../CSS/productdetailpage.css";
import SearchBar from "./SearchBar";
import Navbar from "./Navbar";

function ProductDetailPage( props) {
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


function createList() {
  let productsList = products.products?.map((product) => {
    if (product.book === "The Eight")  {
        return <ProductDetail key={product.book} product={product} />;
      }
    });
    return productsList;
}
  return (
    <div>
      <Navbar />
      <SearchBar />
      {createList()}
    </div>
  );
}
export default ProductDetailPage;

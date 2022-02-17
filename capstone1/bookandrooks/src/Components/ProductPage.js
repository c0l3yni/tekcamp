import { useEffect, useState } from "react";
import Product from "./Product";
import Navbar from "./Navbar";
import Searchbar from "./SearchBar";


function ProductPage() {
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
    let productList = products.products?.map((product) => {
      return <Product key={product.book} product={product} />;
    });
    return productList;
  }
  return (
    <div>
      <Navbar />
      <Searchbar />
      <section >
        {createList()}
        </section>
    </div>
  );
}
export default ProductPage;

import react, { useEffect, useState } from "react";
import Product from "./Product";

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
        createList();
      });
  }, []);

  console.log(products);
  function createList() {
    let productList = products.products?.map((product) => {
      return <Product key="product.id" product={product} />;
    });
    return productList;
  }
  return (
    <div>
      <section>{createList()}</section>
    </div>
  );
}
export default ProductPage;

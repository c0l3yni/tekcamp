import Product from "./Product";
import Navbar from "./Navbar";
import Searchbar from "./SearchBar";

function ProductPage({ products, addToCart }) {
  function createList() {
    let productList = products.products?.map(function(product) {
      return (
        <Product key={product.book} product={product} addToCart={addToCart} />
      );
    });
    return productList;
  }
  return (
    <div>
      <Navbar />
      <Searchbar />
      <section>{createList()}</section>
    </div>
  );
}
export default ProductPage;

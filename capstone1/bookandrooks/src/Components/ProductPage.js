import Product from "./Product";


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
      <section>{createList()}</section>

    </div>
  );
}
export default ProductPage;

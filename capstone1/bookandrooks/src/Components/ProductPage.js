import Product from "./Product";


function ProductPage({ products }) {

  function createList() {
    let productList = products.products?.map(function(product) {
      return (
        <Product key={product.book} product={product} />
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

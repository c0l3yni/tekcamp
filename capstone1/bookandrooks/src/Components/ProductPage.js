import Product from "./Product";


function ProductPage({ products, removeFromCart, addToCart, minusFromCart }) {

  function createList() {
    const listItems = products?.products?.map((product) => (
      <Product 
      key={product.book} 
      product={product} 
      removeFromCart={removeFromCart} 
      addToCart={addToCart} 
      minusFromCart={minusFromCart} />
    ));
    return listItems;
  }


  return (
    <div>
      <section>{createList()}</section>
    </div>
  );
}
export default ProductPage;

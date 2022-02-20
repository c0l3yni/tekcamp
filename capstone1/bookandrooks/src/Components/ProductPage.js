import react from "react";
import Product from "./Product";

function ProductPage({ products, product, removeFromCart, cart, addToCart, minusFromCart }) {

  function createList() {
    const listItems = products?.products?.map((product) => (
      <Product 
      key={product.book} 
      product={product} 
      removeFromCart={removeFromCart} 
      cart={cart}
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

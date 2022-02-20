import React, { useEffect, useState } from "react";
import ProductDetailAuthor from "./ProductDetailAuthor";
import ProductDetailBook from "./ProductDetailBook";
import ProductDetailCategory from "./ProductDetailCategory";
import ProductDetailImage from "./ProductDetailImage";
import ProductDetailPrice from "./ProductDetailPrice";
import ProductDetailQuantity from "./ProductDetailQuantity";

function PrivateLogin({ products, setProducts }) {

  const [newProduct, setNewProduct] = useState({
    index: "",
      book: "",
      author: "",
      image: "",
      price: "",
      quantity: "0",
      qtyInCart: 0,
      serialNum: "",
      category: "",
      manufacturer: ""
  })

  
  function createList() {
    const listItems = products?.products?.map((product) => (
      <div key={product.book}>
        <div className="detail-box">
        <section className="book-box">
          <ProductDetailImage product={product} />
        </section>
          <ProductDetailCategory product={product} />
          <ProductDetailPrice product={product} />
        <div className="product-details">
          <ProductDetailBook product={product} />
          <ProductDetailAuthor product={product} />
          <ProductDetailQuantity
            product={product}
          />
        </div>
        </div>
        <br />
        <hr />
      </div>
    ));
    return listItems;
  }

  function handleInput(event) {
    setNewProduct({...newProduct, [event.target.name]: event.target.value})
  }

  function handleAddProduct() {
      let prodList = products;
      setNewProduct({...newProduct, quantity:Number(newProduct.quantity)})
      prodList.products.push(newProduct);
      setProducts(prodList);    
  }
  return (
    <div>
      <h1>Admin View</h1>
      <h2>Add new book</h2>
      <input onChange={handleInput} name="book" placeholder="Book title..." />
      <input onChange={handleInput} placeholder="Image url..." name="image" />
      <input onChange={handleInput} placeholder="Quantity in stock..." name="quantity"/>
      <input onChange={handleInput} placeholder="Author..." name="author" />
      <input onChange={handleInput} placeholder="Price..." name="price" />

      <button onClick={handleAddProduct}>Add to inventory</button>
      <h2>Product Inventory</h2>
      <br />
      <section>{createList()}</section>
    </div>
  );
}

export default PrivateLogin;

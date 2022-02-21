import React, { useState } from "react";
import ProductDetailAuthor from "./ProductDetailAuthor";
import ProductDetailBook from "./ProductDetailBook";
import ProductDetailCategory from "./ProductDetailCategory";
import ProductDetailImage from "./ProductDetailImage";
import ProductDetailPrice from "./ProductDetailPrice";
import ProductDetailQuantity from "./ProductDetailQuantity";
import "../CSS/privatelogin.css";

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
    manufacturer: "",
  });

  function createList() {
    const listItems = products?.products?.map((product) => (
      <div key={product.book}>
        <div className="content">
          <div className="detail-box">
            <section className="book-box">
              <ProductDetailImage product={product} />
            </section>
            <ProductDetailCategory product={product} />
            <ProductDetailPrice product={product} />
            <div className="product-details">
              <ProductDetailBook product={product} />
              <ProductDetailAuthor product={product} />
              <ProductDetailQuantity product={product} />
            </div>
          </div>
          <br />
        </div>
      </div>
    ));
    return listItems;
  }

  function handleInput(event) {
    setNewProduct({ ...newProduct, [event.target.name]: event.target.value });
  }

  function handleAddProduct() {
    let prodList = products;
    setNewProduct({ ...newProduct, quantity: Number(newProduct.quantity) });
    prodList.products.push(newProduct);
    setProducts(prodList);
  }
  
  return (
    <div>
      <div className="admin-box">
        <h1 className="admin">Admin View</h1>
      </div>
      <div className="input-flex-box">
        <h2 className="add-book">Add new book</h2>
        <input
          className="input"
          onChange={handleInput}
          name="book"
          placeholder="Book title..."
        />
        <input
          className="input"
          onChange={handleInput}
          placeholder="Image url..."
          name="image"
        />
        <input
          className="input"
          onChange={handleInput}
          placeholder="Quantity in stock..."
          name="quantity"
        />
        <input
          className="input"
          onChange={handleInput}
          placeholder="Author..."
          name="author"
        />
        <input
          className="input"
          onChange={handleInput}
          placeholder="Price..."
          name="price"
        />
        <button className="inventory-button" onClick={handleAddProduct}>
          Add to inventory
        </button>
      </div>
      <div className="admin-box">
        <h2 className="inventory-title">Product Inventory</h2>
        <br />
      </div>
      <section>{createList()}</section>
    </div>
  );
}

export default PrivateLogin;

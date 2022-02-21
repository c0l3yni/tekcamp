import React, { useState } from "react";
import ProductDetailAuthor from "./ProductDetailAuthor";
import ProductDetailBook from "./ProductDetailBook";
import ProductDetailCategory from "./ProductDetailCategory";
import ProductDetailImage from "./ProductDetailImage";
import ProductDetailSerialNum from "./ProductDetailSerialNum";
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
    quantity: "",
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
              <ProductDetailSerialNum product={product} />
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

function searchInventory () {
  const productExist = products?.products?.find((x) => x.serialNum === newProduct.serialNum);
  console.log(productExist)
  if (productExist) {
    setNewProduct(productExist);
    
  }
}

function editInventory () {
  const productExist = products?.products?.find((x) => x.serialNum === newProduct.serialNum);
  if (productExist) {
    let listWithoutBook={
      products: {}
    }
    listWithoutBook.products = products?.products?.filter((x) => x.serialNum !== productExist.serialNum);
    listWithoutBook.products.push(newProduct);
    setProducts(listWithoutBook);
    console.log(listWithoutBook)
  } else {
    let prodList = products;
    setNewProduct({ ...newProduct, quantity: Number(newProduct.quantity) });
    prodList.products.push(newProduct);
    setProducts(prodList);
  }
}

  return (
    <div>
      <div className="admin-box">
        <h1 className="admin">Admin View</h1>
      </div>
      <div className="input-flex-box">
        <h2 className="add-book">Update Inventory</h2>
        <input
          className="input"
          onChange={handleInput}
          placeholder="Serial Number..."
          name="serialNum"
          value={newProduct.serialNum}
        />
        <input
          className="input"
          onChange={handleInput}
          placeholder="Book index..."
          name="index"
          value={newProduct.index}
        />
        <input
          className="input"
          onChange={handleInput}
          placeholder="Book title..."
          name="book"
          value={newProduct.book}
        />
        <input
          className="input"
          onChange={handleInput}
          placeholder="Image url..."
          name="image"
          value={newProduct.image}
        />
        <input
          className="input"
          onChange={handleInput}
          placeholder="Quantity in stock..."
          name="quantity"
          value={newProduct.quantity}
        />
        <input
          className="input"
          onChange={handleInput}
          placeholder="Author..."
          name="author"
          value={newProduct.author}
        />
        <input
          className="input"
          onChange={handleInput}
          placeholder="Price..."
          name="price"
          value={newProduct.price}
        />
        
        <input
          className="input"
          onChange={handleInput}
          placeholder="Category..."
          name="category"
          value={newProduct.category}
        />
        <input
          className="input"
          onChange={handleInput}
          placeholder="Manufacturer..."
          name="manufacturer"
          value={newProduct.manufacturer}
        />
        <div>
        <button className="inventory-button" onClick={searchInventory}>
          Search inventory
        </button>
        <button className="inventory-button" onClick={editInventory}>
          Update inventory
        </button>
        </div>
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

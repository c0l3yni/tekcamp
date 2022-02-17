import ProductPage from "./Components/ProductPage";
import ProductDetailPage from "./Components/ProductDetailPage";
import "./CSS/app.css";
import CartPage from "./Components/CartPage";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { useState, useEffect } from "react";

function App() {
  const [products, setProducts] = useState([]);
  const [cart, setCart] = useState([]);
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
  const addToCart = function(product) {
    setCart([...cart, product]);
  };
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path="/" exact element={<ProductPage products={products} addToCart={addToCart} />} />
          <Route path="/productdetail/:book" element={<ProductDetailPage products={products} addToCart={addToCart} />} />
          <Route path="/cart" element={<CartPage products={products} />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;

import ProductPage from "./Components/ProductPage";
import ProductDetailPage from "./Components/ProductDetailPage";
import "./CSS/app.css";
import CartPage from "./Components/CartPage";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { useState, useEffect } from "react";
import Navbar from "./Components/Navbar";
import SearchBar from "./Components/SearchBar";

function App() {
  const [products, setProducts] = useState([]);
  // const [cart, setCart] = useState([]);
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

  return (
    <div className="App">
      <BrowserRouter>
      <Navbar />
      <SearchBar products={products} />
        <Routes>
          <Route path="/" exact element={<ProductPage products={products} />} />
          <Route path="/productdetail/:book" element={<ProductDetailPage products={products} />} />
          <Route path="/cart" element={<CartPage products={products} />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;

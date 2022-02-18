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
  const [cart, setCart] = useState([]);
  function addItemToCart(product) {
    const productExist = products.find((x) => x.id === product.id);
        if(productExist) {
          setCart(
            cart.map((x) =>
            x.id === product.id
            ? { ...productExist, quantity: productExist.quantity + 1 }
            : x
            )
          );
        } else {
          setCart([...cart, product])
        }
    console.log(cart)
    return setCart({...cart, product})
  }

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
          <Route path="/" exact element={<ProductPage products={products} addToCart={addItemToCart} />} />
          <Route path="/productdetail/:book" element={<ProductDetailPage products={products} />} />
          <Route path="/cart" element={<CartPage products={products}  cart={cart} setCart={setCart} />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;

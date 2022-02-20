import ProductPage from "./Components/ProductPage";
import ProductDetailPage from "./Components/ProductDetailPage";
import "./CSS/app.css";
import CartPage from "./Components/CartPage";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { useState, useEffect } from "react";
import Navbar from "./Components/Navbar";
import SearchBar from "./Components/SearchBar";
import SearchPage from "./Components/SearchPage";
import CheckoutPage from "./Components/CheckoutPage";

function App() {
  const [products, setProducts] = useState([]);
  const [cart, setCart] = useState([]);
  // const [cartTotal, setCartTotal] = useState(0);

  function addToCart(product) {
    const productExist = cart?.find((x) => x.book === product.book);
    if (productExist) {
      let cartWithoutBook = cart.filter((x) => x.book !== productExist.book);
      if(product.quantity >= productExist.qtyInCart + 1) {
        productExist.qtyInCart += 1;
        setCart(cartWithoutBook.concat(productExist));
      }
    } else {
      product.qtyInCart += 1
      setCart([...cart, product]);
    }
  }

  function minusFromCart(product) {
    const productExist = cart?.find((x) => x.book === product.book);
    let cartWithoutBook = cart.filter((x) => x.book !== productExist.book);
      productExist.qtyInCart -= 1;
      if(productExist.qtyInCart >= 1) {
        setCart(cartWithoutBook.concat(productExist));       
      } else {
        setCart(cartWithoutBook)
      }
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
  }, [cart]);

  const removeFromCart = (product) => {
    let hardCopy = [...cart];
    hardCopy = hardCopy.filter((cartItem) => cartItem.book !== product.book);
    setCart(hardCopy);
  };

  return (
    <div className="App">
      <BrowserRouter>
        <Navbar />
        <SearchBar products={products} />
        <Routes>
          <Route
            path="/"
            exact
            element={
              <ProductPage
                cart={cart}
                products={products}
                addToCart={addToCart}
              />
            }
          />
          <Route
            path="/productdetail/:book"
            element={
              <ProductDetailPage 
              addToCart={addToCart}
              cart={cart}
              products={products} 
              addToCart={addToCart} />
            }
          />
          <Route
            path="/search/:input"
            element={
              <SearchPage 
              products={products} 
              removeFromCart={removeFromCart} 
              minusFromCart={minusFromCart} 
              cart={cart} 
              addToCart={addToCart} />
            }
          />
          <Route
            path="/cart"
            element={
              <CartPage
                products={products}
                removeFromCart={removeFromCart}
                addToCart={addToCart}
                minusFromCart={minusFromCart}
                cart={cart}
              />
            }
          />
          <Route
            path="/checkout"
            element={
              <CheckoutPage
                products={products}
                cart={cart}
              />
            }
          />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;

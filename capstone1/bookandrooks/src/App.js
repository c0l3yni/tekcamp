import ProductPage from "./Components/ProductPage";
import ProductDetailPage from "./Components/ProductDetailPage";
import "./CSS/app.css";
import CartPage from "./Components/CartPage";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { useState, useEffect } from "react";
import Navbar from "./Components/Navbar";
import SearchBar from "./Components/SearchBar";

function App() {
  const [products, setProducts] = useState();
 const [cart, setCart] = useState([]);
  const [cartTotal, setCartTotal] = useState(0)
  
  // function addToCart(product) {
   
  //   const productExist = products?.products.find((x) => x.book === product.book);
  //       if(productExist) {
  //         setCart(
  //           cart.filter((x) =>

  //           x.book === product.book
  //           ? { ...productExist, quantity: productExist.quantity + 1 }
  //           : x
  //           )
  //         );
  //       } else {
  //         setCart([...cart, product])
  //       }
        
  //   return setCart({...cart, product})
  // }

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
        total();
      });
  }, [cart]);

  const total = () => {
    let totalVal = 0;
    for (let i = 0; i < cart.length; i++) {
      totalVal += cart[i].price;
    }
    setCartTotal(totalVal);
  };

  function addToCart (product) {
      setCart([...cart, product]);
  };

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
          <Route path="/" exact element={<ProductPage products={products} removeFromCart={removeFromCart} addToCart={addToCart} />} />
          <Route path="/productdetail/:book" element={<ProductDetailPage products={products} addToCart={addToCart} />} />
          <Route path="/cart" element={<CartPage products={products} removeFromCart={removeFromCart} cart={cart} />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;

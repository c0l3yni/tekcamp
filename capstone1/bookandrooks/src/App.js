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
  const [cartTotal, setCartTotal] = useState(0);

  
  // const [errorMessage, setErrorMessage] = useState("");
  // function addItem() {
  //   let addQty = book.quantity + 1;
  //   if (addQty <= book.quantity) {
  //     setBook({ ...book, quantity: addQty });
  //   } else {
  //     setErrorMessage("Exceeded Available Stock!");
  //   }
  // }

  // function subtractItem() {
  //   let lessQty = book.quantity - 1;
  //   if (lessQty >= 0) {
  //     setBook({ ...book, quantity: lessQty });
  //   } else {
  //     setBook(lessQty);
  //     setErrorMessage(
  //       "Are you sure you want to remove this item from your cart?"
  //     );
  //   }
  // }

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
      if(productExist.qtyInCart > 0) {
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
                products={products}
                removeFromCart={removeFromCart}
                addToCart={addToCart}
                minusFromCart={minusFromCart}
              />
            }
          />
          <Route
            path="/productdetail/:book"
            element={
              <ProductDetailPage products={products} addToCart={addToCart} />
            }
          />
          <Route
            path="/cart"
            element={
              <CartPage
                products={products}
                removeFromCart={removeFromCart}
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

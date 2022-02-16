import react from "react";
import ProductPage from "./Components/ProductPage";
import ProductDetailPage from "./Components/ProductDetailPage";
import Navbar from "./Components/Navbar";
import "./CSS/app.css";
import SearchBar from "./Components/SearchBar";

function App() {
  return (
    <div className="App">
    <Navbar />
    <SearchBar />
    <ProductPage />
    {/* <ProductDetailPage /> */}
    </div>
  );
}

export default App;

import react from "react";
import ProductPage from "./Components/ProductPage";
import ProductDetailPage from "./Components/ProductDetailPage";
import "./CSS/app.css";

import { BrowserRouter, Route, Routes } from "react-router-dom";

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path="/" exact element={<ProductPage />} />
          <Route path="/productdetail" element={<ProductDetailPage />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;

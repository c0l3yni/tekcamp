// import { useState, useEffect } from "react";
import "../CSS/cartpage.css";
import Cart from "./Cart";

function CartPage({products}) {

  
  function createList() {
    let productList = products.products?.map(function(product) {
      return (
        <Cart key={product.book} product={product} />
      );
    });
    return productList;
  }


//     let itemPrice =Number(items.price);
//     let quantity = Number(items.quantity);
//     console.log(quantity);
  //  let cartTotalPrice = Number(itemPrice*quantity);

        
      // setCartTotalPrice(cartTotalPrice);
      // console.log(cartTotalPrice);
  
  // const getTotalCost = (productList) => {
  //     return productList.reduce((totalCost, { cost: itemCost }) => totalCost + parseFloat(itemCost), 0);
  //   };
//Adding an item
  // function addItem(){
  //   let newItem;
  //   let newItemsList = []
  //   items.map((item) => {
      
  //     if (item.index === '0') {
  //       newItem = item;
  //       console.log(newItem)
  //       newItem.quantity += 1;
  //     }
  //   })
      
  //     items.map((item) => {
  //       if(item.index !== '0') {
  //         newItemsList.push(item)
  //       }
  //     })
  //     newItemsList.push(newItem);
  //     setItems(newItemsList);
    
  
        // let newItem = items.find(item => item.index === '0')
        // newItem.quantity += 1;
        // setItems([...items.filter(item => item.index !== '0'), newItem]);
      
    
  



   
  return (
    <div>
      <div className="cart-and-order-box">
        <section>{createList()}</section>        
        <div className="order-summary-details">
          <div className="order-sum-title">Order Summary:</div>

          <div className="order-summary-flex">
            <div className="items-in-cart-box">
              <div className="item-in-cart">
                <div>Price: 112312</div>
              </div>

              <div className="item-in-cart">
                <div>Total Price: $200 </div>
              </div>
            </div>
            <div className="checkout-button-box">
              <button className="checkout-button">Proceed to Checkout</button>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
export default CartPage;

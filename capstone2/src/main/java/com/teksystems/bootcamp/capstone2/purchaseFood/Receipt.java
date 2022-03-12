package com.teksystems.bootcamp.capstone2.purchaseFood;

import com.teksystems.bootcamp.capstone2.additionalToppings.Cheese;

public class Receipt {
  private double subTotal;
  private double taxTotal;
  Cheese cheese = new Cheese();
  double number1 = cheese.getCost(3);

  public double receiptSubTotal(double number1){
    subTotal = subTotal + number1;
    return subTotal;
  }

  public double receiptTaxTotal(double subTotal) {
    taxTotal = subTotal * .0825;
    return taxTotal;
  }
}

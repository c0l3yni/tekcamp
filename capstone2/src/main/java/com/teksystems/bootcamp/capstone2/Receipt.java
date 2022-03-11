package com.teksystems.bootcamp.capstone2;

public class Receipt {
private double subTotal;

  public double getValue(double number1){
    subTotal = subTotal + number1;
    return subTotal;
  }

  private double taxTotal;

  public double getTaxTotal(double subTotal) {
    taxTotal = subTotal * .0825;
    return taxTotal;
  }
}

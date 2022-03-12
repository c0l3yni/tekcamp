package com.teksystems.bootcamp.capstone2.Checkout;
import com.teksystems.bootcamp.capstone2.Menu.Entree.HardCheese;

public class Receipt {
  private double subTotal;
  private double taxTotal;
  HardCheese hardCheese = new HardCheese();
  double number1 = hardCheese.getCost();

  public double receiptSubTotal(double number1){
    subTotal = subTotal + number1;
    return subTotal;
  }

  public double receiptTaxTotal(double subTotal) {
    taxTotal = subTotal + (subTotal * .0825);
    return taxTotal;
  }
}

package com.teksystems.bootcamp.ood_exercises.facade;

import java.text.DecimalFormat;

public class PaymentSystem {
  public boolean takePayment(String name, int quantity, int orderNum, String cardInfo) {
    GenerateBill bill = new GenerateBill();
    double paymentDue = bill.generateBill(name, quantity);
    DecimalFormat df = new DecimalFormat("#.00");
    int orderNumber = bill.orderNum();
    System.out.println("____________________");
    System.out.println("Retrieving bill...");
    System.out.println("Today's total is " + df.format(paymentDue) + " with an order number of " + orderNumber + ".");
    System.out.println("____________________");
    System.out.println("Please enter your card information:");
    System.out.println(cardInfo);
    return true;
  }
}

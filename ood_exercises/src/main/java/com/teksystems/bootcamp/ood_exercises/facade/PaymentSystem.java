package com.teksystems.bootcamp.ood_exercises.facade;

public class PaymentSystem {
  public boolean takePayment(String name, int quantity, int orderNum, String cardInfo) {
    GenerateBill bill = new GenerateBill();
    double paymentDue = bill.generateBill(name, quantity);
    int orderNumber = bill.orderNum();
    System.out.println("Today's total is " + paymentDue + " with an order number of " + orderNumber + ".");
    System.out.println("____________________");
    System.out.println("Please enter your card information:");
    System.out.println(cardInfo);
    return true;
  }
}

package com.teksystems.bootcamp.ood_exercises.facade;

import java.text.DecimalFormat;

public class OrderFacade {
  CheckStock checkStock = new CheckStock();
  PaymentSystem paymentSystem = new PaymentSystem();
  GenerateBill generateBill = new GenerateBill();
  int orderNumber = generateBill.orderNum();


  public void orderItemFacade (String name, int quantity, String address, String cardInfo) {
    boolean stockAvail = checkStock(name, quantity);
    if (stockAvail) {
      generateBill(name, quantity);
      boolean paymentSuccess = paymentSystem.takePayment(name, quantity, orderNumber, cardInfo);
      if (paymentSuccess) {
        shipOrder(address);
      }
    }
  }

  public boolean checkStock (String name, int quantity) {
    boolean stockAvail = checkStock.checkStock(name, quantity);
    if (stockAvail && quantity > 0) {
      System.out.println("Adding " + quantity + " " + name + " to your cart.");
    } else {
      System.out.println("Cannot add to cart");
    }
    return stockAvail && quantity > 0;
  }

  public void generateBill(String name, int quantity) {
    double bill = generateBill.generateBill(name, quantity);
    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println("Your current total is $" + df.format(bill));
    }

  public void shipOrder(String address) {
    System.out.println("____________________");
    System.out.println("What address should we ship the order to?");
    System.out.println(address);
    System.out.println("Order Shipped");
  }
}

package com.teksystems.bootcamp.ood_exercises.facade;

import java.text.DecimalFormat;

public class OrderFacade {

  CheckStock checkStock = new CheckStock();
  PaymentSystem paymentSystem = new PaymentSystem();
  GenerateBill generateBill = new GenerateBill();
  ShipOrder shipOrder = new ShipOrder();
  int orderNumber = generateBill.orderNum();


  public void orderItemFacade (String name, int quantity, String address, String cardInfo) {
    boolean stockAvail = checkStock(name, quantity);
    if (stockAvail) {
      generateBill(name, quantity);
      boolean paymentSuccess = paymentSystem.takePayment(name, quantity, orderNumber, cardInfo);
      if (paymentSuccess) {
        shipOrder.shipOrder(quantity, name, address);
      }
    }
  }

  public boolean checkStock (String name, int quantity) {
    boolean stockAvail = checkStock.checkStock(name, quantity);
    checkStock.soutInfo("Checking stock for " + name + "...");
    if (stockAvail && quantity > 0) {
      checkStock.soutInfo("Adding " + quantity + " " + name + " to your cart.");
    } else {
      checkStock.soutInfo("Cannot add " + name + "to your cart.");
    }
    return stockAvail && quantity > 0;
  }

  public void generateBill(String name, int quantity) {
    double bill = generateBill.generateBill(name, quantity);
    DecimalFormat df = new DecimalFormat("#.00");
    generateBill.soutInfo("Your current total is $" + df.format(bill) + " for " + quantity + " " + name);
    }


}

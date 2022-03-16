package com.teksystems.bootcamp.capstone2.Receipt;

import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Receipt {
  private double subTotal;
  private double taxTotal;
  private int min = 500;
  private int max = 1000;
  private List<MenuItem> items = new ArrayList<>();
  private int orderNum;

  public Receipt() {
    orderNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
  }

  public double receiptSubTotal(double number1){
    subTotal = subTotal + number1;
    return subTotal;
  }

  public void addItem(MenuItem item) {
    items.add(item);
  }

  public double receiptTaxTotal(double subTotal) {
    taxTotal = subTotal + (subTotal * .0825);
    return taxTotal;
  }

  public List<MenuItem> getItems() {
    return items;
  }

  public int getOrderNum() {
    return orderNum;
  }

  public void printReceipt() {
    Date currentDate = new Date();
    System.out.println(" ");
    System.out.println("=======================================");
    System.out.println("             Char-Cuties");
    System.out.println("      " + currentDate);
    System.out.println("     Thank you for dining with us!     ");
    System.out.println("=======================================");
    List<String> createOrderList = new ArrayList<>();
    for (int i = 0; i < items.size(); i++) {
      MenuItem item = items.get(i);
      DecimalFormat df = new DecimalFormat("#.00");
      System.out.println(item.getName() + " $" + df.format(item.getCost()));
    }
    System.out.println("=======================================");
    System.out.println("Order Number: " + orderNum);
    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println("Subtotal is " + "$ " + df.format(subTotal));
    System.out.println("Total due today is " + "$ " + df.format(taxTotal));
    System.out.println("=======================================");
  }
}
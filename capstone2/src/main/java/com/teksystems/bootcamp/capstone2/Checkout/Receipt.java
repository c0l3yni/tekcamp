package com.teksystems.bootcamp.capstone2.Checkout;

import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;

import java.util.ArrayList;
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
}
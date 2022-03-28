package com.teksystems.bootcamp.ood_exercises.facade;

import java.util.Map;

public class GenerateBill {
  private int min = 100;
  private int max = 1000;
  private int orderNum;

  public double generateBill(String name, int quantity) {
    System.out.println("____________________");
    System.out.println("Retrieving bill...");
    for (Map.Entry<Integer, Item> entry : CheckStock.findInventoryList().entrySet()) {
      Item item = entry.getValue();
      if (item.getName().equals(name)) {
        if (item.getQuantity() >= quantity) {
          double total = quantity * item.getCost();
          return total;
        }
      }
    }
    return 0;
  }

  public int orderNum() {
    orderNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return orderNum;
  }
}


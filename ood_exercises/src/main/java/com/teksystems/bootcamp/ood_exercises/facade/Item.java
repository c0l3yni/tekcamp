package com.teksystems.bootcamp.ood_exercises.facade;

public class Item {
  private final int quantity;
  private final double cost;
  private final String name;

  public Item(String name, double cost, int quantity) {
    this.name = name;
    this.cost = cost;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getCost() {
    return cost;
  }
}

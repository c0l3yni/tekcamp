package com.teksystems.bootcamp.ood_exercises.facade;

public class Item implements Orderable {
  private final int quantity;
  private final double cost;
  private final String name;

  public Item(String name, double cost, int quantity) {
    this.name = name;
    this.cost = cost;
    this.quantity = quantity;
  }


  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getQuantity() {
    return quantity;
  }

  @Override
  public double getCost() {
    return cost;
  }
}

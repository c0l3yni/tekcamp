package com.teksystems.bootcamp.capstone2.MenuItem;

public abstract class MenuItem {
  private final double cost;
  private final String name;

  protected MenuItem(String name, double cost) {
    this.name = name;
    this.cost = cost;
  }

  public String getName() {
    return name;
  }

  public double getCost() {
    return cost;
  }
}

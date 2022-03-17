package com.teksystems.bootcamp.capstone2.MenuItem;

public class MenuItem {
  private final double cost;
  private final String name;

  public MenuItem(String name, double cost) {
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

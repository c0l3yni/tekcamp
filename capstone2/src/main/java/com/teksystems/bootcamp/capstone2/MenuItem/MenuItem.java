package com.teksystems.bootcamp.capstone2.MenuItem;

public abstract class MenuItem {
  private double cost;
  private String name;

  protected MenuItem(String name, double cost) {
    this.name = name;
    this.cost = cost;
  }

  public MenuItem() {

  }

  public String getName() {
    return name;
  }

  public double getCost() {
    return cost;
  }
}

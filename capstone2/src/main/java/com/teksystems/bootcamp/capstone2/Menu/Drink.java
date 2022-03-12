package com.teksystems.bootcamp.capstone2.Menu;

import java.util.HashMap;

public class Drink extends Menu{
  private double cost = 2.15;

  @Override
  public double getCost() {
    return cost;
  }

  public static HashMap<String, String> findDrinkNumber() {
    HashMap<String, String> findDrinkType = new HashMap<>();
    findDrinkType.put("0", "Ice Water");
    findDrinkType.put("1", "Sweet Tea");
    findDrinkType.put("2", "Unsweetened Tea");
    findDrinkType.put("3", "Hot Coffee");
    findDrinkType.put("4", "Iced Coffee");
    return findDrinkType;
  }
}

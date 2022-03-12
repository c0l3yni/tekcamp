package com.teksystems.bootcamp.capstone2.additionalToppings;

import java.util.HashMap;

public class Cheese {
  private final double cost = 3.00;

  public double getCost(double cost) {
    return cost;
  }

  public static HashMap<String, String> findCheeseNumber(String cheeseNumber, String cheeseType) {
    HashMap<String, String> findCheeseType = new HashMap<>();
    findCheeseType.put("0", "Manchego");
    findCheeseType.put("1", "White-Cheddar");
    findCheeseType.put("2", "Swiss");
    findCheeseType.put("3", "Gouda");

    findCheeseType.get("0");
    findCheeseType.get("1");
    findCheeseType.get("2");
    findCheeseType.get("3");
    System.out.println(findCheeseType);
    return findCheeseType;
  }
}


package com.teksystems.bootcamp.capstone2.Menu.Entree;

import com.teksystems.bootcamp.capstone2.Menu.Entree.Cheese;

import java.util.HashMap;

public class HardCheese extends Cheese {
  private double cost = 3.00;

  @Override
  public double getCost() {
    return cost;
  }

  public static HashMap<String, String> findCheeseNumber() {
    HashMap<String, String> findCheeseType = new HashMap<>();
    findCheeseType.put("0", "Manchego");
    findCheeseType.put("1", "White-Cheddar");
    findCheeseType.put("2", "Swiss");
    findCheeseType.put("3", "Gouda");

    findCheeseType.get("0");
    findCheeseType.get("1");
    findCheeseType.get("2");
    findCheeseType.get("3");
    return findCheeseType;
  }
}


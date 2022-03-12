package com.teksystems.bootcamp.capstone2.Menu.Entree;

import com.teksystems.bootcamp.capstone2.Menu.Entree.Cheese;

import java.util.HashMap;

public class SoftCheese extends Cheese {
  private double cost = 3.00;

  @Override
  public double getCost() {
    return cost;
  }

  public static HashMap<String, String> findCheeseNumber() {
    HashMap<String, String> findCheeseType = new HashMap<>();
    findCheeseType.put("0", "Brie");
    findCheeseType.put("1", "Goat-Cheese");
    findCheeseType.put("2", "Havarti");
    findCheeseType.put("3", "Bleu-Cheese");

    findCheeseType.get("0");
    findCheeseType.get("1");
    findCheeseType.get("2");
    findCheeseType.get("3");
    return findCheeseType;
  }
}

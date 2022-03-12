package com.teksystems.bootcamp.capstone2.Menu.Side;

import java.util.HashMap;

public class Nuts extends Side {
private double cost = 1.50;
  @Override
  public double getCost() {
    return cost;
  }

  public static HashMap<String, String> findNutNumber() {
    HashMap<String, String> findNutType = new HashMap<>();
    findNutType.put("0", "Pecans");
    findNutType.put("1", "Walnuts");
    findNutType.put("2", "Pistachios");
    findNutType.put("3", "Almonds");
    return findNutType;
  }
}

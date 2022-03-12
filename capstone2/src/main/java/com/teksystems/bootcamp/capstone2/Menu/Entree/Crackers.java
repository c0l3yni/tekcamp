package com.teksystems.bootcamp.capstone2.Menu.Entree;

import com.teksystems.bootcamp.capstone2.Menu.Menu;

import java.util.HashMap;

public class Crackers extends Menu {
  private double cost = 2.00;

  @Override
  public double getCost() {
    return cost;
  }

  public static HashMap<String, String> findCrackerNumber() {
    HashMap<String, String> findCrackerType = new HashMap<>();
    findCrackerType.put("0", "Pita");
    findCrackerType.put("1", "Mini-toast");
    findCrackerType.put("2", "Wheat");
    return findCrackerType;
  }
}

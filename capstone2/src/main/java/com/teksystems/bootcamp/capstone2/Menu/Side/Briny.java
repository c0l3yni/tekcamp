package com.teksystems.bootcamp.capstone2.Menu.Side;

import com.teksystems.bootcamp.capstone2.Menu.Side.Side;

import java.util.HashMap;

public class Briny extends Side {
  private double cost = .50;
  @Override
  public double getCost() {
    return cost;
  }

  public static HashMap<String, String> findBrinyNumber() {
    HashMap<String, String> findBrinyType = new HashMap<>();
    findBrinyType.put("0", "Olives");
    findBrinyType.put("1", "Pickles");
    findBrinyType.put("2", "Onions");
    findBrinyType.put("3", "Pepperoncinis");
    return findBrinyType;
  }
}

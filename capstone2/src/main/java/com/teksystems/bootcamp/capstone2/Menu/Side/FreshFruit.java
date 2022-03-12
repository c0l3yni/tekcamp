package com.teksystems.bootcamp.capstone2.Menu.Side;

import com.teksystems.bootcamp.capstone2.Menu.Side.Side;

import java.util.HashMap;

public class FreshFruit extends Side {
  private double cost = 1.00;
  @Override
  public double getCost() {
    return cost;
  }

  public static HashMap<String, String> findFreshFruitNumber() {
    HashMap<String, String> findFreshFruitType = new HashMap<>();
    findFreshFruitType.put("0", "Grapes");
    findFreshFruitType.put("1", "Strawberries");
    findFreshFruitType.put("2", "Apples");
    findFreshFruitType.put("3", "Pears");
    return findFreshFruitType;
  }
}

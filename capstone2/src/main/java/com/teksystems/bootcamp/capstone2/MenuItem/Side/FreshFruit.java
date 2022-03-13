package com.teksystems.bootcamp.capstone2.MenuItem.Side;

import java.util.HashMap;

public class FreshFruit extends Side {

  public FreshFruit(String name, double cost) {
    super(name, cost);
  }

  public FreshFruit() {

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

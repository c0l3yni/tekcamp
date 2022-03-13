package com.teksystems.bootcamp.capstone2.MenuItem.Side;

import java.util.HashMap;

public class Vegetable extends Side {

  public Vegetable() {

  }

  public Vegetable(String name, double cost) {
    super(name, cost);
  }

  public static HashMap<String, String> findVegetableNumber() {
    HashMap<String, String> findVegetableType = new HashMap<>();
    findVegetableType.put("0", "Carrots");
    findVegetableType.put("1", "Broccoli florets");
    findVegetableType.put("2", "Cucumbers");
    findVegetableType.put("3", "Tomatoes");
    return findVegetableType;
  }

}

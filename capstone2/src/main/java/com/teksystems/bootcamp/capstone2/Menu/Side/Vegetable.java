package com.teksystems.bootcamp.capstone2.Menu.Side;

import com.teksystems.bootcamp.capstone2.Menu.Side.Side;

import java.util.HashMap;

public class Vegetable extends Side {
  private double cost = .75;
  @Override
  public double getCost() {
    return cost;
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

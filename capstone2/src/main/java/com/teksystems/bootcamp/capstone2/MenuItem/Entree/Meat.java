package com.teksystems.bootcamp.capstone2.MenuItem.Entree;

import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;

import java.util.HashMap;

public class Meat extends MenuItem {
  private double cost = 5.00;

  @Override
  public double getCost() {
    return cost;
  }

  public static HashMap<String, String> findMeatNumber() {
    HashMap<String, String> findMeatType = new HashMap<>();
    findMeatType.put("0", "Salami");
    findMeatType.put("1", "Prosciutto");
    findMeatType.put("2", "Ham");
    findMeatType.put("3", "Sopressata");
    return findMeatType;
  }
}

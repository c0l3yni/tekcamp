package com.teksystems.bootcamp.capstone2.MenuItem.Entree;

import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;

import java.util.HashMap;

public class Entree extends MenuItem {
  public Entree(String name, double cost) {

    super(name, cost);
  }

  public static HashMap<String, HashMap<String, String>> findEntreeNumber() {
  HashMap<String, HashMap<String, String>> entreeMap = new HashMap<>();
    entreeMap.put("0", Cheese.findCheeseNumber());
    entreeMap.put("1", Meat.findMeatNumber());
    entreeMap.put("2", Crackers.findCrackers());
    return entreeMap;
  }
}

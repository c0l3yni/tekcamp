package com.teksystems.bootcamp.capstone2.MenuItem.Topping;

import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;

import java.util.HashMap;

public class Topping extends MenuItem {
  public Topping(String name, double cost) {
    super(name, cost);
  }

  public static HashMap<String, String> findMenuOption() {
    HashMap<String, String> toppingMap = new HashMap<>();
    toppingMap.put("1", "Dips");
    toppingMap.put("2", "Spreads");
    return toppingMap;
  }
}

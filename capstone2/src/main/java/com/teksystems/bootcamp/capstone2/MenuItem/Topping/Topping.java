package com.teksystems.bootcamp.capstone2.MenuItem.Topping;

import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;

import java.util.HashMap;

public class Topping extends MenuItem {
  protected Topping(String name, double cost) {
    super(name, cost);
  }

  public static HashMap<String, String> findToppingNumber() {
    HashMap<String, String> toppingMap = new HashMap<>();
    toppingMap.put("0", "Dips");
    toppingMap.put("1", "Spreads");
    return toppingMap;
  }
}

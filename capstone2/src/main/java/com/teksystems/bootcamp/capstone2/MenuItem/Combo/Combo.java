package com.teksystems.bootcamp.capstone2.MenuItem.Combo;

import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Combo extends MenuItem {
  public Combo(String name, double cost) {
    super(name, cost);
  }

  public static List<String> getCombos(){
    List<String> combos = new ArrayList<>();
    combos.add("Enby of All");
    combos.add("Butch-er Block");
    return combos;
  }
  public static Map<String, String> findMenuOption() {
    Map<String, String> findComboType = new HashMap<>();
    for (int i = 0; i < getCombos().size(); i++) {
      findComboType.put(Integer.toString(i+1), getCombos().get(i));
    }
    return findComboType;
  }
}

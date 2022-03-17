package com.teksystems.bootcamp.capstone2.MenuItem.Entree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Cheese extends Entree {

  protected Cheese(String name, double cost) {
    super(name, cost);
  }

  public static List<String> getCheeses() {
    List<String> cheeses = new ArrayList<>();
    cheeses.add("Hard cheese");
    cheeses.add("Soft cheese");
    return cheeses;
  }

  public static HashMap<String, String> findMenuOption() {
    HashMap<String, String> findCheeseType = new HashMap<>();
    for (int i = 0; i < getCheeses().size(); i++) {
      findCheeseType.put(Integer.toString(i + 1), getCheeses().get(i));
    }
    return findCheeseType;
  }
}

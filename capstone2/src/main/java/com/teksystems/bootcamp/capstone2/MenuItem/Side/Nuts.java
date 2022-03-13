package com.teksystems.bootcamp.capstone2.MenuItem.Side;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Nuts extends Side {
  protected Nuts(String name, double cost) {
    super(name, cost);
  }

  public static List<Nuts> NutList() {
    List<Nuts> nuts = new ArrayList<>();
    nuts.add(new Nuts("Almonds", 2.50));
    nuts.add(new Nuts("Pistachios", 3.00));
    nuts.add(new Nuts("Cashews", 1.50));
    nuts.add(new Nuts("Pecans", 1.50));
    return nuts;
  }

  public static HashMap<String, String> findNutNumber() {
    HashMap<String, String> findNutType = new HashMap<>();
    for (int i = 0; i < NutList().size(); i++) {
      findNutType.put(Integer.toString(i), NutList().get(i).getName());
    }
    return findNutType;
  }
}

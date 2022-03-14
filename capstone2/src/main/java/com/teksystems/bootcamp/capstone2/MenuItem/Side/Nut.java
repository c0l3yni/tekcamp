package com.teksystems.bootcamp.capstone2.MenuItem.Side;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Nut extends Side {

  public Nut(String name, double cost) {

    super(name, cost);
  }

  public static List<Nut> nutList() {
    List<Nut> nuts = new ArrayList<>();
    nuts.add(new Nut("Pecans", .75));
    nuts.add(new Nut("Pistachios", 1.00));
    nuts.add(new Nut("Almonds", 1.50));
    nuts.add(new Nut("Walnuts", 1.00));
    return nuts;
  }

  public static HashMap<String, String> findNutNumber() {
    HashMap<String, String> findNutType = new HashMap<>();
    for (int i = 0; i < nutList().size(); i++){
      findNutType.put(Integer.toString(i), nutList().get(i).getName());
    }
    return findNutType;
  }
}

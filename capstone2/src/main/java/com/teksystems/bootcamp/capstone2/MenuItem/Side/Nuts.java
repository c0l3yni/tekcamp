package com.teksystems.bootcamp.capstone2.MenuItem.Side;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.SoftCheese;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Nuts extends Side {

  public Nuts(String name, double cost) {

    super(name, cost);
  }

  public static List<Nuts> nutList() {
    List<Nuts> nuts = new ArrayList<>();
    nuts.add(new Nuts("Pecans", .75));
    nuts.add(new Nuts("Pistachios", 1.00));
    nuts.add(new Nuts("Almonds", 1.50));
    nuts.add(new Nuts("Walnuts", 1.00));
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

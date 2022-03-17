package com.teksystems.bootcamp.capstone2.MenuItem.Entree;

import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Crackers extends MenuItem {

  public Crackers(String name, double cost) {
    super(name, cost);
  }

  public static List<Crackers> crackerList() {
    List<Crackers> crackers = new ArrayList<>();
    crackers.add(new Crackers("Pita", 3.00));
    crackers.add(new Crackers("Mini Toast", 3.50));
    crackers.add(new Crackers("Wheat", 2.50));
    return crackers;
  }

  public static HashMap<String, String> findMenuOption() {
    HashMap<String, String> findCrackerType = new HashMap<>();
    DecimalFormat df = new DecimalFormat("#.00");
    for (int i = 0; i < crackerList().size(); i++) {
      findCrackerType.put(Integer.toString(i + 1), crackerList().get(i).getName() + " $" + df.format(crackerList().get(i).getCost()));
    }
    return findCrackerType;
  }
}

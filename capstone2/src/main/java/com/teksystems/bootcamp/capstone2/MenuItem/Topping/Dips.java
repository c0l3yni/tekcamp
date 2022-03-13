package com.teksystems.bootcamp.capstone2.MenuItem.Topping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dips extends Topping {
  protected Dips(String name, double cost) {
    super(name, cost);
  }

  public static List<Dips> DipsList() {
    List<Dips> dips = new ArrayList<>();
    dips.add(new Dips("Hot Mustard", .50));
    dips.add(new Dips("Rosemary Hummus", 1.50));
    dips.add(new Dips("Black Pepper Ranch", .75));
    dips.add(new Dips("Balsamic and Oil", 1.00));
    return dips;
  }

  public static HashMap<String, String> findDipsNumber() {
    HashMap<String, String> findDipsType = new HashMap<>();
    for (int i = 0; i < DipsList().size(); i++) {
      findDipsType.put(Integer.toString(i), DipsList().get(i).getName());
    }
    return findDipsType;
  }
}

package com.teksystems.bootcamp.capstone2.MenuItem.Topping;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dip extends Topping{
  public Dip(String name, double cost) {
    super(name, cost);
  }

  public static List<Dip> dipList() {
    List<Dip> dips = new ArrayList<>();
    dips.add(new Dip("Hot Mustard", .50));
    dips.add(new Dip("Rosemary Hummus", 1.50));
    dips.add(new Dip("Black Pepper Ranch", .75));
    dips.add(new Dip("Balsamic and Oil", 1.00));
    return dips;
  }

  public static HashMap<String, String> findMenuOption() {
    HashMap<String, String> findDipType = new HashMap<>();
    DecimalFormat df = new DecimalFormat("#.00");
    for (int i = 0; i < dipList().size(); i++){
      findDipType.put(Integer.toString(i+1), dipList().get(i).getName() + " $" + df.format(dipList().get(i).getCost()));
    }
    return findDipType;
  }
}

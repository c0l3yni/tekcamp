package com.teksystems.bootcamp.capstone2.MenuItem.Topping;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Spread extends Topping{


  protected Spread(String name, double cost) {
    super(name, cost);
  }

  public static List<Spread> SpreadsList() {
    List<Spread> spreads = new ArrayList<>();
    spreads.add(new Spread("Fig jam", .75));
    spreads.add(new Spread("Strawberry jam", .50));
    spreads.add(new Spread("Orange Blossom Marmalade", .75));
    spreads.add(new Spread("Jalapeno Jelly", .50));
    return spreads;
  }

  public static HashMap<String, String> findSpreadsNumber() {
    HashMap<String, String> findSpreadType = new HashMap<>();
    DecimalFormat df = new DecimalFormat("#.00");
    for (int i = 0; i < SpreadsList().size(); i++) {
      findSpreadType.put(Integer.toString(i), SpreadsList().get(i).getName() + " $" + df.format(SpreadsList().get(i).getCost()));
    }
    return findSpreadType;
  }
}
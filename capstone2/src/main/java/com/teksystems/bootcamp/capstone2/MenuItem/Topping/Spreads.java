package com.teksystems.bootcamp.capstone2.MenuItem.Topping;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Spreads extends Topping {
  protected Spreads(String name, double cost) {
    super(name, cost);
  }

  public static List<Spreads> SpreadsList() {
    List<Spreads> spreads = new ArrayList<>();
    spreads.add(new Spreads("Fig jam", .75));
    spreads.add(new Spreads("Strawberry jam", .50));
    spreads.add(new Spreads("Orange Blossom Marmalade", .75));
    spreads.add(new Spreads("Jalapeno Jelly", .50));
    return spreads;
  }

  public static HashMap<String, String> findSpreadsNumber() {
    HashMap<String, String> findSpreadType = new HashMap<>();
    for (int i = 0; i < SpreadsList().size(); i++) {
      findSpreadType.put(Integer.toString(i), SpreadsList().get(i).getName());
    }
    return findSpreadType;
  }
}

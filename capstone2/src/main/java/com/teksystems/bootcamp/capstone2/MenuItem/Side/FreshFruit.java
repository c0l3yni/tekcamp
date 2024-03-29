package com.teksystems.bootcamp.capstone2.MenuItem.Side;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FreshFruit extends Side {

  public FreshFruit(String name, double cost) {

    super(name, cost);
  }

  public static List<FreshFruit> freshFruitList() {
    List<FreshFruit> freshFruit = new ArrayList<>();
    freshFruit.add(new FreshFruit("Grapes", 1.00));
    freshFruit.add(new FreshFruit("Strawberries", 1.00));
    freshFruit.add(new FreshFruit("Apples", 1.25));
    freshFruit.add(new FreshFruit("Pears", 1.00));
    return freshFruit;
  }

  public static HashMap<String, String> findMenuOption() {
    HashMap<String, String> findFreshFruitType = new HashMap<>();
    DecimalFormat df = new DecimalFormat("#.00");
    for (int i = 0; i < freshFruitList().size(); i++) {
      findFreshFruitType.put(Integer.toString(i + 1), freshFruitList().get(i).getName() + " $" + df.format(freshFruitList().get(i).getCost()));
    }
    return findFreshFruitType;
  }
}

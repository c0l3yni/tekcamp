package com.teksystems.bootcamp.capstone2.MenuItem.Entree;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HardCheese extends Cheese {
  public HardCheese(String name) {
    super(name, 3.00);
  }

  public static List<HardCheese> hardCheeseList() {
    List<HardCheese> cheeses = new ArrayList<>();
    cheeses.add(new HardCheese("Manchego"));
    cheeses.add(new HardCheese("White-Cheddar"));
    cheeses.add(new HardCheese("Swiss"));
    cheeses.add(new HardCheese("Gouda"));
    return cheeses;
  }

  public static HashMap<String, String> findMenuOption() {
    HashMap<String, String> findCheeseType = new HashMap<>();
    DecimalFormat df = new DecimalFormat("#.00");
    for (int i = 0; i < hardCheeseList().size(); i++) {
      findCheeseType.put(Integer.toString(i + 1), hardCheeseList().get(i).getName() + " $" + df.format(hardCheeseList().get(i).getCost()));
    }
    return findCheeseType;
  }
}


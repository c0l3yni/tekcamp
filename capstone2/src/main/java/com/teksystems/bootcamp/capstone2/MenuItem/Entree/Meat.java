package com.teksystems.bootcamp.capstone2.MenuItem.Entree;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Meat extends Entree {

  public Meat(String name, double cost) {
    super(name, cost);
  }

  public static List<Meat> meatList() {
    List<Meat> meats = new ArrayList<>();
    meats.add(new Meat("Salami", 4.50));
    meats.add(new Meat("Prosciutto", 5.00));
    meats.add(new Meat("Ham", 3.50));
    meats.add(new Meat("Sopressata", 4.50));
    return meats;
  }

  public static HashMap<String, String> findMenuOption() {
    HashMap<String, String> findMeatType = new HashMap<>();
    DecimalFormat df = new DecimalFormat("#.00");
    for (int i = 0; i < meatList().size(); i++){
      findMeatType.put(Integer.toString(i), meatList().get(i).getName() + " $" + df.format(meatList().get(i).getCost()));
    }
    return findMeatType;
  }
}

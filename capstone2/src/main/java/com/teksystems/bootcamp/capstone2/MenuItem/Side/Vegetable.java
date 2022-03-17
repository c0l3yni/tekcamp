package com.teksystems.bootcamp.capstone2.MenuItem.Side;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Vegetable extends Side {
  public Vegetable(String name, double cost) {
    super(name, cost);
  }

  public static List<Vegetable> VegetableList() {
    List<Vegetable> vegetables = new ArrayList<>();
    vegetables.add(new Vegetable("Carrots", 1.00));
    vegetables.add(new Vegetable("Cucumbers", 1.00));
    vegetables.add(new Vegetable("Broccoli florets", 1.00));
    vegetables.add(new Vegetable("Tomatoes", 1.00));
    return vegetables;
  }

  public static HashMap<String, String> findMenuOption() {
    HashMap<String, String> findVegetableType = new HashMap<>();
    DecimalFormat df = new DecimalFormat("#.00");
    for (int i = 0; i < VegetableList().size(); i++) {
      findVegetableType.put(Integer.toString(i + 1), VegetableList().get(i).getName() + " $" + df.format(VegetableList().get(i).getCost()));
    }
    return findVegetableType;
  }
}

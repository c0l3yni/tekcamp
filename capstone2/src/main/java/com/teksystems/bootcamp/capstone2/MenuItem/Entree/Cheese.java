package com.teksystems.bootcamp.capstone2.MenuItem.Entree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Cheese extends Entree {

  protected Cheese(String name, double cost) {
    super(name, cost);
  }

  public static List<Cheese> getCheeses(){
    List<Cheese> cheeses = new ArrayList<>();
    cheeses.addAll(HardCheese.hardCheeseList());
    cheeses.addAll(SoftCheese.softCheeseList());
    return cheeses;
  }

  public static HashMap<String, String> findCheeseNumber() {
    HashMap<String, String> findCheeseType = new HashMap<>();
    for (int i = 0; i < getCheeses().size(); i++) {
      findCheeseType.put(Integer.toString(i), getCheeses().get(i).getName());
    }
    return findCheeseType;
  }
}

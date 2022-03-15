package com.teksystems.bootcamp.capstone2.MenuItem.Entree;
import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;
import java.util.HashMap;

public class Entree extends MenuItem {
  public Entree(String name, double cost) {
    super(name, cost);
  }

  public static HashMap<String, String> findMenuOption() {
  HashMap<String, String> entreeMap = new HashMap<>();
    entreeMap.put("1", "Cheeses");
    entreeMap.put("2", "Meats");
    entreeMap.put("3", "Crackers");
    return entreeMap;
  }
}

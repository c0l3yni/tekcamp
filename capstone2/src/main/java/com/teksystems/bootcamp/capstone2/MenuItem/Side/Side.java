package com.teksystems.bootcamp.capstone2.MenuItem.Side;
import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;
import java.util.HashMap;

public abstract class Side extends MenuItem {
  protected Side(String name, double cost) {
    super(name, cost);
  }

  public static HashMap<String, String> findMenuOption() {
    HashMap<String, String> sideMap = new HashMap<>();
    sideMap.put("1", "Briny");
    sideMap.put("2", "Nuts");
    sideMap.put("3", "Fresh Fruit");
    sideMap.put("4", "Vegetables");
    return sideMap;
  }
}

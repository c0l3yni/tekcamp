package com.teksystems.bootcamp.capstone2.MenuItem.Side;
import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;
import java.util.HashMap;

public abstract class Side extends MenuItem {
  protected Side(String name, double cost) {
    super(name, cost);
  }

  public static HashMap<String, String> findSideNumber() {
    HashMap<String, String> sideMap = new HashMap<>();
    sideMap.put("0", "Briny");
    sideMap.put("1", "Nuts");
    sideMap.put("2", "Fresh Fruit");
    sideMap.put("3", "Vegetables");
    return sideMap;
  }
}

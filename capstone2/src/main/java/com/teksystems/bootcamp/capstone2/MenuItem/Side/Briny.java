package com.teksystems.bootcamp.capstone2.MenuItem.Side;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Briny extends Side {
  protected Briny(String name, double cost) {
    super(name, cost);
  }

  public static List<Briny> BrinyList() {
    List<Briny> brinys = new ArrayList<>();
    brinys.add(new Briny("Olives", .75));
    brinys.add(new Briny("Pepperoncinis", 1.00));
    brinys.add(new Briny("Onions", .50));
    brinys.add(new Briny("Pickles", .50));
    return brinys;
  }

  public static HashMap<String, String> findBrinyNumber() {
    HashMap<String, String> findBrinyType = new HashMap<>();
    for (int i = 0; i < BrinyList().size(); i++) {
      findBrinyType.put(Integer.toString(i), BrinyList().get(i).getName());
    }
    return findBrinyType;
  }
}

package com.teksystems.bootcamp.capstone2.MenuItem.Side;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Briny extends Side {

  public Briny(String name, double cost) {

    super(name, cost);
  }

  public static List<Briny> brinyList() {
    List<Briny> brinys = new ArrayList<>();
    brinys.add(new Briny("Olives", .75));
    brinys.add(new Briny("Pickles", .50));
    brinys.add(new Briny("Onions", .50));
    brinys.add(new Briny("Pepperoncinis", .75));
    return brinys;
  }

  public static HashMap<String, String> findMenuOption() {
    HashMap<String, String> findBrinyType = new HashMap<>();
    DecimalFormat df = new DecimalFormat("#.00");
    for (int i = 0; i < brinyList().size(); i++){
      findBrinyType.put(Integer.toString(i), brinyList().get(i).getName() + " $" + df.format(brinyList().get(i).getCost()));
    }
    return findBrinyType;
  }
}

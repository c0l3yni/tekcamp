package com.teksystems.bootcamp.capstone2.MenuItem.Side;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.SoftCheese;

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

  public static HashMap<String, String> findBrinyNumber() {
    HashMap<String, String> findBrinyType = new HashMap<>();
    for (int i = 0; i < brinyList().size(); i++){
      findBrinyType.put(Integer.toString(i), brinyList().get(i).getName());
    }
    return findBrinyType;
  }
}

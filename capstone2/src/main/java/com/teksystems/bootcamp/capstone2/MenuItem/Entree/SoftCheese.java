package com.teksystems.bootcamp.capstone2.MenuItem.Entree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SoftCheese extends Cheese {
  private SoftCheese(String name) {
    super(name, 3.00);
  }

  public static List<Cheese> softCheeseList() {
    List<Cheese> softCheeses = new ArrayList<>();
    softCheeses.add(new SoftCheese("Brie"));
    softCheeses.add(new SoftCheese("Goat-Cheese"));
    softCheeses.add(new SoftCheese("Havarti"));
    softCheeses.add(new SoftCheese("Bleu Cheese"));
    return softCheeses;
  }

  public static HashMap<String, String> findSoftCheese() {
    HashMap<String, String> findCheeseType = new HashMap<>();
    for (int i = 0; i < softCheeseList().size(); i++){
      findCheeseType.put(Integer.toString(i), softCheeseList().get(i).getName());
    }
    return findCheeseType;
  }
}

package com.teksystems.bootcamp.capstone2.MenuItem.Entree;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SoftCheese extends Cheese {


  public SoftCheese(String name) {
    super(name, 3.00);
  }

  public static List<SoftCheese> softCheeseList() {
    List<SoftCheese> softCheeses = new ArrayList<>();
    softCheeses.add(new SoftCheese("Brie"));
    softCheeses.add(new SoftCheese("Goat Cheese"));
    softCheeses.add(new SoftCheese("Bleu Cheese"));
    softCheeses.add(new SoftCheese("Havarti"));
    return softCheeses;
  }

  public static HashMap<String, String> findMenuOption() {
    HashMap<String, String> findCheeseType = new HashMap<>();
    DecimalFormat df = new DecimalFormat("#.00");
    for (int i = 0; i < softCheeseList().size(); i++){
      findCheeseType.put(Integer.toString(i+1), softCheeseList().get(i).getName() + " $" + df.format(softCheeseList().get(i).getCost()));
    }
    return findCheeseType;
  }
}

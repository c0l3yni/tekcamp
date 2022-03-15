package com.teksystems.bootcamp.capstone2.MenuItem;

import com.teksystems.bootcamp.capstone2.MenuItem.Drink.Drink;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EnbyOfAllCombo extends MenuItem{
  public EnbyOfAllCombo(String name, double cost) {
    super(name, cost);
  }
  public static List<EnbyOfAllCombo> drinkList() {
    List<EnbyOfAllCombo> comboOne = new ArrayList<>();
    comboOne.add(new Drink("Ice Water", 1.00));
    comboOne.add(new Drink("Sweet Tea", 1.50));
    drinks.add(new Drink("Unsweetened Tea", 1.50));
    drinks.add(new Drink("Hot Coffee", 1.00));
    drinks.add(new Drink("Iced Coffee", 1.00));
    return drinks;
  }

  public static HashMap<String, String> findMenuOption() {
    HashMap<String, String> findDrinkType = new HashMap<>();
    DecimalFormat df = new DecimalFormat("#.00");
    for (int i = 0; i < drinkList().size(); i++){
      findDrinkType.put(Integer.toString(i), drinkList().get(i).getName() + " $" + df.format(drinkList().get(i).getCost()));
    }
    return findDrinkType;
  }
}

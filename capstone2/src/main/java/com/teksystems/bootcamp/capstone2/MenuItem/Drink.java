package com.teksystems.bootcamp.capstone2.MenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Drink extends MenuItem {
  protected Drink(String name, double cost) {
    super(name, cost);
  }

  public static List<Drink> DrinkList() {
    List<Drink> drinks = new ArrayList<>();
    drinks.add(new Drink("Water", 1.50));
    drinks.add(new Drink("Sweet Tea", 2.50));
    drinks.add(new Drink("Unsweetened Tea", 2.50));
    drinks.add(new Drink("Iced Coffee", 3.00));
    drinks.add(new Drink("Hot Coffee", 3.00));
    drinks.add(new Drink("Decaf Iced Coffee", 3.00));
    drinks.add(new Drink("Decaf Hot Coffee", 3.00));
    return drinks;
  }

  public static HashMap<String, String> findDrinkNumber() {
    HashMap<String, String> findDrinkType = new HashMap<>();
    for (int i = 0; i < DrinkList().size(); i++) {
      findDrinkType.put(Integer.toString(i), DrinkList().get(i).getName());
    }
    return findDrinkType;
  }
}

package com.teksystems.bootcamp.capstone2.MenuItem;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Entree;
import com.teksystems.bootcamp.capstone2.MenuItem.Entree.SoftCheese;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Drink extends MenuItem {


  public Drink(String name, double cost) {
    super(name, cost);
  }

  public static List<Drink> drinkList() {
    List<Drink> drinks = new ArrayList<>();
    drinks.add(new Drink("Ice Water", 1.00));
    drinks.add(new Drink("Sweet Tea", 1.50));
    drinks.add(new Drink("Unsweetened Tea", 1.50));
    drinks.add(new Drink("Hot Coffee", 1.00));
    drinks.add(new Drink("Iced Coffee", 1.00));
    return drinks;
  }

  public static HashMap<String, String> findDrink() {
    HashMap<String, String> findDrinkType = new HashMap<>();
    for (int i = 0; i < drinkList().size(); i++){
      findDrinkType.put(Integer.toString(i), drinkList().get(i).getName());
    }
    return findDrinkType;
  }
}

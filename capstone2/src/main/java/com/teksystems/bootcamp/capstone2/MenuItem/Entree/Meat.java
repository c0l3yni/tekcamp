package com.teksystems.bootcamp.capstone2.MenuItem.Entree;
import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Meat extends MenuItem {
  protected Meat(String name, double cost) {
    super(name, cost);
  }

  public static List<Meat> MeatList() {
    List<Meat> meats = new ArrayList<>();
    meats.add(new Meat("Salami", 4.50));
    meats.add(new Meat("Prosciutto", 4.50));
    meats.add(new Meat("Ham", 3.50));
    meats.add(new Meat("Sopressata", 5.00));
    return meats;
  }

  public static HashMap<String, String> findMeatNumber() {
    HashMap<String, String> findMeatType = new HashMap<>();
    for (int i = 0; i < MeatList().size(); i++) {
      findMeatType.put(Integer.toString(i), MeatList().get(i).getName());
    }
    return findMeatType;
  }
}

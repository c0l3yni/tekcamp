package com.teksystems.bootcamp.capstone2.MenuItem.Side;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Vegetable extends Side {
  protected Vegetable(String name, double cost) {
    super(name, cost);
  }

  public static List<Vegetable> VegetableList() {
    List<Vegetable> vegetables = new ArrayList<>();
    vegetables.add(new Vegetable("Carrots", 1.00));
    vegetables.add(new Vegetable("Cucumbers", 1.00));
    vegetables.add(new Vegetable("Broccoli florets", 1.00));
    vegetables.add(new Vegetable("Tomatoes", 1.00));
    return vegetables;
  }

  public static HashMap<String, String> findVegetableNumber() {
    HashMap<String, String> findVegetableType = new HashMap<>();
    for (int i = 0; i < VegetableList().size(); i++) {
      findVegetableType.put(Integer.toString(i), VegetableList().get(i).getName());
    }
    return findVegetableType;
  }

}

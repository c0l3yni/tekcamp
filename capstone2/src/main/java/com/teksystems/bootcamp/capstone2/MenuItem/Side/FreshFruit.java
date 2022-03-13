package com.teksystems.bootcamp.capstone2.MenuItem.Side;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FreshFruit extends Side {
  protected FreshFruit(String name, double cost) {
    super(name, cost);
  }

  public static List<FreshFruit> FreshFruitList() {
    List<FreshFruit> freshFruits = new ArrayList<>();
    freshFruits.add(new FreshFruit("Grapes", .70));
    freshFruits.add(new FreshFruit("Strawberries", 1.00));
    freshFruits.add(new FreshFruit("Apples", .70));
    freshFruits.add(new FreshFruit("Pears", .70));
    return freshFruits;
  }

  public static HashMap<String, String> findFreshFruitsNumber() {
    HashMap<String, String> findFreshFruitsType = new HashMap<>();
    for (int i = 0; i < FreshFruitList().size(); i++) {
      findFreshFruitsType.put(Integer.toString(i), FreshFruitList().get(i).getName());
    }
    return findFreshFruitsType;
  }
}

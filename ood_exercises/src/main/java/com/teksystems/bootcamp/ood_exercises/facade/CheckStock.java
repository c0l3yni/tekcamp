package com.teksystems.bootcamp.ood_exercises.facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckStock {
  public static List<Item> stockList() {
    List<Item> items = new ArrayList<>();
    items.add(new Item("Octopus", 200.00, 3));
    items.add(new Item("Omelette", 8.00, 0));
    return items;
  }

  public static HashMap<Integer, Item> findInventoryList() {
    HashMap<Integer, Item> findInventory = new HashMap<>();
    for (int i = 0; i < stockList().size(); i++){
      findInventory.put((i+1), stockList().get(i));
    }
    return findInventory;
  }

  public boolean checkStock(String name, int quantity) {
    System.out.println("____________________");
    System.out.println("Checking checkStock...");
    for (Map.Entry<Integer, Item> entry : findInventoryList().entrySet()) {
      Item item = entry.getValue();
      if (item.getName().equals(name)) {
        if(item.getQuantity() >= quantity){
          return true;
        }
      }
    }
    return  false;
  }
}

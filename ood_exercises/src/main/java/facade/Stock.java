package facade;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Stock {
  private String name;
  private double cost;
  private int quantity;

  public Stock(String name, double cost, int quantity) {
    super();
  }

  public static List<Stock> stockList() {
    List<Stock> items = new ArrayList<>();
    items.add(new Stock("Octopus", 200.00, 3));
    items.add(new Stock("Omelette", 8.00, 0));
    return items;
  }

  public static HashMap<Integer, String > findInventoryList() {
    HashMap<Integer, String> findInventory = new HashMap<>();
    DecimalFormat df = new DecimalFormat("#.00");
    for (int i = 0; i < stockList().size(); i++){
      findInventory.put((i+1), stockList().get(i).getName() + stockList().get(i).getCost() + stockList().get(i).getQuantity());
    }
    return findInventory;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}

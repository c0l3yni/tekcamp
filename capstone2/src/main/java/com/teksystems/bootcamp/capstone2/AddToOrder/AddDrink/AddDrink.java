package com.teksystems.bootcamp.capstone2.AddToOrder.AddDrink;

import com.teksystems.bootcamp.capstone2.MenuItem.Drink.Drink;

import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddDrink {
  public AddDrink() {
    int order = getInput("Which drink would you like?", Drink.findMenuOption());
    System.out.println("__________________________________________________");
    Drink choice = Drink.drinkList().get(order - 1);
    createReceipt(choice);
    System.out.println("__________________________________________________");
  }
}

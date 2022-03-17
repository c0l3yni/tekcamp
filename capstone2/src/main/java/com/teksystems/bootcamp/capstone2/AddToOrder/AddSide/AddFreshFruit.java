package com.teksystems.bootcamp.capstone2.AddToOrder.AddSide;

import com.teksystems.bootcamp.capstone2.MenuItem.Side.FreshFruit;

import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddFreshFruit {
  public AddFreshFruit() {
    System.out.println("__________________________________________________");
    int order = getInput("Which fresh fruit would you like?", FreshFruit.findMenuOption());
    System.out.println("__________________________________________________");
    FreshFruit choice = FreshFruit.freshFruitList().get(order-1);
    createReceipt(choice);
  }
}


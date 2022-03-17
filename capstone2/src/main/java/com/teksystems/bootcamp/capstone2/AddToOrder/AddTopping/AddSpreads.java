package com.teksystems.bootcamp.capstone2.AddToOrder.AddTopping;

import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Spread;

import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddSpreads {
  public AddSpreads() {
    System.out.println("__________________________________________________");
    int order = getInput("Which spread would you like?", Spread.findMenuOption());
    System.out.println("__________________________________________________");
    Spread choice = Spread.SpreadsList().get(order - 1);
    createReceipt(choice);
  }
}
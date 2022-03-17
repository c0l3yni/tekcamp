package com.teksystems.bootcamp.capstone2.AddToOrder.AddEntree;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Meat;

import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddMeat {
  public AddMeat() {
    System.out.println("__________________________________________________");
    int order = getInput("Which meat would you like?", Meat.findMenuOption());
    System.out.println("__________________________________________________");
    Meat choice = Meat.meatList().get(order - 1);
    createReceipt(choice);
  }
}

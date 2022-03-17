package com.teksystems.bootcamp.capstone2.AddToOrder.AddEntree;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Crackers;

import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddCrackers {
  public AddCrackers() {
    System.out.println("__________________________________________________");
    int order = getInput("Which crackers would you like?", Crackers.findMenuOption());
    System.out.println("__________________________________________________");
    Crackers choice = Crackers.crackerList().get(order - 1);
    createReceipt(choice);
  }
}

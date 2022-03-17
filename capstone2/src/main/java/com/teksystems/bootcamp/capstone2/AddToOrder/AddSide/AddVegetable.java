package com.teksystems.bootcamp.capstone2.AddToOrder.AddSide;

import com.teksystems.bootcamp.capstone2.MenuItem.Side.Vegetable;

import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddVegetable {
  public AddVegetable() {
    System.out.println("__________________________________________________");
    int order = getInput("Which vegetable would you like?", Vegetable.findMenuOption());
    System.out.println("__________________________________________________");
    Vegetable choice = Vegetable.VegetableList().get(order - 1);
    createReceipt(choice);
  }
}

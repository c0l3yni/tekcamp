package com.teksystems.bootcamp.capstone2.Checkout.AddEntree;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Meat;
import com.teksystems.bootcamp.capstone2.MenuItem.Entree.SoftCheese;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddMeat {
  public AddMeat() {
    int order = getInput("Which meat would you like?", Meat.findMenuOption());
    Meat choice = Meat.meatList().get(order-1);
    createReceipt(choice);
  }
}

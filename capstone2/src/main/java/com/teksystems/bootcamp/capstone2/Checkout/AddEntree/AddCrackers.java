package com.teksystems.bootcamp.capstone2.Checkout.AddEntree;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Crackers;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddCrackers {
  public AddCrackers() {
    int order = getInput("Which crackers would you like?", Crackers.findMenuOption());
    Crackers choice = Crackers.crackerList().get(order);
    createReceipt(choice);
  }
}

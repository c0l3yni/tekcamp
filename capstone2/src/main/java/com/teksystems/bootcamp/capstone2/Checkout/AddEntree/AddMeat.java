package com.teksystems.bootcamp.capstone2.Checkout.AddEntree;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Meat;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class AddMeat {
  public AddMeat() {
    getInput("Which meat would you like?" + Meat.findMeatNumber());
  /*  createReceipt(new Meat());*/
  }
}

package com.teksystems.bootcamp.capstone2.Checkout;

import com.teksystems.bootcamp.capstone2.Menu.Entree.Meat;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddMeat {
  public static void meatMenu() {
    getInput("Which meat would you like?" + Meat.findMeatNumber());
    createReceipt(new Meat());
  }
}

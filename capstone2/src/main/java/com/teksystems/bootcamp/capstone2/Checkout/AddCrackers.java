package com.teksystems.bootcamp.capstone2.Checkout;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Crackers;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class AddCrackers {
  public static void crackerMenu() {
    getInput("Which kind of crackers would you like?" + Crackers.findCrackers());
/*    createReceipt(new Crackers());*/
  }
}

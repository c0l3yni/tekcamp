package com.teksystems.bootcamp.capstone2.Checkout.AddEntree;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.SoftCheese;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;


public class AddSoftCheese {
  public static void softCheeseMenu() {
    getInput("Which soft cheese would you like?" + SoftCheese.findSoftCheese());
    /*createReceipt(new SoftCheese());*/
  }
}

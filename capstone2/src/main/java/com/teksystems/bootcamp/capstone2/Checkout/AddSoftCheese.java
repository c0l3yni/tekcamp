package com.teksystems.bootcamp.capstone2.Checkout;

import com.teksystems.bootcamp.capstone2.Menu.Entree.SoftCheese;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddSoftCheese {
  public static void softCheeseMenu() {
    getInput("Which soft cheese would you like?" + SoftCheese.findCheeseNumber());
    createReceipt(new SoftCheese());
  }
}

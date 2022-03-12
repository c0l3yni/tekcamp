package com.teksystems.bootcamp.capstone2.Checkout;

import com.teksystems.bootcamp.capstone2.Menu.Entree.HardCheese;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddHardCheese {
  public static void hardCheeseMenu() {
  getInput("Which hard cheese would you like?" + HardCheese.findCheeseNumber());
  createReceipt(new HardCheese());
}
}

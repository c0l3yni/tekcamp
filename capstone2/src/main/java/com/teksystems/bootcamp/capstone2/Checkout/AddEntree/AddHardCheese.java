package com.teksystems.bootcamp.capstone2.Checkout.AddEntree;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.HardCheese;
import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class AddHardCheese {
  public static void hardCheeseMenu() {
    getInput("Which hard cheese would you like?" + HardCheese.findCheeseNumber());
    /*createReceipt(new MenuItem()}*/
  }
}

package com.teksystems.bootcamp.capstone2.Checkout.AddEntree;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Cheese;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class AddCheese {

  public AddCheese() {
    int value = getInput("Which type of cheese would you like?" + Cheese.findCheeseNumber());

  }
}

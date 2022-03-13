package com.teksystems.bootcamp.capstone2.Checkout;

import com.teksystems.bootcamp.capstone2.MenuItem.Side.Vegetable;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class AddVegetable {
  public static void vegetableMenu() {
  getInput("Which kind of vegetable would you like?" + Vegetable.findVegetableNumber());
/*  createReceipt(new Vegetable());*/
}
}

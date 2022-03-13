package com.teksystems.bootcamp.capstone2.Checkout;

import com.teksystems.bootcamp.capstone2.MenuItem.Side.Nuts;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class AddNuts {
  public static void nutMenu() {
  getInput("Which kind of nut would you like?" + Nuts.findNutNumber());
/*  createReceipt(new Nuts());*/
}
}

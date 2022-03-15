package com.teksystems.bootcamp.capstone2.Checkout.AddDrink;

import com.teksystems.bootcamp.capstone2.MenuItem.Drink.Drink;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddDrink {
  public AddDrink() {


      int order = getInput("Which drink would you like?", Drink.findMenuOption());

      Drink choice = Drink.drinkList().get(order);
      createReceipt(choice);
    }
  }

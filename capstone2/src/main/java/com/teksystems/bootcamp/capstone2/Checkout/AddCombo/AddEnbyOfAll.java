package com.teksystems.bootcamp.capstone2.Checkout.AddCombo;

import com.teksystems.bootcamp.capstone2.MenuItem.Combo.EnbyOfAllCombo;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Briny;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.FreshFruit;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Nut;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Vegetable;
import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Dip;
import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Spread;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddEnbyOfAll {
  EnbyOfAllCombo combo = new EnbyOfAllCombo();

  public AddEnbyOfAll() {
    boolean continueFlag = true;
    while (continueFlag) {
      System.out.println("Enby of All comes with: ");
      int userInput = getInput("Press 0 to customize or 1  to add to order", EnbyOfAllCombo.findMenuOption());
      if (userInput == 0) {
        int newInput = getInput("Here are your customization options", EnbyOfAllCombo.findComboOption());
        switch (newInput) {
          case 0:
            int custom1 = getInput("Which substitute would you like?", Spread.findMenuOption());
            Spread newSpread1 = Spread.SpreadsList().get(custom1);
            System.out.println(combo.getSpread1().getName() + " will be replaced by " + newSpread1.getName());
            combo.setSpread1(newSpread1);
            break;
          case 1:
            int custom2 = getInput("Which substitute would you like?", Spread.findMenuOption());
            Spread newSpread2 = Spread.SpreadsList().get(custom2);
            System.out.println(combo.getSpread2().getName() + " will be replaced by " + newSpread2.getName());
            combo.setSpread2(newSpread2);
            break;
          case 2:
            int custom3 = getInput("Which substitute would you like?", Dip.findMenuOption());
            Dip dip1 = Dip.dipList().get(custom3);
            System.out.println(combo.getDip1().getName() + " will be replaced by " + dip1.getName());
            combo.setDip1(dip1);
            break;
          case 3:
            int custom4 = getInput("Which substitute would you like?", Dip.findMenuOption());
            Dip dip2 = Dip.dipList().get(custom4);
            System.out.println(combo.getDip2().getName() + " will be replaced by " + dip2.getName());
            combo.setDip2(dip2);
            break;
          case 4:
            int custom5 = getInput("Which substitute would you like?", FreshFruit.findMenuOption());
            FreshFruit fruit = FreshFruit.freshFruitList().get(custom5);
            System.out.println(combo.getFruit1().getName() + " will be replaced by " + fruit.getName());
            combo.setFruit1(fruit);
            break;
          case 5:
            int custom6 = getInput("Which substitute would you like?", Briny.findMenuOption());
            Briny briny = Briny.brinyList().get(custom6);
            System.out.println(combo.getBriny1().getName() + " will be replaced by " + briny.getName());
            combo.setBriny1(briny);
            break;
          case 6:
            int custom7 = getInput("Which substitute would you like?", Nut.findMenuOption());
            Nut nut = Nut.nutList().get(custom7);
            System.out.println(combo.getNut1().getName() + " will be replaced by " + nut.getName());
            combo.setNut1(nut);
            break;
          case 7:
            int custom8 = getInput("Which substitute would you like?", Vegetable.findMenuOption());
            Vegetable veg1 = Vegetable.VegetableList().get(custom8);
            System.out.println(combo.getDip2().getName() + " will be replaced by " + veg1.getName());
            combo.setVeg1(veg1);
            break;
        }
      }   createReceipt(new EnbyOfAllCombo());
    }

  }
}

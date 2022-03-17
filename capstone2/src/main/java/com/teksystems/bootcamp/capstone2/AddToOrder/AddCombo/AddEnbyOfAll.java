package com.teksystems.bootcamp.capstone2.AddToOrder.AddCombo;

import com.teksystems.bootcamp.capstone2.MenuItem.Combo.EnbyOfAllCombo;
import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Crackers;
import com.teksystems.bootcamp.capstone2.MenuItem.Entree.HardCheese;
import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Meat;
import com.teksystems.bootcamp.capstone2.MenuItem.Entree.SoftCheese;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Briny;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.FreshFruit;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Nut;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Vegetable;
import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Dip;
import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Spread;

import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddEnbyOfAll {


  public AddEnbyOfAll() {
    EnbyOfAllCombo combo = new EnbyOfAllCombo();
    boolean continueFlag = true;
    while (continueFlag) {
      System.out.println("__________________________________________________");
      System.out.println("Enby of All includes: ");
      int newInput = getInput("Pick an item to customize or input 14 to add Enby of All to order", combo.findMenuOption2());
      System.out.println("__________________________________________________");
      if (newInput >= 1 && newInput <= 13) {
        int currentNum = combo.getNumOfCustomization();
        combo.setNumOfCustomization(currentNum + 1);
      }
      switch (newInput) {
        case 1:
          int custom1 = getInput("Which substitute would you like?", SoftCheese.findMenuOption());
          SoftCheese Cheese1 = SoftCheese.softCheeseList().get(custom1 - 1);
          System.out.println(combo.getCheese1().getName() + " will be replaced by " + Cheese1.getName());
          SoftCheese newCheese = new SoftCheese(Cheese1.getName());
          combo.setCheese1(newCheese);
          break;
        case 2:
          int custom2 = getInput("Which substitute would you like?", HardCheese.findMenuOption());
          HardCheese cheese2 = HardCheese.hardCheeseList().get(custom2 - 1);
          System.out.println(combo.getCheese2().getName() + " will be replaced by " + cheese2.getName());
          HardCheese newCheeseTwo = new HardCheese(cheese2.getName());
          combo.setCheese2(newCheeseTwo);
          break;
        case 3:
          int custom3 = getInput("Which substitute would you like?", HardCheese.findMenuOption());
          HardCheese cheese3 = HardCheese.hardCheeseList().get(custom3 - 1);
          System.out.println(combo.getCheese3().getName() + " will be replaced by " + cheese3.getName());
          HardCheese newCheese3 = new HardCheese(cheese3.getName());
          combo.setCheese3(newCheese3);
          break;
        case 4:
          int custom4 = getInput("Which substitute would you like?", Meat.findMenuOption());
          Meat meat1 = Meat.meatList().get(custom4 - 1);
          System.out.println(combo.getMeat1().getName() + " will be replaced by " + meat1.getName());
          Meat newMeat1 = new Meat(meat1.getName(), meat1.getCost());
          combo.setMeat1(newMeat1);
          break;
        case 5:
          int custom5 = getInput("Which substitute would you like?", Crackers.findMenuOption());
          Crackers crackers1 = Crackers.crackerList().get(custom5 - 1);
          System.out.println(combo.getCrackers1().getName() + " will be replaced by " + crackers1.getName());
          Crackers newCrackers1 = new Crackers(crackers1.getName(), crackers1.getCost());
          combo.setCrackers1(newCrackers1);
          break;
        case 6:
          int custom6 = getInput("Which substitute would you like?", Spread.findMenuOption());
          Spread newSpread1 = Spread.SpreadsList().get(custom6 - 1);
          System.out.println(combo.getSpread1().getName() + " will be replaced by " + newSpread1.getName());
          Spread Spread1 = new Spread(newSpread1.getName(), newSpread1.getCost());
          combo.setSpread1(Spread1);
          break;
        case 7:
          int custom7 = getInput("Which substitute would you like?", Spread.findMenuOption());
          Spread newSpread2 = Spread.SpreadsList().get(custom7 - 1);
          System.out.println(combo.getSpread2().getName() + " will be replaced by " + newSpread2.getName());
          combo.setSpread2(newSpread2);
          break;
        case 8:
          int custom8 = getInput("Which substitute would you like?", Dip.findMenuOption());
          Dip dip1 = Dip.dipList().get(custom8 - 1);
          System.out.println(combo.getDip1().getName() + " will be replaced by " + dip1.getName());
          combo.setDip1(dip1);
          break;
        case 9:
          int custom9 = getInput("Which substitute would you like?", Dip.findMenuOption());
          Dip dip2 = Dip.dipList().get(custom9 - 1);
          System.out.println(combo.getDip2().getName() + " will be replaced by " + dip2.getName());
          combo.setDip2(dip2);
          break;
        case 10:
          int custom10 = getInput("Which substitute would you like?", FreshFruit.findMenuOption());
          FreshFruit fruit = FreshFruit.freshFruitList().get(custom10 - 1);
          System.out.println(combo.getFruit1().getName() + " will be replaced by " + fruit.getName());
          combo.setFruit1(fruit);
          break;
        case 11:
          int custom11 = getInput("Which substitute would you like?", Briny.findMenuOption());
          Briny briny = Briny.brinyList().get(custom11 - 1);
          System.out.println(combo.getBriny1().getName() + " will be replaced by " + briny.getName());
          combo.setBriny1(briny);
          break;
        case 12:
          int custom12 = getInput("Which substitute would you like?", Nut.findMenuOption());
          Nut nut = Nut.nutList().get(custom12 - 1);
          System.out.println(combo.getNut1().getName() + " will be replaced by " + nut.getName());
          combo.setNut1(nut);
          break;
        case 13:
          int custom13 = getInput("Which substitute would you like?", Vegetable.findMenuOption());
          Vegetable veg1 = Vegetable.VegetableList().get(custom13 - 1);
          System.out.println(combo.getVeg1().getName() + " will be replaced by " + veg1.getName());
          combo.setVeg1(veg1);
          break;
        case 14:
          continueFlag = false;
          break;
      }
    }
    createReceipt(combo);
    System.out.println("__________________________________________________");

  }
}

package com.teksystems.bootcamp.capstone2.Checkout.AddCombo;

import com.teksystems.bootcamp.capstone2.MenuItem.Combo.ButcherBlock;
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

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddButcherBlock {
  public AddButcherBlock() {

    boolean continueFlag = true;
    while (continueFlag) {
      ButcherBlock combo = new ButcherBlock();
      System.out.println("Enby of All: Pick an item to customize or input 14 to add to order ");
      int newInput = getInput("Here are your customization options", combo.findMenuOption());
      switch (newInput) {
        case 0:
          int custom1 = getInput("Which substitute would you like?", HardCheese.findMenuOption());
          HardCheese cheese1 = HardCheese.hardCheeseList().get(custom1);
          System.out.println(combo.getCheese2().getName() + " will be replaced by " + cheese1.getName());
          HardCheese newCheeseOne = new HardCheese(cheese1.getName());
          combo.setCheese1(newCheeseOne);
          break;
        case 1:
          int custom2 = getInput("Which substitute would you like?", HardCheese.findMenuOption());
          HardCheese cheese2 = HardCheese.hardCheeseList().get(custom2);
          System.out.println(combo.getCheese3().getName() + " will be replaced by " + cheese2.getName());
          HardCheese newCheese2 = new HardCheese(cheese2.getName());
          combo.setCheese2(newCheese2);
          break;
        case 2:
          int custom3 = getInput("Which substitute would you like?", HardCheese.findMenuOption());
          HardCheese cheese3 = HardCheese.hardCheeseList().get(custom3);
          System.out.println(combo.getCheese3().getName() + " will be replaced by " + cheese3.getName());
          HardCheese newCheeseThree = new HardCheese(cheese3.getName());
          combo.setCheese3(newCheeseThree);
          break;
        case 3:
          int custom4 = getInput("Which substitute would you like?", HardCheese.findMenuOption());
          HardCheese cheese4 = HardCheese.hardCheeseList().get(custom4);
          System.out.println(combo.getCheese4().getName() + " will be replaced by " + cheese4.getName());
          HardCheese newCheese4 = new HardCheese(cheese4.getName());
          combo.setCheese4(newCheese4);
          break;
        case 1:
          int custom5 = getInput("Which substitute would you like?", SoftCheese.findMenuOption());
          SoftCheese Cheese5 = SoftCheese.softCheeseList().get(custom5);
          System.out.println(combo.getCheese5().getName() + " will be replaced by " + Cheese5.getName());
          SoftCheese newCheese = new SoftCheese(Cheese5.getName());
          combo.setCheese5(newCheese);
          break;
        case 3:
          int custom6 = getInput("Which substitute would you like?", SoftCheese.findMenuOption());
          SoftCheese cheese6 = SoftCheese.softCheeseList().get(custom5);
          System.out.println(combo.getCheese6().getName() + " will be replaced by " + cheese6.getName());
          SoftCheese newCheese6 = new SoftCheese(cheese6.getName());
          combo.setCheese6(newCheese6);
          break;
        case 4:
          int custom7 = getInput("Which substitute would you like?", Meat.findMenuOption());
          Meat meat1 = Meat.meatList().get(custom7);
          System.out.println(combo.getMeat1().getName() + " will be replaced by " + meat1.getName());
          Meat newMeat1 = new Meat(meat1.getName(), meat1.getCost());
          combo.setMeat1(newMeat1);
          break;
          ___________________________________________________________________________
              //When you wake up and see this check it 1. finish coding out combo number 2
        case 5:
          int custom7 = getInput("Which substitute would you like?", Crackers.findMenuOption());
          Crackers crackers1 = Crackers.crackerList().get(custom5);
          System.out.println(combo.getCrackers1().getName() + " will be replaced by " + crackers1.getName());
          Crackers newCrackers1 = new Crackers(crackers1.getName(), crackers1.getCost());
          combo.setCrackers1(newCrackers1);
          break;

          int custom8 = getInput("Which substitute would you like?", Spread.findMenuOption());
          Spread newSpread1 = Spread.SpreadsList().get(custom6);
          System.out.println(combo.getSpread1().getName() + " will be replaced by " + newSpread1.getName());
          Spread Spread1 = new Spread(newSpread1.getName(), newSpread1.getCost());
          combo.setSpread1(Spread1);
          break;
        case 6:
          int custom9 = getInput("Which substitute would you like?", Spread.findMenuOption());
          Spread newSpread2 = Spread.SpreadsList().get(custom7);
          System.out.println(combo.getSpread2().getName() + " will be replaced by " + newSpread2.getName());
          combo.setSpread2(newSpread2);
          break;
        case 7:
          int custom10 = getInput("Which substitute would you like?", Dip.findMenuOption());
          Dip dip1 = Dip.dipList().get(custom8);
          System.out.println(combo.getDip1().getName() + " will be replaced by " + dip1.getName());
          combo.setDip1(dip1);
          break;
        case 8:
          int custom11 = getInput("Which substitute would you like?", Dip.findMenuOption());
          Dip dip2 = Dip.dipList().get(custom9);
          System.out.println(combo.getDip2().getName() + " will be replaced by " + dip2.getName());
          combo.setDip2(dip2);
          break;
        case 9:
          int custom12 = getInput("Which substitute would you like?", FreshFruit.findMenuOption());
          FreshFruit fruit = FreshFruit.freshFruitList().get(custom10);
          System.out.println(combo.getFruit1().getName() + " will be replaced by " + fruit.getName());
          combo.setFruit1(fruit);
          break;
        case 10:
          int custom13 = getInput("Which substitute would you like?", Briny.findMenuOption());
          Briny briny = Briny.brinyList().get(custom11);
          System.out.println(combo.getBriny1().getName() + " will be replaced by " + briny.getName());
          combo.setBriny1(briny);
          break;
        case 11:
          int custom12 = getInput("Which substitute would you like?", Nut.findMenuOption());
          Nut nut = Nut.nutList().get(custom12);
          System.out.println(combo.getNut1().getName() + " will be replaced by " + nut.getName());
          combo.setNut1(nut);
          break;
        case 12:
          int custom14 = getInput("Which substitute would you like?", Vegetable.findMenuOption());
          Vegetable veg1 = Vegetable.VegetableList().get(custom13);
          System.out.println(combo.getDip2().getName() + " will be replaced by " + veg1.getName());
          combo.setVeg1(veg1);
          break;
      }
      continueFlag = false;
    }
    createReceipt(new EnbyOfAllCombo());
  }
}

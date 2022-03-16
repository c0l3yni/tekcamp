package com.teksystems.bootcamp.capstone2.AddToOrder.AddCombo;

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

import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddButcherBlock {
  public AddButcherBlock() {

    boolean continueFlag = true;
    while (continueFlag) {
      ButcherBlock combo = new ButcherBlock();
      System.out.println("Enby of All: Pick an item to customize or input 14 to add to order ");
      int newInput = getInput("Here are your customization options", combo.findMenuOption2());
      switch (newInput) {
        case 0:
          int custom1 = getInput("Which substitute would you like?", HardCheese.findMenuOption());
          HardCheese cheese1 = HardCheese.hardCheeseList().get(custom1);
          System.out.println(combo.getCheese1().getName() + " will be replaced by " + cheese1.getName());
          HardCheese newCheeseOne = new HardCheese(cheese1.getName());
          combo.setCheese1(newCheeseOne);
          break;
        case 1:
          int custom2 = getInput("Which substitute would you like?", HardCheese.findMenuOption());
          HardCheese cheese2 = HardCheese.hardCheeseList().get(custom2);
          System.out.println(combo.getCheese2().getName() + " will be replaced by " + cheese2.getName());
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
        case 4:
          int custom5 = getInput("Which substitute would you like?", SoftCheese.findMenuOption());
          SoftCheese Cheese5 = SoftCheese.softCheeseList().get(custom5);
          System.out.println(combo.getCheese5().getName() + " will be replaced by " + Cheese5.getName());
          SoftCheese newCheese = new SoftCheese(Cheese5.getName());
          combo.setCheese5(newCheese);
          break;
        case 5:
          int custom6 = getInput("Which substitute would you like?", SoftCheese.findMenuOption());
          SoftCheese cheese6 = SoftCheese.softCheeseList().get(custom6);
          System.out.println(combo.getCheese6().getName() + " will be replaced by " + cheese6.getName());
          SoftCheese newCheese6 = new SoftCheese(cheese6.getName());
          combo.setCheese6(newCheese6);
          break;
        case 6:
          int custom7 = getInput("Which substitute would you like?", Meat.findMenuOption());
          Meat meat1 = Meat.meatList().get(custom7);
          System.out.println(combo.getMeat1().getName() + " will be replaced by " + meat1.getName());
          Meat newMeat1 = new Meat(meat1.getName(), meat1.getCost());
          combo.setMeat1(newMeat1);
          break;
        case 7:
          int custom8 = getInput("Which substitute would you like?", Meat.findMenuOption());
          Meat meat2 = Meat.meatList().get(custom8);
          System.out.println(combo.getMeat2().getName() + " will be replaced by " + meat2.getName());
          Meat newMeat2 = new Meat(meat2.getName(), meat2.getCost());
          combo.setMeat2(newMeat2);
          break;
        case 8:
          int custom9 = getInput("Which substitute would you like?", Meat.findMenuOption());
          Meat meat3 = Meat.meatList().get(custom9);
          System.out.println(combo.getMeat3().getName() + " will be replaced by " + meat3.getName());
          Meat newMeat3 = new Meat(meat3.getName(), meat3.getCost());
          combo.setMeat3(newMeat3);
          break;
        case 9:
          int custom10 = getInput("Which substitute would you like?", Crackers.findMenuOption());
          Crackers crackers1 = Crackers.crackerList().get(custom10);
          System.out.println(combo.getCrackers1().getName() + " will be replaced by " + crackers1.getName());
          Crackers newCrackers1 = new Crackers(crackers1.getName(), crackers1.getCost());
          combo.setCrackers1(newCrackers1);
          break;
        case 10:
          int custom11 = getInput("Which substitute would you like?", Crackers.findMenuOption());
          Crackers crackers2 = Crackers.crackerList().get(custom11);
          System.out.println(combo.getCrackers2().getName() + " will be replaced by " + crackers2.getName());
          Crackers newCrackers2 = new Crackers(crackers2.getName(), crackers2.getCost());
          combo.setCrackers2(newCrackers2);
          break;
        case 11:
          int custom12 = getInput("Which substitute would you like?", Spread.findMenuOption());
          Spread newSpread1 = Spread.SpreadsList().get(custom12);
          System.out.println(combo.getSpread1().getName() + " will be replaced by " + newSpread1.getName());
          Spread Spread1 = new Spread(newSpread1.getName(), newSpread1.getCost());
          combo.setSpread1(Spread1);
          break;
        case 12:
          int custom13 = getInput("Which substitute would you like?", Spread.findMenuOption());
          Spread newSpread2 = Spread.SpreadsList().get(custom13);
          System.out.println(combo.getSpread2().getName() + " will be replaced by " + newSpread2.getName());
          combo.setSpread2(newSpread2);
          break;
        case 13:
          int custom14 = getInput("Which substitute would you like?", Spread.findMenuOption());
          Spread newSpread3 = Spread.SpreadsList().get(custom14);
          System.out.println(combo.getSpread3().getName() + " will be replaced by " + newSpread3.getName());
          combo.setSpread3(newSpread3);
          break;
        case 14:
          int custom15 = getInput("Which substitute would you like?", Dip.findMenuOption());
          Dip dip1 = Dip.dipList().get(custom15);
          System.out.println(combo.getDip1().getName() + " will be replaced by " + dip1.getName());
          combo.setDip1(dip1);
          break;
        case 15:
          int custom16 = getInput("Which substitute would you like?", Dip.findMenuOption());
          Dip dip2 = Dip.dipList().get(custom16);
          System.out.println(combo.getDip2().getName() + " will be replaced by " + dip2.getName());
          combo.setDip2(dip2);
          break;
        case 16:
          int custom17 = getInput("Which substitute would you like?", Dip.findMenuOption());
          Dip dip3 = Dip.dipList().get(custom17);
          System.out.println(combo.getDip3().getName() + " will be replaced by " + dip3.getName());
          combo.setDip3(dip3);
          break;
        case 17:
          int custom18 = getInput("Which substitute would you like?", FreshFruit.findMenuOption());
          FreshFruit fruit1 = FreshFruit.freshFruitList().get(custom18);
          System.out.println(combo.getFruit1().getName() + " will be replaced by " + fruit1.getName());
          combo.setFruit1(fruit1);
          break;
        case 18:
          int custom19 = getInput("Which substitute would you like?", FreshFruit.findMenuOption());
          FreshFruit fruit2 = FreshFruit.freshFruitList().get(custom19);
          System.out.println(combo.getFruit2().getName() + " will be replaced by " + fruit2.getName());
          combo.setFruit2(fruit2);
          break;
        case 19:
          int custom20 = getInput("Which substitute would you like?", Briny.findMenuOption());
          Briny briny1 = Briny.brinyList().get(custom20);
          System.out.println(combo.getBriny1().getName() + " will be replaced by " + briny1.getName());
          combo.setBriny1(briny1);
          break;
        case 20:
          int custom21 = getInput("Which substitute would you like?", Briny.findMenuOption());
          Briny briny2 = Briny.brinyList().get(custom21);
          System.out.println(combo.getBriny2().getName() + " will be replaced by " + briny2.getName());
          combo.setBriny2(briny2);
          break;
        case 21:
          int custom22 = getInput("Which substitute would you like?", Nut.findMenuOption());
          Nut nut = Nut.nutList().get(custom22);
          System.out.println(combo.getNut1().getName() + " will be replaced by " + nut.getName());
          combo.setNut1(nut);
          break;
        case 22:
          int custom23 = getInput("Which substitute would you like?", Vegetable.findMenuOption());
          Vegetable veg1 = Vegetable.VegetableList().get(custom23);
          System.out.println(combo.getVeg1().getName() + " will be replaced by " + veg1.getName());
          combo.setVeg1(veg1);
          break;
        case 23:
          int custom24 = getInput("Which substitute would you like?", Vegetable.findMenuOption());
          Vegetable veg2 = Vegetable.VegetableList().get(custom24);
          System.out.println(combo.getVeg2().getName() + " will be replaced by " + veg2.getName());
          combo.setVeg2(veg2);
          break;
        case 24:
          continueFlag = false;
          break;
      }
    }
    createReceipt(new EnbyOfAllCombo());
  }
}

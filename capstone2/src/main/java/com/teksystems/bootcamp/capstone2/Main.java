package com.teksystems.bootcamp.capstone2;

import com.teksystems.bootcamp.capstone2.Checkout.Receipt;
import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;

import java.text.DecimalFormat;
import java.util.Scanner;

import static com.teksystems.bootcamp.capstone2.Checkout.AddBriny.brinyMenu;
import static com.teksystems.bootcamp.capstone2.Checkout.AddCrackers.crackerMenu;
import static com.teksystems.bootcamp.capstone2.Checkout.AddDrink.drinkMenu;
import static com.teksystems.bootcamp.capstone2.Checkout.AddFreshFruit.freshFruitMenu;
import static com.teksystems.bootcamp.capstone2.Checkout.AddHardCheese.hardCheeseMenu;
import static com.teksystems.bootcamp.capstone2.Checkout.AddMeat.meatMenu;
import static com.teksystems.bootcamp.capstone2.Checkout.AddNuts.nutMenu;
import static com.teksystems.bootcamp.capstone2.Checkout.AddSoftCheese.softCheeseMenu;
import static com.teksystems.bootcamp.capstone2.Checkout.AddSpreads.spreadsMenu;
import static com.teksystems.bootcamp.capstone2.Checkout.AddVegetable.vegetableMenu;
import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Press 1 for meal menu or 2 for meal builder: ");

    if (scanner.nextDouble() == 1) {
      System.out.println("meal options");
    } else {

      while (true) {
        System.out.println("Press 1 for entree, 2 for toppings, 3 for sides, 4 for drinks, or 5 to go back");
        int menuItem;
        menuItem = scanner.nextInt();

        if (menuItem == 5){
          break;
        }

        switch (menuItem) {
          case 1:
            System.out.println("Entree Options: " + "Press 1 for cheese, 2 for meat, or 3 for crackers");
            menuItem = scanner.nextInt();

            switch (menuItem) {
              case 1:
                menuItem = getInput("Press 1 for Hard Cheese or 2 for Soft Cheeses");
                if (menuItem == 1) {
                  hardCheeseMenu();
                } else {
                  softCheeseMenu();
                }
                break;
              case 2:
                meatMenu();
                break;
              case 3:
                crackerMenu();
                break;
            }
            break;

          case 2:
            spreadsMenu();
            break;
          case 3:
            System.out.println("Side Options: " + "Press 1 for Nuts, 2 for Briny, 3 for Vegetables, or 4 for Fresh Fruit");
            menuItem = scanner.nextInt();
            switch (menuItem) {
              case 1:
                nutMenu();
                break;
              case 2:
                brinyMenu();
                break;
              case 3:
                vegetableMenu();
                break;
              case 4:
                freshFruitMenu();
                break;
            }
            break;

          case 4:
            drinkMenu();
            break;
        }
      }
    }
  }

  public static Receipt receipt = new Receipt();
  public static void createReceipt(MenuItem item) {
    double addToCart = item.getCost();
    double subtotal = receipt.receiptSubTotal(addToCart);
    double taxTotal = receipt.receiptTaxTotal(subtotal);
    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println("Your current total is " + "$ " + df.format(taxTotal));
  }
}

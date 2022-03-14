package com.teksystems.bootcamp.capstone2;

import com.teksystems.bootcamp.capstone2.Checkout.*;
import com.teksystems.bootcamp.capstone2.Checkout.AddDrink.AddDrink;
import com.teksystems.bootcamp.capstone2.Checkout.AddEntree.AddCrackers;
import com.teksystems.bootcamp.capstone2.Checkout.AddEntree.AddHardCheese;
import com.teksystems.bootcamp.capstone2.Checkout.AddEntree.AddMeat;
import com.teksystems.bootcamp.capstone2.Checkout.AddEntree.AddSoftCheese;
import com.teksystems.bootcamp.capstone2.Checkout.AddSide.AddBriny;
import com.teksystems.bootcamp.capstone2.Checkout.AddSide.AddFreshFruit;
import com.teksystems.bootcamp.capstone2.Checkout.AddSide.AddNuts;
import com.teksystems.bootcamp.capstone2.Checkout.AddSide.AddVegetable;
import com.teksystems.bootcamp.capstone2.Checkout.AddTopping.AddDips;
import com.teksystems.bootcamp.capstone2.Checkout.AddTopping.AddSpreads;
import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;

import java.text.DecimalFormat;
import java.util.Scanner;

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
                  new AddHardCheese();
                } else {
                  new AddSoftCheese();
                }
                break;
              case 2:
                new AddMeat();
                break;
              case 3:
                new AddCrackers();
                break;
            }
            break;

          case 2:
            new AddDips();
            break;
          case 3:
            new AddSpreads();
            break;
          case 4:
            System.out.println("Side Options: " + "Press 1 for Nut, 2 for Briny, 3 for Vegetables, or 4 for Fresh Fruit");
            menuItem = scanner.nextInt();
            switch (menuItem) {
              case 1:
                new AddNuts();
                break;
              case 2:
                new AddBriny();
                break;
              case 3:
                new AddVegetable();
                break;
              case 4:
                new AddFreshFruit();
                break;
            }
            break;
          case 5:
            new AddDrink();
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
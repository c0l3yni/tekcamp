package com.teksystems.bootcamp.capstone2;

import com.teksystems.bootcamp.capstone2.additionalToppings.Cheese;
import com.teksystems.bootcamp.capstone2.additionalToppings.HardCheese;
import com.teksystems.bootcamp.capstone2.additionalToppings.SoftCheese;
import com.teksystems.bootcamp.capstone2.purchaseFood.Receipt;
import java.text.DecimalFormat;
import java.util.Scanner;

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
                System.out.println("List of Meats will be a hashmap");
                break;
              case 3:
                System.out.println("List of Crackers will be a hashmap");
                break;
            }
            break;
          case 2:
            System.out.println("Toppings");
            scanner.nextInt();
            break;
          case 3:
            System.out.println("Sides");
            scanner.nextInt();
            break;
          case 4:
            System.out.println("Drinks");
            scanner.nextInt();
            break;
        }
      }
    }
  }
  private static int getInput(String question) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(question);
    return scanner.nextInt();
  }


  static Receipt receipt = new Receipt();
  public static void hardCheeseMenu() {
    int value = getInput("Which hard cheese would you like?" + HardCheese.findCheeseNumber());
    createReceipt(new HardCheese());
  }

  public static void softCheeseMenu() {
    int value = getInput("Which soft cheese would you like?" + SoftCheese.findCheeseNumber());
    createReceipt(new SoftCheese());
  }

  public static void createReceipt(Cheese item) {
    double addToCart = item.getCost();
    double subtotal = receipt.receiptSubTotal(addToCart);
    double taxTotal = receipt.receiptTaxTotal(subtotal);
    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println("Your current total is" + "$" + df.format(taxTotal));
  }
}













/*
  int menuItem;
      menuItem = scanner.nextInt();
          switch (menuItem) {
          case 0:

          scanner.nextInt();
          break;
          case 1:
          System.out.println("A la carte Menu: " + "Press 1 for entree, 2 for toppings, 3 for sides, or 4 for drinks");
          scanner.nextInt();
          break;
          case 2:

          scanner.nextInt();
          break;
          case 3:
          System.out.println("Topping Options: " + "Press 1 for Dips, 2 for Chocolate, or 3 for Spreads");
          scanner.nextInt();
          break;
          case 4:
          System.out.println("Side Options: " + "Press 1 for Veggies, 2 for Nuts, 3 for Fresh Fruit, or 4 for Briny");
          scanner.nextInt();
          break;
          case 5:
          System.out.println("Drink Options: " + "Press 1 for Water, 2 for Sweet Tea, 3 for Unsweetened Tea, 4 for Iced Coffee, or 5 for Hot Coffee");
          scanner.nextInt();
          break;
          }*/
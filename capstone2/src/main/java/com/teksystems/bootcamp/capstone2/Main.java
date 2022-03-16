package com.teksystems.bootcamp.capstone2;

import com.teksystems.bootcamp.capstone2.Checkout.*;
import com.teksystems.bootcamp.capstone2.Checkout.AddCombo.AddCombo;
import com.teksystems.bootcamp.capstone2.Checkout.AddDrink.AddDrink;
import com.teksystems.bootcamp.capstone2.Checkout.AddEntree.*;
import com.teksystems.bootcamp.capstone2.Checkout.AddSide.*;
import com.teksystems.bootcamp.capstone2.Checkout.AddTopping.AddDips;
import com.teksystems.bootcamp.capstone2.Checkout.AddTopping.AddSpreads;
import com.teksystems.bootcamp.capstone2.Checkout.AddTopping.AddTopping;
import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;

import javax.security.auth.login.CredentialException;
import java.text.DecimalFormat;
import java.util.*;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class Main {
  public static DecimalFormat df = new DecimalFormat("#.00");
  public static Scanner scanner = new Scanner(System.in);
  public static Receipt receipt = new Receipt();
  public static OrderHistory orderHistory = new OrderHistory();

  public static void main(String[] args) {
    while (true) {
      receipt = new Receipt();
      orderHistory.addReceipt(receipt);
      System.out.println(" ");
      System.out.println("+======================================================+");
      System.out.println("|                                                      |");
      System.out.println("|               Welcome to Char-Cuties                 |");
      System.out.println("|                                                      |");
      System.out.println("+======================================================+");
      int userMode = 0;

      System.out.println("+=================================================+");
      System.out.println("| Press 1 for NEW ORDER or 2 to SEARCH FOR ORDER  |");
      System.out.println("+=================================================+");
      while (!scanner.hasNextInt()) {
        System.out.println("That's not valid input. Try again:");
        scanner.next();
      }
      userMode = scanner.nextInt();
      if (userMode == 2) {
        System.out.println("+===============================+");
        System.out.println("|   Please enter your order #:  |");
        System.out.println("+===============================+");
        while (!scanner.hasNextInt()) {
          System.out.println("That's not valid input. Try again:");
          scanner.next();
        }
        int userInput = scanner.nextInt();
        Receipt result = orderHistory.receiptFinder(userInput);
        if (result != null) {
          receipt = result;
          receipt.printReceipt();
        } else {
          System.out.println("Could not find the receipt with #" + userInput);
        }
      } else if (userMode == 1) {
        boolean continueMainMenuFlag = true;
        while (continueMainMenuFlag) {
          System.out.println("+=================================================+");
          System.out.println("|  Press 1 for MEAL MENU or 2 for MEAL BUILDER    |");
          System.out.println("|              Press 3 to CHECKOUT                |");
          System.out.println("+=================================================+");
          while (!scanner.hasNextInt()) {
            System.out.println("That's not valid input. Try again:");
            scanner.next();
          }
          userMode = scanner.nextInt();
          if (userMode == 1) {
            System.out.println("+=================================================+");
            System.out.println("|       Press 1 for Enby-of-all COMBO or          |");
            System.out.println("|          2 for Butch-er Block COMBO             |");
            System.out.println("+=================================================+");

            new AddCombo();

          } else if (userMode == 2) {
            boolean continueFlag = true;
            while (continueFlag) {
              System.out.println("+=================================================+");
              System.out.println("|       Press 1 for ENTREES, 2 for TOPPINGS       |");
              System.out.println("|            3 for SIDES, 4 for DRINKS,           |");
              System.out.println("|                or 5 for MAIN MENU               |");
              System.out.println("+=================================================+");

              while (!scanner.hasNextInt()) {
                System.out.println("That's not valid input. Try again:");
                scanner.next();
              }

              int menuItem = scanner.nextInt();

              switch (menuItem) {
                case 1:
                  new AddEntree();
                  break;
                case 2:
                  new AddTopping();
                  break;
                case 3:
                  new AddSide();
                  break;
                case 4:
                  new AddDrink();
                  break;
                case 5:
                  continueFlag = false;
                  break;
                default:
                  System.out.println("This is not a valid Menu Option! Please Select Another");
                  break;
              }
            }
          } else if (userMode == 3) {
            continueMainMenuFlag = false;
            receipt.printReceipt();
          } else {
            System.out.println("This is not a valid Menu Option!");
          }
        }
      } else {
        System.out.println("This is not a valid Menu Option!");
      }
    }
  }

  public static void displayReceipt() {
    List<String> createOrderList = new ArrayList<>();
    for (int i = 0; i < receipt.getItems().size(); i++) {
      MenuItem item = receipt.getItems().get(i);
      System.out.println(item.getName() + " $" + df.format(item.getCost()));
    }
  }

  public static void createReceipt(MenuItem item) {
    double addToCart = item.getCost();
    receipt.addItem(item);
    double subtotal = receipt.receiptSubTotal(addToCart);
    receipt.receiptTaxTotal(subtotal);
    System.out.println("Added " + item.getName() + " to your order.");
    System.out.println("Current subtotal for order #" + receipt.getOrderNum() + " is $" + df.format(subtotal));
  }
}


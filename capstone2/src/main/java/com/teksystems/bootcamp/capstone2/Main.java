package com.teksystems.bootcamp.capstone2;

import com.teksystems.bootcamp.capstone2.Checkout.*;
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

public class Main {
  public static Receipt receipt = new Receipt();
  public static OrderHistory orderHistory = new OrderHistory();
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while(true) {
      receipt = new Receipt();
      orderHistory.addReceipt(receipt);
      System.out.println("=======================================");
      System.out.println(" ");
      System.out.println("       Welcome to Char-Cuties");
      System.out.println(" ");
      System.out.println("=======================================");
      System.out.println("Press 1 for new order or 2 for order lookup");
      int userMode = scanner.nextInt();
      if (userMode == 2) {
        System.out.println("Please enter the order #: ");
        int userInput = scanner.nextInt();
        Receipt result = orderHistory.receiptFinder(userInput);
        if( result != null) {
          receipt = result;
          MenuItem menuItem3 = new MenuItem("", 0);
          displayReceipt();
          createReceipt(menuItem3);
        }
      }
      System.out.print("Press 1 for meal menu or 2 for meal builder: ");
      if (scanner.nextDouble() == 1) {
        System.out.println("meal options");
      } else {
        boolean continueFlag = true;
        while (continueFlag) {
          System.out.println("Press 1 for entree, 2 for toppings, 3 for sides, 4 for drinks, or 5 to checkout");
          int menuItem;
          menuItem = scanner.nextInt();

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
              Date currentDate = new Date();
              System.out.println("=======================================");
              System.out.println("             Char-Cuties");
              System.out.println("      " + currentDate);

              System.out.println("=======================================");
              MenuItem menuItem1 = new MenuItem("", 0);
              displayReceipt();
              System.out.println("=======================================");
              MenuItem menuItem2 = new MenuItem("", 0);
              createReceipt(menuItem1);

              System.out.println("=======================================");
              continueFlag = false;
              break;
          }
        }
      }
    }
  }



  public static void displayReceipt() {
    List<String> createOrderList = new ArrayList<>();
    for (int i = 0; i < receipt.getItems().size(); i++) {
      MenuItem item = receipt.getItems().get(i);
      DecimalFormat df = new DecimalFormat("#.00");
      System.out.println(item.getName() + " $" + df.format(item.getCost()));
    }
  }

  public static void createReceipt(MenuItem item) {
    double addToCart = item.getCost();
    receipt.addItem(item);
    double subtotal = receipt.receiptSubTotal(addToCart);
    double taxTotal = receipt.receiptTaxTotal(subtotal);

    System.out.println("Order Number: " + receipt.getOrderNum());

    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println("Subtotal is " + "$ " + df.format(subtotal));
    System.out.println("Total due today is " + "$ " + df.format(taxTotal));
  }
}


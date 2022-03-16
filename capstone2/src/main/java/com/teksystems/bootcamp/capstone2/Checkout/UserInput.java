package com.teksystems.bootcamp.capstone2.Checkout;

import java.util.Map;
import java.util.Scanner;

public class UserInput {
  private static final Scanner scanner = new Scanner(System.in);

  public static int getInput(String question, Map<String, String> options) {
    for (int i = 1; i <= options.size(); i++) {
      System.out.println(i + ": " + options.get(String.valueOf(i)));
    }
    System.out.println(question);

    int userInput = -1;
    boolean validInput = false;
    while(!validInput) {
      while (!scanner.hasNextInt()) {
        System.out.println("That's not valid input. Try again:");
        scanner.next();
      }
      userInput = scanner.nextInt();

      if(userInput < 1 || userInput > options.size()) {
        System.out.println("This is not a valid Menu Option!");
      } else {
        validInput = true;
      }
    }

    return userInput;
  }
}

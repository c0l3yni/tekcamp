package com.teksystems.bootcamp.capstone2.AddToOrder;

import java.util.Map;
import java.util.Scanner;

public class UserInput {
  private static final Scanner scanner = new Scanner(System.in);
  private static int userInput = -1;

  public static int getInput(String question, Map<String, String> options) {
    for (int i = 1; i <= options.size(); i++) {
      System.out.println(i + ": " + options.get(String.valueOf(i)));
    }
    System.out.println(question);

    boolean validInput = false;
    while(!validInput) {
      while (!scanner.hasNextInt()) {
        System.out.println("That's not valid input. Try again:");
        System.out.println("__________________________________________________");
        scanner.next();
      }
      userInput = scanner.nextInt();

      if(userInput < 1 || userInput > options.size()) {
        System.out.println("This is not a valid Menu Option!");
        System.out.println("__________________________________________________");
      } else {
        validInput = true;
      }
    }
    return userInput;
  }
}

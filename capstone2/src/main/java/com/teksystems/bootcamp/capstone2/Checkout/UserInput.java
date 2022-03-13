package com.teksystems.bootcamp.capstone2.Checkout;

import java.util.*;

public class UserInput {
  public static int getInput(String question, HashMap<String, String> options) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(question);
    List<Set<String>> keys = Arrays.asList(options.keySet());
    for (int i = 0; i < keys.size(); i++) {
      System.out.println(i+": " + keys.get(i));
    }
    return scanner.nextInt();
  }
}

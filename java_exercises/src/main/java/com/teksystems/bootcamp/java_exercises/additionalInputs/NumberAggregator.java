package com.teksystems.bootcamp.java_exercises.additionalInputs;
import java.util.Scanner;

public class NumberAggregator {

  private static int total;

  public static void main(String[] args) {

    Scanner userNumber = new Scanner(System.in);
    String input = "";
    int total = 0;

    while (true) {
      System.out.print("Enter a number: ");
      
      try {
        int number = userNumber.nextInt();
        total = NumberAggregator.addNumber(number);
      } catch (Exception e) {
        System.out.println("The sum equals " + total);
        break;
      }
    }
  }
  public static int addNumber(int number) {
    total = total + number;
    return total;
  }
}





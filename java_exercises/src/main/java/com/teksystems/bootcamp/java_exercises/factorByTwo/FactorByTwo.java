package com.teksystems.bootcamp.java_exercises.factorByTwo;

import java.util.Scanner;

public class FactorByTwo {

  public static void main(String[] args) {
    System.out.println("Please input a number: ");

    Scanner scanner = new Scanner(System.in);
    int numberToBeFactored = scanner.nextInt();
    System.out.println("Number of twos: " + NodeCreator.createNode(numberToBeFactored).getCountOfTwos());
  }
}

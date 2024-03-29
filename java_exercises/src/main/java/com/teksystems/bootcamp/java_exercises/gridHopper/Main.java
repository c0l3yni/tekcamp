package com.teksystems.bootcamp.java_exercises.gridHopper;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer for the board size: ");
    int size = scanner.nextInt();
    System.out.print("Enter an integer for the seed: ");
    int seed = scanner.nextInt();


    LocationPointer[][] myBoard = BoardGenerator.createBoard(size, size);
    System.out.println("Randomly Generated Board");

    for (int i = 0; i < myBoard.length; i++) {
      for (int j = 0; j < myBoard.length; j++) {

        System.out.print("(" + myBoard[i][j].getTargetX()+ ", " + myBoard[i][j].getTargetY() + ")");

        System.out.print(" ");
      }
      System.out.println();
    }
    LocationPointer result = BoardHopper.hop(myBoard);
    int resultX = result.getTargetX();
    int resultY = result.getTargetY();
    System.out.println("Final position: (" + resultX + ", " + resultY +")");
  }
}







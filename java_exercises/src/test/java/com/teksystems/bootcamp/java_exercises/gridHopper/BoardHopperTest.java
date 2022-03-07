package com.teksystems.bootcamp.java_exercises.gridHopper;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardHopperTest {
  @Test
  public static void boardHopperForTwoDimensionalArray(){
    LocationPointer [][] board = BoardGenerator.createBoard(1, 4);
    LocationPointer actual = BoardHopper.hop(board);
    LocationPointer expected = new LocationPointer(0, 0);


    Assert.assertEquals(actual.getTargetX(), expected.getTargetX());
    Assert.assertEquals(actual.getTargetY(), expected.getTargetY());
  }

  @Test
  public static void boardHopperForTwoDimensionalArrayBoard(){
    LocationPointer [][] board = BoardGenerator.createBoard(2, 5);
    LocationPointer actual = BoardHopper.hop(board);
    LocationPointer expected = new LocationPointer(0, 1);


    Assert.assertEquals(actual.getTargetX(), expected.getTargetX());
    Assert.assertEquals(actual.getTargetY(), expected.getTargetY());
  }
}
package com.teksystems.bootcamp.java_exercises.gridHopper;

public class BoardHopper {
  private static LocationPointer location = new LocationPointer(0,0);

  public static LocationPointer hop(LocationPointer[][] board) {
    int hopCounter = 0;
    while(hopCounter < 100) {
      int targetX = board[location.getTargetY()][location.getTargetX()].getTargetX();
      int targetY = board[location.getTargetY()][location.getTargetX()].getTargetY();

      if (targetX == location.getTargetX() && targetY == location.getTargetY()) {
        return location;
      }
      location = new LocationPointer(targetX, targetY);
      hopCounter++;
    }

    return location;
  }

  }


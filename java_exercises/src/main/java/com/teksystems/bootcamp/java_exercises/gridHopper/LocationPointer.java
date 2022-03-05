package com.teksystems.bootcamp.java_exercises.gridHopper;

public class LocationPointer {

  private int targetX;
  private int targetY;

  public LocationPointer(int x, int y) {
    targetX = x;
    targetY = y;
  }

public int getTargetX(){
    return targetX;
}

public int getTargetY(){
  return targetY;
}
}

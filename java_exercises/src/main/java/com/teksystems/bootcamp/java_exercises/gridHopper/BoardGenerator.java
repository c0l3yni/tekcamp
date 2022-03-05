package com.teksystems.bootcamp.java_exercises.gridHopper;
import java.util.Random;

public class BoardGenerator {

  public static LocationPointer[][] createBoard(int size, int seed){
    Random random = new Random(seed);
    LocationPointer[][] retval = new LocationPointer[size][size];

    for(int i=0; i<size; i++){
      for(int j=0; j<size; j++) {
        retval[i][j] = new LocationPointer((random.nextInt(size)), (random.nextInt(size)));
      }
    }
    return retval;
  }
}

package com.teksystems.bootcamp.ood_exercises.template;

public class Main {
  public static void main(String[] args) {
    MadLibs origin = new OriginStory();
    System.out.println("********************************************Original Story***********************************************");
    origin.play();
    System.out.println("**************************************************Fin****************************************************");
    System.out.println();
    MadLibs randoStory = new RandomStory();
    System.out.println("*********************************************Random Story************************************************");

    randoStory.play();
    System.out.println("**************************************************Fin****************************************************");
  }

}

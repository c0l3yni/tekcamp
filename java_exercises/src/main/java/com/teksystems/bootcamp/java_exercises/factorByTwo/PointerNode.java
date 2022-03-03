package com.teksystems.bootcamp.java_exercises.factorByTwo;

public class PointerNode extends Node {
  private final Node nodeOne;
  private final Node nodeTwo;

  public PointerNode(Node nodeOne, Node nodeTwo){
    this.nodeOne = nodeOne;
    this.nodeTwo = nodeTwo;
  }

  public int getCountOfTwos() {
    return nodeOne.getCountOfTwos() + nodeTwo.getCountOfTwos();
  }
}

package com.teksystems.bootcamp.java_exercises.factorByTwo;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NodeCreatorTest {

  @Test
  public void testCreateNode() {
    Node input = NodeCreator.createNode(1024);
    double actual = input.getCountOfTwos();
    double expected = 10;
    Assert.assertEquals(actual, expected);
  }
}
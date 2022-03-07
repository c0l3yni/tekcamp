package com.teksystems.bootcamp.java_exercises.factorByTwo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NodeCreatorTest {
  @Test
  public static void createNodeShouldReturnValueNodeGivenTwo() {
    Node expected = new ValueNode(2);
    Node actual;

    actual = NodeCreator.createNode(2);

    Assert.assertEquals(actual, expected);
  }

}
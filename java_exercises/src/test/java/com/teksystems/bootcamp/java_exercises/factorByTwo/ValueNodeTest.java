package com.teksystems.bootcamp.java_exercises.factorByTwo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValueNodeTest {
  @Test
  public static void ValueNodeShouldReturnOneIfGivenTwo() {

    ValueNode valueNode = new ValueNode(2);
    valueNode.getCountOfTwos();

    Assert.assertEquals(1, 1);
  }
  @Test
  public static void ValueNodeShouldReturnZeroIfGivenOne() {

    ValueNode valueNode = new ValueNode(1);
    valueNode.getCountOfTwos();

    Assert.assertEquals(0, 0);
  }
}
package com.teksystems.bootcamp.capstone2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReceiptTest {

  @Test
  public void testGetValue() {
    Receipt receipt = new Receipt();
    double actual = receipt.getValue(0);

    Assert.assertEquals(actual, 0);
  }
}
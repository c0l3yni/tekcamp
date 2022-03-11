package com.teksystems.bootcamp.capstone2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReceiptTest {

  @Test
  public void testGetValueIfTotalZeroReturnZero() {
    Receipt receipt = new Receipt();
    double actual = receipt.getValue(0, 0);

    Assert.assertEquals(actual, 0);
  }
  @Test
  public void testGetValue() {
    Receipt receipt = new Receipt();
    double actual = receipt.getValue(2, 2);

    Assert.assertEquals(actual, 4);
  }
}
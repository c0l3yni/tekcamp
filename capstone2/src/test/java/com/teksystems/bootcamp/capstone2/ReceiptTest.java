package com.teksystems.bootcamp.capstone2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReceiptTest {

  @Test
  public void testGetValueIfTotalZeroReturnZero() {
    Receipt receipt = new Receipt();
    double actual = receipt.getValue(0);

    Assert.assertEquals(actual, 0);
  }

  @Test
  public void testGetValueOfTwoPlusThreePlusOneReturnSix() {
    Receipt receipt = new Receipt();
    receipt.getValue(2);
    receipt.getValue(3);

    Assert.assertEquals(receipt.getValue(1), 6);
  }

  @Test
  public void testGetTaxTotalTaxTimesTwelveReturnPointNinetyNine() {
    Receipt receipt = new Receipt();
    double actual = receipt.getTaxTotal(12);
    Assert.assertEquals(actual, .99);
  }

}
package com.teksystems.bootcamp.capstone2.Receipt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReceiptTest {

  @Test
  public void testGetValueIfTotalZeroReturnZero() {
    Receipt receipt = new Receipt();
    double actual = receipt.receiptSubTotal(0);

    Assert.assertEquals(actual, 0);
  }

  @Test
  public void testGetValueOfTwoPlusThreePlusOneReturnSix() {
    Receipt receipt = new Receipt();
    receipt.receiptSubTotal(2);
    receipt.receiptSubTotal(3);

    Assert.assertEquals(receipt.receiptSubTotal(1), 6);
  }

  @Test
  public void testGetTaxTotalTaxTimesTwelveReturnPointNinetyNine() {
    Receipt receipt = new Receipt();
    double actual = receipt.receiptTaxTotal(12);
    Assert.assertEquals(actual, 12.99);
  }

}
package com.teksystems.bootcamp.capstone2.Receipt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderHistoryTest {

  @Test
  public void testReceiptFinderFailure() {
    OrderHistory history = new OrderHistory();
    Receipt actual = history.receiptFinder(1);
    Assert.assertNull(actual);
  }

  @Test
  public void testReceiptFinder() {
    OrderHistory history = new OrderHistory();
    Receipt receipt = new Receipt();
    history.addReceipt(receipt);
    int orderNo = receipt.getOrderNum();
    int actual = history.receiptFinder(orderNo).getOrderNum();
    Assert.assertEquals(actual, orderNo);
  }



/*  @Test
  public void testReceiptFinder2() {
    OrderHistory history = new OrderHistory();
    Receipt receipt = new Receipt();
    void actual = history.addReceipt(receipt);
    Assert.assertEquals(actual, 0);
  }*/
}
package com.teksystems.bootcamp.capstone2.Checkout;

import java.util.ArrayList;
import java.util.List;

public class OrderHistory {
  private List<Receipt> receipts = new ArrayList<>();

  public void addReceipt(Receipt receipt) {
    receipts.add(receipt);
  }

  public Receipt receiptFinder(int userInput) {
    for (int i = 0; i < receipts.size(); i++) {
      if (receipts.get(i).getOrderNum() == userInput) {
        return receipts.get(i);
      }
    }
    return null;
  }
}

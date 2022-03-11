package com.teksystems.bootcamp.capstone2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManchegoTest {

  @Test
  public void testGetManchegoAddOneReturnOne() {
    Manchego manchego = new Manchego();
    int actual = manchego.getManchego(1);
    Assert.assertEquals(actual, 1);
  }
}

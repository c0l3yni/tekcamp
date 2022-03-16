package com.teksystems.bootcamp.capstone2.Combo;

import com.teksystems.bootcamp.capstone2.MenuItem.Combo.Combo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComboTest {

  @Test
  public void testFindMenuOption() {
    int actual = Combo.findMenuOption().size();

    Assert.assertEquals(actual, 2);
  }

}
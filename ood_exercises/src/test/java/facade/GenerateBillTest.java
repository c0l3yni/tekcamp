package facade;

import com.teksystems.bootcamp.ood_exercises.facade.GenerateBill;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GenerateBillTest {

  @Test
  public void testOrderNumIfGivenItemExistWithStockReturnCostOfItem() {
GenerateBill generateBill = new GenerateBill();
double actual = generateBill.generateBill("Octopus", 1);
    Assert.assertEquals(actual, 200.00);
  }

  @Test
  public void testOrderNumIfGivenItemExistWithNoStockReturn0() {
    GenerateBill generateBill = new GenerateBill();
    double actual = generateBill.generateBill("Omelette", 1);
    Assert.assertEquals(actual, 0);
  }
}
package com.teksystems.bootcamp.java_exercises.findCharacters;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class CharFinderTest {

  @Test
  public void testFindMatchedPositionsGivenAWillReturnA() {
    List<Integer> expected = new ArrayList<>();
    expected.add(0);

    String charsToFind = "a";
    String stringToSearch = "abby";

    Assert.assertEquals(CharFinder.findMatchedPositions(charsToFind, stringToSearch).get('a'), expected);
  }
  @Test
  public void testFindMatchedPositionsGivenABWillReturnAB() {
    List<Integer> expected = new ArrayList<>();
    expected.add(1);

    String charsToFind = "b";
    String stringToSearch = "abacus";

    Assert.assertEquals(CharFinder.findMatchedPositions(charsToFind, stringToSearch).get('b'), expected);
  }

}

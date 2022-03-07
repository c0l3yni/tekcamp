package com.teksystems.bootcamp.java_exercises.findCharacters;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class CharFinderTest {

  @Test
  public void testFindMatchedPositions() {
    List<Integer> expected = new ArrayList<>();
    expected.add(0);

    Assert.assertEquals(CharFinder.findMatchedPositions("abc", "abby").get('a'), expected);
  }
}

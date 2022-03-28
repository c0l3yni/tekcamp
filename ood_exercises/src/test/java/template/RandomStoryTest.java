package template;

import com.teksystems.bootcamp.ood_exercises.template.RandomStory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class RandomStoryTest {
  RandomStory randomStory = new RandomStory();
  @Test
  public void testEdVerbLList() {
    HashMap<Integer, String> edVerbLList = randomStory.edVerbLList();
    int actual = edVerbLList.size();

    Assert.assertEquals(actual, 7);
  }

  @Test
  public void testListOfProperties() {
    HashMap<Integer, String> listOfProperties = randomStory.listOfProperties();
    int actual = listOfProperties.size();

    Assert.assertEquals(actual, 8);
  }

  @Test
  public void testListOfINGVerbs() {
    HashMap<Integer, String> listOfINGVerbs = randomStory.listOfINGVerbs();
    int actual = listOfINGVerbs.size();

    Assert.assertEquals(actual, 8);
  }
}
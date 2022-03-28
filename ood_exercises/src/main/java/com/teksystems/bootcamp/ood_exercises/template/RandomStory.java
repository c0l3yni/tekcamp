package com.teksystems.bootcamp.ood_exercises.template;
import java.util.HashMap;

public class RandomStory extends MadLibs{
  public HashMap<Integer, String> edVerbLList() {
    HashMap<Integer, String> edVerbs = new HashMap<>();
    edVerbs.put(0, "started");
    edVerbs.put(1, "farted");
    edVerbs.put(2, "parted");
    edVerbs.put(3, "tried");
    edVerbs.put(4, "cried");
    edVerbs.put(5, "barked");
    edVerbs.put(6, "rolled");
    return edVerbs;
  }

  @Override
  String getVerbEDOne() {
    int max = 7;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return edVerbLList().get(randomNum);
  }

  @Override
  String getVerbED() {
    int max = 6;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return edVerbLList().get(randomNum);
  }

  @Override
  String getPropertyThree() {
    int max = 7;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return listOfProperties().get(randomNum);
  }

  @Override
  String getPropertyTwo() {
    int max = 7;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return listOfProperties().get(randomNum);
  }

  @Override
  String getPropertyOne() {
    int max = 7;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return listOfProperties().get(randomNum);
  }

  public HashMap<Integer, String> listOfProperties() {
    HashMap<Integer, String> properties = new HashMap<>();
    properties.put(0, "String cupType");
    properties.put(1, "int numberOfShots");
    properties.put(2, "boolean decaf");
    properties.put(3, "boolean ristretto");
    properties.put(4, "String coffeeRoast");
    properties.put(5, "int numberOfSugar");
    properties.put(6, "int numberOfCream");
    properties.put(7, "String typeOfCream");
    return properties;
  }
public HashMap<Integer, String> listOfINGVerbs() {
  HashMap<Integer, String> ingVerbs = new HashMap<>();
  ingVerbs.put(0, "breaking");
  ingVerbs.put(1, "farting");
  ingVerbs.put(2, "eating");
  ingVerbs.put(3, "carving");
  ingVerbs.put(4, "yelling");
  ingVerbs.put(5, "crying");
  ingVerbs.put(6, "screaming");
  ingVerbs.put(7, "sleeping");
  return ingVerbs;
}

  @Override
  String getVerbING() {
    int max = 7;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return listOfINGVerbs().get(randomNum);
  }

  @Override
  String getVerbINGThree() {
    int max = 7;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return listOfINGVerbs().get(randomNum);
  }

  @Override
  String getVerbINGTwo() {
    int max = 7;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return listOfINGVerbs().get(randomNum);
  }

  @Override
  String getVerbINGOne() {
    int max = 7;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return listOfINGVerbs().get(randomNum);
  }

  @Override
  String getJob() {
    HashMap<Integer, String> jobs = new HashMap<>();
    jobs.put(0, "junior devOPS architect");
    jobs.put(1, "junior backend architect");
    jobs.put(2, "junior front-end architect");
    jobs.put(3, "junior coreDEV architect");
    jobs.put(4, "junior DAI architect");
    int max = 4;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return jobs.get(randomNum);
  }

  @Override
  String getFeeling() {
    HashMap<Integer, String> feelings = new HashMap<>();
    feelings.put(0, "angry");
    feelings.put(1, "overjoyed");
    feelings.put(2, "frustrated");
    feelings.put(3, "annoyed");
    feelings.put(4, "dumbfounded");
    int max = 4;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return feelings.get(randomNum);
  }

  @Override
  String getRoom() {
    HashMap<Integer, String> rooms = new HashMap<>();
    rooms.put(0, "dark room");
    rooms.put(1, "bright room");
    rooms.put(2, "pink room");
    rooms.put(3, "cold room");
    int max = 3;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return rooms.get(randomNum);
  }

  @Override
  String getDrink() {
    HashMap<Integer, String> drinks = new HashMap<>();
    drinks.put(0, "hot coffee");
    drinks.put(1, "iced coffee");
    drinks.put(2, "orange juice");
    drinks.put(3, "apple juice");
    int max = 3;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return drinks.get(randomNum);
  }

  @Override
  String getFood() {
    HashMap<Integer, String> foods = new HashMap<>();
    foods.put(0, "oatmeal");
    foods.put(1, "porridge");
    foods.put(2, "Trix cereal");
    int max = 2;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return foods.get(randomNum);
  }

  @Override
  String getDate() {
    HashMap<Integer, String> dates = new HashMap<>();
    dates.put(0, "August 12, 1997");
    dates.put(1, "August 11, 1991");
    dates.put(2, "June 13, 2017");
    dates.put(3, "April 14, 1975");
    dates.put(4, "August 28, 1970");
    dates.put(5, "November 13, 1996");
    dates.put(6, "January 2, 2007");
    int max = 6;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return dates.get(randomNum);
  }

  @Override
  String getName() {
    HashMap<Integer, String> names = new HashMap<>();
    names.put(0, "Cole");
    names.put(1, "Robin");
    names.put(2, "Jonah");
    names.put(3, "Beth");
    names.put(4, "Kuryn");
    int max = 4;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return names.get(randomNum);
  }
}

package com.teksystems.bootcamp.capstone2.MenuItem.Combo;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Crackers;
import com.teksystems.bootcamp.capstone2.MenuItem.Entree.HardCheese;
import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Meat;
import com.teksystems.bootcamp.capstone2.MenuItem.Entree.SoftCheese;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Briny;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.FreshFruit;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Nut;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Vegetable;
import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Dip;
import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Spread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ButcherBlock extends Combo {
  private static final String name = "Butch-er Block Combo";
  private static final Double price = 45.00;

  private final SoftCheese cheese6;
  private final SoftCheese cheese5;

  private final HardCheese cheese1;
  private final HardCheese cheese2;
  private final HardCheese cheese3;
  private final HardCheese cheese4;

  private final Meat meat1;
  private final Meat meat2;
  private final Meat meat3;

  private final Crackers crackers1;
  private final Crackers crackers2;

  private final Spread spread1;
  private final Spread spread2;
  private final Spread spread3;

  private final Dip dip1;
  private final Dip dip2;
  private final Dip dip3;

  private final FreshFruit fruit1;
  private final FreshFruit fruit2;

  private final Briny briny1;
  private final Briny briny2;

  private final Nut nut1;

  private final Vegetable veg1;
  private final Vegetable veg2;

  public ButcherBlock() {
    super(name, price);
    double cost = 0;
    cheese1= new HardCheese("Manchego");
    cheese2 = new HardCheese("Gouda");
    cheese3 = new HardCheese("Swiss");
    cheese4 = new HardCheese("White Cheddar");

    cheese5 = new SoftCheese("Brie");
    cheese6 = new SoftCheese("Goat Cheese");

    meat1 = new Meat("Sopressata", cost);
    meat2 = new Meat("Ham", cost);
    meat3 = new Meat("Prosciutto", cost);

    crackers1 = new Crackers("Mini Toast", cost);
    crackers2 = new Crackers("Pita", cost);

    spread1 = new Spread("Orange Blossom Marmalade", cost);
    spread2 = new Spread("Fig Jam", cost);
    spread3 = new Spread("Strawberry Jam", cost);

    dip1 = new Dip("Black Pepper Ranch", cost);
    dip2 = new Dip("Rosemary Hummus", cost);
    dip3 = new Dip("Balsamic and Oil", cost);

    fruit1 = new FreshFruit("Apples", cost);
    fruit2 = new FreshFruit("Strawberries", cost);

    briny1 = new Briny("Pickles", cost);
    briny2 = new Briny("Olives", cost);

    nut1 = new Nut("Walnuts", cost);

    veg1 = new Vegetable("Carrots", cost);
    veg2 = new Vegetable("Tomatoes", cost);
  }

  public static List<String> getComboOptions() {
    List<String> options = new ArrayList<>();
    options.add("Gouda");
    options.add("Manchego");
    options.add("Swiss");
    options.add("White Cheddar");

    options.add("Brie");
    options.add("Goat Cheese");

    options.add("Ham");
    options.add("Sopressata");
    options.add("Prosciutto");

    options.add("Pita");
    options.add("Mini Toast");

    options.add("Fig Jam");
    options.add("Strawberry Jam");
    options.add("Orange Blossom Marmalade");

    options.add("Rosemary Hummus");
    options.add("Balsamic and Oil");

    options.add("Grapes");
    options.add("Pickles");
    options.add("Almond");
    options.add("Carrots");
    return options;
  }

  public static HashMap<String, String> findMenuOption() {
    HashMap<String, String> findComboOption = new HashMap<>();
    for (int i = 0; i < getComboOptions().size(); i++) {
      findComboOption.put(Integer.toString(i), getComboOptions().get(i));
    }
    return findComboOption;
  }

}

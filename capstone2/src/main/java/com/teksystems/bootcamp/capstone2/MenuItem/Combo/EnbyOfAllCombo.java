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

public class EnbyOfAllCombo extends Combo {
  private static final String name = "Enby Of All Combo";
  private static final Double price = 20.00;

  private  SoftCheese cheese1;
  private  HardCheese cheese2;
  private  HardCheese cheese3;

  private  Meat meat1;

  private  Crackers crackers1;

  private  Spread spread1;
  private  Dip dip1;
  private  Dip dip2;
  private  Spread spread2;

  private FreshFruit fruit1;
  private  Briny briny1;
  private  Nut nut1;
  private  Vegetable veg1;

  public EnbyOfAllCombo() {
    super(name, price);
    cheese1 = new SoftCheese("Brie");
    cheese2 = new HardCheese("Gouda");
    cheese3 = new HardCheese("Manchego");
    meat1 = new Meat("Prosciutto", 0);
    crackers1 = new Crackers("Pita", 0);

    spread1 = new Spread("Fig Jam", 0);
    spread2 = new Spread("Strawberry Jam", 0);
    dip1 = new Dip("Rosemary Hummus", 0);
    dip2 = new Dip("Balsamic and Oil", 0);

    fruit1 = new FreshFruit("Grapes", 0);
    briny1 = new Briny("Pickles", 0);
    nut1 = new Nut("Almond", 0);
    veg1 = new Vegetable("Carrots", 0);
  }

  public FreshFruit getFruit1() {
    return fruit1;
  }

  public void setFruit1(FreshFruit newFruit) {
    fruit1 = newFruit;
  }

  public static List<String> getComboAllOptions() {
    List<String> options = new ArrayList<>();
    options.add("Brie");
    options.add( "Gouda");
    options.add( "Manchego");
    options.add( "Prosciutto");
    options.add("Pita");

    options.add("Fig Jam");
    options.add("Strawberry Jam");
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
    for (int i = 0; i < getComboAllOptions().size(); i++) {
      findComboOption.put(Integer.toString(i), getComboAllOptions().get(i));
    }
    return findComboOption;
  }

  public static List<String> getComboCustomOptions() {
    List<String> options = new ArrayList<>();
    options.add("Fig Jam");
    options.add("Strawberry Jam");
    options.add("Rosemary Hummus");
    options.add("Balsamic and Oil");

    options.add("Grapes");
    options.add("Pickles");
    options.add("Almond");
    options.add("Carrots");
    return options;
  }

  public static HashMap<String, String> findComboOption() {
    HashMap<String, String> findComboOption = new HashMap<>();
    for (int i = 0; i < getComboCustomOptions().size(); i++) {
      findComboOption.put(Integer.toString(i), getComboCustomOptions().get(i));
    }
    return findComboOption;
  }


  public Spread getSpread1() {
    return spread1;
  }

  public void setSpread1(Spread spread1) {
    this.spread1 = spread1;
  }

  public Dip getDip1() {
    return dip1;
  }

  public void setDip1(Dip dip1) {
    this.dip1 = dip1;
  }

  public Dip getDip2() {
    return dip2;
  }

  public void setDip2(Dip dip2) {
    this.dip2 = dip2;
  }

  public Spread getSpread2() {
    return spread2;
  }

  public void setSpread2(Spread spread2) {
    this.spread2 = spread2;
  }

  public Briny getBriny1() {
    return briny1;
  }

  public void setBriny1(Briny briny1) {
    this.briny1 = briny1;
  }

  public Nut getNut1() {
    return nut1;
  }

  public void setNut1(Nut nut1) {
    this.nut1 = nut1;
  }

  public Vegetable getVeg1() {
    return veg1;
  }

  public void setVeg1(Vegetable veg1) {
    this.veg1 = veg1;
  }

}


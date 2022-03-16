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

  private SoftCheese cheese6;
  private SoftCheese cheese5;

  private HardCheese cheese1;
  private HardCheese cheese2;
  private HardCheese cheese3;
  private HardCheese cheese4;

  private Meat meat1;
  private Meat meat2;
  private Meat meat3;

  private Crackers crackers1;
  private Crackers crackers2;

  private Spread spread1;
  private Spread spread2;
  private Spread spread3;

  private Dip dip1;
  private Dip dip2;
  private Dip dip3;

  private FreshFruit fruit1;
  private FreshFruit fruit2;

  private Briny briny1;
  private Briny briny2;

  private Nut nut1;

  private Vegetable veg1;
  private Vegetable veg2;

  public ButcherBlock() {
    super(name, price);
    double cost = 0;
    cheese1 = new HardCheese("Manchego");
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

  public List<String> getComboOptions() {
    List<String> options = new ArrayList<>();
    options.add(cheese1.getName());
    options.add(cheese2.getName());
    options.add(cheese3.getName());
    options.add(cheese4.getName());
    options.add(cheese5.getName());
    options.add(meat1.getName());
    options.add(meat2.getName());
    options.add(meat3.getName());
    options.add(crackers1.getName());
    options.add(crackers2.getName());

    options.add(spread1.getName());
    options.add(spread2.getName());
    options.add(spread3.getName());
    options.add(dip1.getName());
    options.add(dip2.getName());
    options.add(dip3.getName());

    options.add(fruit1.getName());
    options.add(fruit2.getName());
    options.add(briny1.getName());
    options.add(briny2.getName());
    options.add(nut1.getName());
    options.add(veg1.getName());
    options.add(veg2.getName());
    return options;
  }

  public HashMap<String, String> findMenuOption2() {
    HashMap<String, String> findComboOption = new HashMap<>();
    int i = 0;
    for (i = 0; i < getComboOptions().size(); i++) {
      findComboOption.put(Integer.toString(i + 1), getComboOptions().get(i));
    }
    findComboOption.put(Integer.toString(i + 1), "Add to Order");
    return findComboOption;
  }

  public SoftCheese getCheese6() {
    return cheese6;
  }

  public void setCheese6(SoftCheese cheese6) {
    this.cheese6 = cheese6;
  }

  public SoftCheese getCheese5() {
    return cheese5;
  }

  public void setCheese5(SoftCheese cheese5) {
    this.cheese5 = cheese5;
  }

  public HardCheese getCheese1() {
    return cheese1;
  }

  public void setCheese1(HardCheese cheese1) {
    this.cheese1 = cheese1;
  }

  public HardCheese getCheese2() {
    return cheese2;
  }

  public void setCheese2(HardCheese cheese2) {
    this.cheese2 = cheese2;
  }

  public HardCheese getCheese3() {
    return cheese3;
  }

  public void setCheese3(HardCheese cheese3) {
    this.cheese3 = cheese3;
  }

  public HardCheese getCheese4() {
    return cheese4;
  }

  public void setCheese4(HardCheese cheese4) {
    this.cheese4 = cheese4;
  }

  public Meat getMeat1() {
    return meat1;
  }

  public void setMeat1(Meat meat1) {
    this.meat1 = meat1;
  }

  public Meat getMeat2() {
    return meat2;
  }

  public void setMeat2(Meat meat2) {
    this.meat2 = meat2;
  }

  public Meat getMeat3() {
    return meat3;
  }

  public void setMeat3(Meat meat3) {
    this.meat3 = meat3;
  }

  public Crackers getCrackers1() {
    return crackers1;
  }

  public void setCrackers1(Crackers crackers1) {
    this.crackers1 = crackers1;
  }

  public Crackers getCrackers2() {
    return crackers2;
  }

  public void setCrackers2(Crackers crackers2) {
    this.crackers2 = crackers2;
  }

  public Spread getSpread1() {
    return spread1;
  }

  public void setSpread1(Spread spread1) {
    this.spread1 = spread1;
  }

  public Spread getSpread2() {
    return spread2;
  }

  public void setSpread2(Spread spread2) {
    this.spread2 = spread2;
  }

  public Spread getSpread3() {
    return spread3;
  }

  public void setSpread3(Spread spread3) {
    this.spread3 = spread3;
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

  public Dip getDip3() {
    return dip3;
  }

  public void setDip3(Dip dip3) {
    this.dip3 = dip3;
  }

  public FreshFruit getFruit1() {
    return fruit1;
  }

  public void setFruit1(FreshFruit fruit1) {
    this.fruit1 = fruit1;
  }

  public FreshFruit getFruit2() {
    return fruit2;
  }

  public void setFruit2(FreshFruit fruit2) {
    this.fruit2 = fruit2;
  }

  public Briny getBriny1() {
    return briny1;
  }

  public void setBriny1(Briny briny1) {
    this.briny1 = briny1;
  }

  public Briny getBriny2() {
    return briny2;
  }

  public void setBriny2(Briny briny2) {
    this.briny2 = briny2;
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

  public Vegetable getVeg2() {
    return veg2;
  }

  public void setVeg2(Vegetable veg2) {
    this.veg2 = veg2;
  }
}

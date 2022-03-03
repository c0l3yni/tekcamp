package com.teksystems.bootcamp.java_exercises.findCharacters;

import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CharFinder {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.print("Input characters to search for: ");
    String inputSearch = userInput.nextLine();

    System.out.print("String to search for those characters in: ");
    String stringSearch = userInput.nextLine();

    HashMap< Character, List<Integer>> matchPositions = findMatchedPositions(inputSearch, stringSearch);
    System.out.println(matchPositions);
  }
  public static HashMap< Character, List<Integer>> findMatchedPositions(String charsToFind, String stringToSearch) {
    HashMap< Character, List<Integer>> matchPositions = new HashMap<>();

    for (int i = 0; i < charsToFind.length(); i++ ) {
      List<Integer> integerArrayList = new ArrayList<>();
      matchPositions.put(charsToFind.charAt(i), integerArrayList);
    }

    for (int i = 0; i < stringToSearch.length(); i++ ) {
      if (matchPositions.containsKey(stringToSearch.charAt(i))) {
        matchPositions.get(stringToSearch.charAt(i)).add(i);
      }
    }

    return  matchPositions;
  }

}

package org.launchcode.java.Studio;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String test = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        countingLetters(test);
    }

    public static void countingLetters(String sentence) {
        sentence = sentence.toLowerCase();
        char[] charactersInString = sentence.toCharArray();
        int size = charactersInString.length;
        char letter;
        int value;
        HashMap<Character, Integer> characters = new HashMap<>();
        for (int i = 0; i < size; i++) {
            letter = charactersInString[i];
            if (Character.isAlphabetic(letter)) {
                if (characters.containsKey(letter)) {
                    value = characters.get(letter);
                    value++;
                    characters.replace(letter, value);
                } else {
                    characters.put(letter, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> character : characters.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}

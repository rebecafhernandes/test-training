package br.com.tests.utils;

import java.util.HashMap;
import java.util.Map;

public class NumberLetterConverter {

    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private Map<String, Integer> letterValues;

    public NumberLetterConverter() {
        this.letterValues = loadLetterLowerCaseValues();
    }

    public Integer getLetterValue(String letter) {
        return letterValues.get(letter);
    }

    public Map<String, Integer> loadLetterLowerCaseValues() {
        Map<String, Integer> letterValues = new HashMap<>();

        int pos = 1;

        for(char character : alphabet.toCharArray()) {
            letterValues.put(String.valueOf(character), pos);
            pos++;
        }

        String upperCaseAlphabet = alphabet.toUpperCase();

        for(char character : upperCaseAlphabet.toCharArray()) {
            letterValues.put(String.valueOf(character), pos);
            pos++;
        }

        return letterValues;
    }

}

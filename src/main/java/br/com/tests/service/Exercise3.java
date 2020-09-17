package br.com.tests.service;

import br.com.tests.utils.NumberLetterConverter;

public class Exercise3 {

    private static NumberLetterConverter numberLetterConverter = new NumberLetterConverter();

    public static void main(String[] args) {
        int wordValue = returnWordValue("Rebeca");

        boolean isPrime = isPrimeWord(wordValue);
        boolean isHappy = isHappyWord(wordValue);
        boolean isMultiple = isMultipleBy3or5Word(wordValue);

        System.out.println(isPrime);
        System.out.println(isHappy);
        System.out.println(isMultiple);
    }

    public static int returnWordValue(String word) {
        int totalValue = 0;

        char[] letters = word.toCharArray();
        for (char letter : letters) {
            totalValue += numberLetterConverter.getLetterValue(String.valueOf(letter));
        }

        return totalValue;
    }

    public static boolean isPrimeWord(int wordValue) {
        for (int j = 2; j < wordValue; j++) {
            if (wordValue % j == 0)
                return false;
        }
        return true;
    }

    public static boolean isHappyWord(int wordValue) {
        return Exercise2.isHappyNumber(wordValue);
    }

    public static boolean isMultipleBy3or5Word(int wordValue) {
        if ((wordValue % 3 == 0) || (wordValue % 5 == 0)) return true;
        return false;
    }

}

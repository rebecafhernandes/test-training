package br.com.tests.service.builder;

import java.util.ArrayList;
import java.util.List;

public class NaturalNumbersBuilder {
    List<Long> naturalNumbers;

    public NaturalNumbersBuilder() {
    }

    public static NaturalNumbersBuilder listOf1000NaturalNumbers() {
        NaturalNumbersBuilder naturalNumbersBuilder = new NaturalNumbersBuilder();
        naturalNumbersBuilder.naturalNumbers = returnNaturalNumbersList(1000L);
        return naturalNumbersBuilder;
    }

    public static List<Long> returnNaturalNumbersList(Long maxValue) {
        List<Long> naturalNumbers = new ArrayList<>();

        for (int i = 0; i < maxValue; i++) {
            naturalNumbers.add((long) i);
        }
        return naturalNumbers;
    }

    public List<Long> now() {
        return naturalNumbers;
    }


}

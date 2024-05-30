package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaximumNumbersOfBallons {
    public int maxNumberOfBalloons(String text) {

        Map<Character, Long> wordFrequency = text.chars()
                .mapToObj(letter -> (char) letter)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long min = Collections.min(new ArrayList<>(Arrays.asList(
            wordFrequency.getOrDefault('b', 0L),
            wordFrequency.getOrDefault('a', 0L),
            wordFrequency.getOrDefault('l', 0L) / 2,
            wordFrequency.getOrDefault('o', 0L) / 2,
            wordFrequency.getOrDefault('n', 0L))));

        return (int)min;
    }
}

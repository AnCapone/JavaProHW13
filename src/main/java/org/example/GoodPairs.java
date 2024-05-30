package org.example;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Long> numbersFrequency = IntStream.of(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return numbersFrequency.values().stream().
                mapToInt(frequency -> Math.toIntExact(frequency * (frequency - 1) / 2))
                .sum();
    }
}

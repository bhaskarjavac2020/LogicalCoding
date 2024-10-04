package com.practice.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random()*(10));
        }
        System.out.println("Before sort: "+Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After sort: "+Arrays.toString(numbers));
        Map<Integer,Long> frequencyMap = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(num->num, Collectors.counting()));
        System.out.println("Frequency: "+frequencyMap);
    }
}

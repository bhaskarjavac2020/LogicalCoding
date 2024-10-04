package com.practice.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(numbers));
        removeDuplicateArray(numbers);
        removeDuplicateArrayUsingStremAPI(numbers);
        frequencyOfArray(numbers);
    }

    private static void frequencyOfArray(int[] numbers) {
        Map<Integer,Long> frequencyMap=Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println("Frequency of list: "+frequencyMap);
    }

    private static void removeDuplicateArrayUsingStremAPI(int[] numbers) {
        int[] uniqueArray=Arrays.stream(numbers).distinct().toArray();
        System.out.println("Using stream API: "+Arrays.toString(uniqueArray));
    }

    private static void removeDuplicateArray(int[] numbers) {
        int[] removeDuplicates = new int[numbers.length];
        int uniqueCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            // Check if the current number is already in the tempArray
            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                removeDuplicates[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }
        int[] uniqueArray = Arrays.copyOf(removeDuplicates, uniqueCount);
        System.out.println("Using array: "+Arrays.toString(uniqueArray));
    }
}

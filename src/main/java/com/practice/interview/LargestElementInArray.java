package com.practice.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] numbers=new int[20];
        for (int i=0;i<numbers.length;i++){
            numbers[i]=(int) (Math.random()*(100-1)+1);
        }
        System.out.println(Arrays.toString(numbers));
        frequencyOfArray(numbers);
        largestNumberUsingStreamAPI(numbers);
        largestNumberUsingArray(numbers);
    }

    private static void largestNumberUsingArray(int[] numbers) {
        int largest=numbers[0];
        for (int i=1;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        System.out.println("Largest number is(largestNumberUsingArray) : "+largest);
    }

    private static void largestNumberUsingStreamAPI(int[] numbers) {
        int largest=Arrays.stream(numbers).max().getAsInt();
        System.out.println("largest number:(largestNumberUsingStreamAPI) "+largest);
        int smallest=Arrays.stream(numbers).min().getAsInt();
        System.out.println("smallest number:(smallestNumberUsingStreamAPI) "+smallest);
    }

    private static void frequencyOfArray(int[] numbers) {
        Map<Integer,Long> frequencyMap=Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println("frequencyOfArray: "+frequencyMap);
    }
}

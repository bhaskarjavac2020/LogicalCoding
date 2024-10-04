package com.practice.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MergeTwoArrays {
    public static void main(String[] args) {
        mergeTwoArray();
    }

    private static void mergeTwoArray() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8,4};
        int[] merged=new int[arr1.length+arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        Map<Integer,Long> frequencyMap=Arrays.stream(merged)
                .boxed()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(frequencyMap);
        Set<Integer> set = Arrays.stream(merged)
                        .boxed().collect(Collectors.toSet());
        System.out.println(set);
    }
}

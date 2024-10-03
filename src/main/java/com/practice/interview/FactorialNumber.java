package com.practice.interview;

import java.util.stream.IntStream;

public class FactorialNumber {
    public static void main(String[] args) {
        findFactorialNumber(5);
        findFactorialNumberUsingStreamAPI(5);
    }

    private static void findFactorialNumberUsingStreamAPI(int n) {
        int result = IntStream.rangeClosed(1,n)
                .reduce(1, (x, y) -> x * y);
        System.out.println("Stream API: "+result);
    }

    private static void findFactorialNumber(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}

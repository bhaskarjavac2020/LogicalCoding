package com.practice.interview;

import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        findFibonacciSeries(10);
        System.out.println("\n------------");
        findFibonacciSeriesUsingStreamAPI(10);
    }

    private static void findFibonacciSeriesUsingStreamAPI(int n) {
        Stream.iterate(new long[]{0,1},fib->new long[]{fib[1],fib[0]+fib[1]})
                .limit(n)
                .map(fib->fib[0]+" ")
                .forEach(System.out::print);
    }

    private static void findFibonacciSeries(int n) {
        int num1=0,num2=1;
        System.out.print("Fibonacci series: "+num1+","+num2);
        for (int i=2;i<n;i++){
            int num3 = num1+num2;
            System.out.print(","+num3);
            num1 = num2;
            num2 = num3;
        }
    }
}

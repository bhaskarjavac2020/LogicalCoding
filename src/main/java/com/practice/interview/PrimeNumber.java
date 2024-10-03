package com.practice.interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Prime number: ");
        for (int i = 2; i <= 100; i++) {
            checkPrimeNumber(i);
        }
        System.out.print("\n-------------------------------------------------\n");
        findPrimeNumberByStreamAPI(100).forEach(System.out::print);
    }
    private static IntStream findPrimeNumberByStreamAPI(int limit){
        return IntStream.rangeClosed(2, limit).filter(PrimeNumber::isPrime);
    }
    private static boolean isPrime(int number) {
        return number>1 && IntStream.rangeClosed(2,(int)Math.sqrt(number))
                .noneMatch(i->number%i==0);
    }
    private static void checkPrimeNumber(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.print(n+" ");;
        }
    }
}

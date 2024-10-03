package com.practice.interview;

import java.util.stream.Collectors;

public class Palindrome {
    public static void main(String[] args) {
        checkPalindromeUsingStringBuilder("madam");
        checkPalindromeUsingStreamAPI("madam");
    }

    private static void checkPalindromeUsingStreamAPI(String str) {
        String reversed = str.chars().mapToObj(c->(char)c)
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        list->{
                    java.util.Collections.reverse(list);
                    return list.stream();
                        })).map(String::valueOf).collect(Collectors.joining());
        if (str.equals(reversed)) {
            System.out.println(str+" is a palindrome");
        }else {
            System.out.println(str+" is not a palindrome");
        }
    }

    public static void checkPalindromeUsingStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str).reverse();
        if (sb.toString().equals(str)) {
            System.out.println(str+" is a palindrome");
        }else {
            System.out.println(str+" is not a palindrome");
        }
    }
}

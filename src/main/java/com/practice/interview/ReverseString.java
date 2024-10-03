package com.practice.interview;

import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        checkReverseStringUsingStringBuilder("Rajan");
        checkReverseStringUsingChar("Rajan");
        checkReverseStringUsingString("Rajan");
        checkReverseStringUsingStreamAPI("Rajan");
    }

    private static void checkReverseStringUsingStreamAPI(String rajan) {
        String reversed = rajan.chars().mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        list -> {
                            java.util.Collections.reverse(list);
                            return list.stream();
                        }
                ))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("Using Stream API: " + reversed);
    }

    private static void checkReverseStringUsingString(String rajan) {
        String reversed = "";
        for (int i = rajan.length() - 1; i >= 0; i--) {
            reversed += rajan.charAt(i);
        }
        System.out.println("\nUsing String: " + reversed);
    }

    private static void checkReverseStringUsingStringBuilder(String name) {
        StringBuilder sb = new StringBuilder(name).reverse();
        System.out.println("String Builder: " + sb);
    }

    private static void checkReverseStringUsingChar(String rajan) {
        char[] chars = rajan.toCharArray();
        System.out.print("Using char: ");
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}

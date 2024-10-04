package com.practice.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPositiveAndNegetiveNumbers {
    public static void main(String[] args) {
        int[] numbers={4,-6,11,23,-67,-45,-56,12};
        findPositiveNumbersAndNegetiveNumbers(numbers);
    }

    private static void findPositiveNumbersAndNegetiveNumbers(int[] numbers) {
        Arrays.sort(numbers);
        int[] temp=new int[numbers.length];
        List<Integer> positiveNumbers=new ArrayList<>();
        List<Integer> negativeNumbers=new ArrayList<>();
        for(int number:numbers){
            if(number>=0){
                positiveNumbers.add(number);
            }else {
                negativeNumbers.add(number);
            }
        }
        // List to store the result
        List<Integer> result=new ArrayList<>();

        // Alternate between positives and negatives
        int posIndex=0,negIndex=0;
        while(posIndex<positiveNumbers.size()&&negIndex<negativeNumbers.size()){
            result.add(positiveNumbers.get(posIndex++));
            result.add(negativeNumbers.get(negIndex++));
        }
        while (posIndex<positiveNumbers.size()){
            result.add(positiveNumbers.get(posIndex++));
        }
        while (negIndex<negativeNumbers.size()){
            result.add(negativeNumbers.get(negIndex++));
        }
        int [] output=result.stream().mapToInt(i->i).toArray();
        System.out.println("Positive Numbers:"+positiveNumbers);
        System.out.println("Negative Numbers:"+negativeNumbers);
        System.out.println("Result Numbers:"+result);
        System.out.println("Output: "+Arrays.toString(output));
    }
}

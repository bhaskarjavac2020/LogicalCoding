package com.practice.interview;

import java.util.Arrays;

public class VowelConsonant {
    public static void main(String[] args) {
        String str="Automation";
        int vowelCount=0;
        int consonantCount=0;
        int index=0;
        char[] vowels=new char[str.length()];
        for(char ch:str.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)!=-1){
                vowelCount++;
                vowels[index++]=ch;
            }else if(Character.isLetter(ch)){
                consonantCount++;
            }
        }
        System.out.println("Vowel count: "+vowelCount+" Vowels are: "+ Arrays.toString(vowels));
        System.out.println("Consonant count: "+consonantCount);
    }
}

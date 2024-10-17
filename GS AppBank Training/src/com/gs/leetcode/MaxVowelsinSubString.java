package com.gs.leetcode;

import java.util.*;

public class MaxVowelsinSubString {
    public int maxVowels(String s, int k) {
        int maxCount = 0;
        int currentCount = 0;

        // Set of vowels
        String vowels = "aeiouAEIOU";

        // Count vowels in the first 'k' characters
        for (int i = 0; i < Math.min(k, s.length()); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentCount++;
            }
        }
        maxCount = currentCount;

        // Slide the window through the string
        for (int i = k; i < s.length(); i++) {
            // Remove the character going out of the window
            if (vowels.indexOf(s.charAt(i - k)) != -1) {
                currentCount--;
            }
            // Add the new character coming into the window
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentCount++;
            }
            // Update the maxCount if needed
            maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }

    public  int countVowelsInTheGivenString(String input){
        Map<Character,Integer>fd=new HashMap<>();
        String str=input.toLowerCase();
        int length=str.length();
        int count=0;
        for(int posi=0;posi<length;posi++){
            char ch=str.charAt(posi);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count=count+1;
            }
        }
        return  count;
    }

    public static void main(String[] args) {
        MaxVowelsinSubString solution = new MaxVowelsinSubString();
        String input = "abciiidef";
        int k = 3;
        int result1 = solution.maxVowels(input, k);
        int result2 = solution.countVowelsInTheGivenString(input);

        System.out.println("Maximum number of vowels in a substring of length " + k + " is: " + result1);
        System.out.println("Maximum number of vowels in a substring of length " + k + " is: " + result2);
    }
}

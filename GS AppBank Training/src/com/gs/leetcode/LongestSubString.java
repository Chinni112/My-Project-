package com.gs.leetcode;

import java.util.*;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0; // Left boundary of the window

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character is already in the map, update the start position
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            // Update the last seen index of the character
            charIndexMap.put(currentChar, end);
            // Calculate the length of the current substring
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubString subarray = new LongestSubString();
        String input = "abcabcbb";
        int result = subarray.lengthOfLongestSubstring(input);
        System.out.println("Length of longest substring with distinct characters: " + result);
    }
}

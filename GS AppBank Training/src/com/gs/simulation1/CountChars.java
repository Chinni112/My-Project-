package com.gs.simulation1;

import java.util.*;

public class CountChars {

    // Convert a string

    public Map<Character, Integer> countCharactersOfTheString(String input) {
        Map<Character, Integer> output = new HashMap<Character, Integer>();
        int length = input.length();
        for (
                int posi = 0;
                posi < length; posi++) {
            char ch = input.charAt(posi);
            if (output.containsKey(ch) == true) {
                int count = output.get(ch);
                count = count + 1;
                output.put(ch, count);
            } else {
                output.put(ch, 1);
            }
        }
        return output;
    }


    public static void main(String[] args) {
        CountChars training = new CountChars();
        String st = "aabbbycyyc";
        Map<Character, Integer> result = training.countCharactersOfTheString(st);
        Set<Character> keys = result.keySet();
        for (Character key : keys) {
            int value = result.get(key);
            System.out.println(key + ""+ value);
        }
    }
}


package com.gs.reference;

import java.util.HashMap;

public class RepeatingChar {
    public  static  char findTheRepeatingCharacterFromGivenStrng(String input) {
        HashMap<Character, Integer> op = new HashMap<>();
        int length = input.length(); // input="abcda";
        for (int posi = 0; posi < length; posi++) {
            char ch = input.charAt(posi);
            op.put(ch, op.getOrDefault(ch, 0) + 1);
            // second pass
        }
        for (char c : input.toCharArray()) {
            if (op.get(c) == 1) {    // c is key
                return c;
            }

        } return  'c';

    }

}

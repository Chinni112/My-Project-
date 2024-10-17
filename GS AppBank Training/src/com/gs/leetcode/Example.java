package com.gs.leetcode;

import  java.util.*;

public class Example {

    public static int lengthOfLastWord (String s){
        s=s.trim();
        String [] words=s.split(" ");
        if(words.length==0){
            return  0;
        }else{
            return  words[words.length-1].length();
        }
    }

    public static void main(String[] args) {

    }
}

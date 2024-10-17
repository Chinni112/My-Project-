package com.gs.reference;

import java.util.*;

public class Prefix {

    public  static  List<String> findwordsWithPrefix(String [] words, String pre){
        List<String>op= new ArrayList<>();
        for(String word:words){
            if(word.startsWith(pre)){
                op.add(word);
            }
        }
        return  op;
    }

    public static void main(String[] args) {
        String [] words={"apple", "applet", "bread", "aper"};
        String pre="app";
        List<String> wordsWithPrefix= findwordsWithPrefix(words,pre);
        System.out.println(wordsWithPrefix);
    }
}

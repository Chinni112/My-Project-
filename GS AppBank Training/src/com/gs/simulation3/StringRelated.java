package com.gs.simulation3;

import java.util.HashMap;
import java.util.Map;

public class StringRelated {

    public static boolean isBooleanOrNot(String str1,String str2){

        if(str1.length() !=str2.length()){
            return  false;  // different length can not be close
        }

            // check frequency for two strings
            Map<Character,Integer> map1=new HashMap<>();
            Map<Character,Integer> map2=new HashMap<>();

            for(char ch:str1.toCharArray()){
                map1.put(ch,map1.getOrDefault(ch,0)+1);
            }
            for(char ch: str2.toCharArray()){
                map2.put(ch,map2.getOrDefault(ch,0)+1);
            }

            if(!map1.keySet().equals(map2.keySet())){
                return  false;
            }
            // checking both maps have same frequency
        for (char ch : map1.keySet()) {
            if (!map1.get(ch).equals(map2.get(ch))) {
                return false;
            }
        }


        return  true;
    }

    public static void main(String[] args) {
        boolean result=isBooleanOrNot("ab","bcav");
        System.out.println(result);
    }
}

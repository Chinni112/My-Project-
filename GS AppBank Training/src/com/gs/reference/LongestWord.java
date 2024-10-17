package com.gs.reference;

public class LongestWord {

    public static int findLongestWordLength(String [] dist , String toSearch){
     int maxLength=0;
     toSearch=toSearch.toLowerCase(); // here use string to lower case

     for(String word:dist){
         // check the current word is there ara not
         word=word.toLowerCase(); //
         if(word.contains(toSearch)){
             if(word.length()> maxLength){
                 maxLength=word.length();
             }
         }
     }
     return maxLength;

    }

    public static void main(String[] args) {
        String [] dist={"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch="odg";
        int longestLength=findLongestWordLength(dist,toSearch);
        System.out.println("Longest length of substring of given string is : "+ longestLength);
    }
}

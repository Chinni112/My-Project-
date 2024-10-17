package com.gs.simulation2;

public class RemovingStars {

    public static String removingTheStarsInGivenString(String str){
        StringBuilder builder= new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch=='*'){
                // Remove the last character from the result if it's not empty
                if(builder.length()>0){
                    builder.deleteCharAt(builder.length()-1);
                }
            }else{
                builder.append(ch);
            }
        }
        return  builder.toString();
    }

    public static void main(String[] args) {
        String str = "erasde*****";
        String output=removingTheStarsInGivenString(str);
        System.out.println("Given String is "+ str+ " After removing Stars : "+ output);
    }
}

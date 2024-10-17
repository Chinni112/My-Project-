package com.gs.simulation4;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindow {

    public  static List<Integer> minimumSlidingWindow(int[] numbers,int k){
        List<Integer>minimumValues= new ArrayList<Integer>();

        for(int posi=0;posi<numbers.length-k;posi++){
            int min=numbers[posi];
            for(int j=1;j<k;j++){
                if(numbers[posi+j]<min){
                    min=numbers[posi+j];
                }
            }
            minimumValues.add(min);
        }
        return minimumValues;
    }

    public static void main(String[] args) {
        int [] array={9, 1, 3, -1, 5, 3, 6, 7};
        int k=3;

       List<Integer>result= minimumSlidingWindow(array,k);
       for(Integer min:result){
           System.out.println(min+" ");
       }
    }


}

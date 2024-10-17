package com.gs.sliding;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {

    public  int [] maxSliding(int[] no,int k){
        if(no== null || no.length==0|| k<=0){
            return new int[0];
        }

        int length=no.length;
        int [] result= new int [length-k+1];
        Deque<Integer>  deque= new LinkedList<>();

        for(int posi=0;posi<length;posi++){
            if(!deque.isEmpty()&& deque.peekFirst()<posi-k+1){
                deque.pollFirst();
            }

            while (!deque.isEmpty() && no[deque.peekLast()] <no [posi]){
                deque.pollLast();
            }
            deque.offerLast(posi);

            // The first k-1 elements are not ready, we start adding results from index k-1
            if (posi >= k - 1) {
                result[posi - k + 1] = no[deque.peekFirst()];
            }
        }

        return result;

        }

    public static void main(String[] args) {
        SlidingWindow solution = new SlidingWindow();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = solution.maxSliding(nums, k);

        for (int max : result) {
            System.out.print(max + " ");
        }
    }
    }


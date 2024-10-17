package com.gs.simulation4;

public class FindMinArrayBinSearch {

    public static int findingThePeak(int[] input) {
        int length = input.length;


        if (length == 1 || input[0] > input[1]) {
            return 0;
        }


        if (input[length - 1] > input[length - 2]) {
            return length - 1;
        }


        for (int i = 1; i < length - 1; i++) {
            if (input[i] > input[i - 1] && input[i] > input[i + 1]) {
                return i; // Found a peak
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 7, 8, 5, 4};
        int[] arr2 = {10, 20, 15, 5, 2};

        int peak1 = findingThePeak(arr1);
        int peak2 = findingThePeak(arr2);

        System.out.println("Peak index in arr1: " + peak1); // op is 3
        System.out.println("Peak index in arr2: " + peak2); //  op is 1

    }
    }



package com.gs.simulation1;

public class Subarray {

    public static int findShortestSubarray(int[] arr, int K) {
        int minLength = Integer.MAX_VALUE; // To store the length of the shortest subarray
        int currentSum = 0; // To store the sum of the current subarray
        int start = 0; // Start pointer of the sliding window

        // Traverse through the array
        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end]; // Add the current element to the current sum

            // While current sum is greater than or equal to K, shrink the window
            while (currentSum >= K) {
                if (currentSum == K) {
                    minLength = Math.min(minLength, end - start + 1); // Update the shortest subarray length
                }
                currentSum -= arr[start]; // Subtract the element at the start
                start++; // Move the start pointer to the right
            }
        }

        // If minLength is unchanged, return -1 indicating no subarray with sum K exists
        return (minLength == Integer.MAX_VALUE) ? -1 : minLength;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 10, 2, 1};
        int K1 = 12;
        System.out.println("Shortest subarray length: " + findShortestSubarray(arr1, K1)); // Output: 2

        int[] arr2 = {4, 4, 8, 4,9,88,89,90};
        int K2 = 8;
        System.out.println("Shortest subarray length: " + findShortestSubarray(arr2, K2)); // Output: 1
    }
}

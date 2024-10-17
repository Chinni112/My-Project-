package com.gs.leetcode;

public class MaxAveSubArray {

    public double findMaxAverage(int[] nums, int k) {
        // Check if k is valid
        if (nums.length < k || k <= 0) {
            throw new IllegalArgumentException("Invalid value of k");
        }

        double maxAverage = Integer.MIN_VALUE;
        double sum = 0.0;

        // Calculate the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Initialize maxAverage with the first window's average
        maxAverage = sum / k;

        // Slide the window from the k-th element to the end of the array
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k]; // Slide the window
            maxAverage = Math.max(maxAverage, sum / k); // Update the max average
        }

        return maxAverage;
    }

    public static void main(String[] args) {
        int [] array = {1, 2, 34, 2, 4, 4};
        int k = 3; // Adjusted k to a valid size
        MaxAveSubArray subArray = new MaxAveSubArray();
        double result = subArray.findMaxAverage(array, k);
        System.out.println("Max avg sub array is: " + result);
    }
}

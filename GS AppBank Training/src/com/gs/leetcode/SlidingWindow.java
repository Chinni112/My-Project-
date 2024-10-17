package com.gs.leetcode;
import java.util.*;

public class SlidingWindow {

    public int minSwaps(int[] nums) {
        int n = nums.length;
        // Create an array of pairs where each pair consists of a number and its index
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort the indices based on the values in nums
        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            // If already visited or already in the correct position
            if (visited[i] || indices[i] == i) {
                continue;
            }

            // Start a new cycle
            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                // Move to the index of the next element in the sorted order
                j = indices[j];
                cycleSize++;
            }

            // If there is a cycle of size cycleSize, it takes (cycleSize - 1) swaps to sort
            if (cycleSize > 0) {
                swaps += (cycleSize - 1);
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        SlidingWindow solution = new SlidingWindow();
        int[] nums = {4, 3, 2, 1};
        System.out.println("Minimum swaps required: " + solution.minSwaps(nums)); // Output: 2
    }
}

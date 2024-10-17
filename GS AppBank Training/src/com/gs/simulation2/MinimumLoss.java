package com.gs.simulation2;

import java.util.*;

public class MinimumLoss {

    public static int minimumLoss(int[] price) {
        int n = price.length;
        // Pair to store price and its corresponding index
        List<int[]> priceIndexPairs = new ArrayList<>();

        // Fill the list with prices and their indices
        for (int i = 0; i < n; i++) {
            priceIndexPairs.add(new int[]{price[i], i});
        }

        // Sort the list based on prices
        Collections.sort(priceIndexPairs, (a, b) -> Integer.compare(a[0], b[0]));

        int minLoss = Integer.MAX_VALUE;

        // Iterate through the sorted prices to find the minimum loss
        for (int i = 1; i < n; i++) {
            int currentPrice = priceIndexPairs.get(i)[0];
            int currentIndex = priceIndexPairs.get(i)[1];
            int previousPrice = priceIndexPairs.get(i - 1)[0];
            int previousIndex = priceIndexPairs.get(i - 1)[1];

            // We can only sell at a later year
            if (currentIndex < previousIndex) {
                int loss = previousPrice - currentPrice;
                minLoss = Math.min(minLoss, loss);
            }
        }

        return minLoss == Integer.MAX_VALUE ? 0 : minLoss; // Return 0 if no valid loss is found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of years
        int n = scanner.nextInt();
        int[] prices = new int[n];

        // Read the house prices
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        // Calculate and print the minimum loss
        int result = minimumLoss(prices);
        System.out.println(result);
    }
}

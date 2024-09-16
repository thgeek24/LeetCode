/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h2106;

/**
 * LeetCode 2106
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/16 11:28
 */
public class MaximumFruitsHarvestedAfterAtMostKSteps {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        int[] prefixSum = new int[n + 1]; // To store the cumulative sum of fruits
        int[] positions = new int[n];     // To store the positions of the fruits

        // Populate positions array and prefixSum array
        for (int i = 0; i < n; i++) {
            positions[i] = fruits[i][0];
            prefixSum[i + 1] = prefixSum[i] + fruits[i][1];
        }

        int maxFruits = 0;

        // Try going left first, then right
        for (int i = 0; i < n; i++) {
            if (positions[i] > startPos + k) break;
            int leftSteps = Math.max(0, startPos - positions[i]);
            int rightLimit = Math.min(startPos + (k - 2 * leftSteps), positions[n - 1]);
            int rightIdx = upperBound(positions, rightLimit);
            maxFruits = Math.max(maxFruits, totalFruits(prefixSum, i, rightIdx));
        }

        // Try going right first, then left
        for (int i = 0; i < n; i++) {
            if (positions[i] > startPos + k) break;
            int rightSteps = Math.max(0, positions[i] - startPos);
            int leftLimit = Math.max(positions[0], startPos - (k - 2 * rightSteps));
            int leftIdx = lowerBound(positions, leftLimit);
            maxFruits = Math.max(maxFruits, totalFruits(prefixSum, leftIdx, i));
        }

        return maxFruits;
    }

    // Helper to calculate total fruits in range [i, j] inclusive
    private int totalFruits(int[] prefixSum, int i, int j) {
        return prefixSum[j + 1] - prefixSum[i];
    }

    // Helper to find the smallest index where positions[index] <= limit
    private int upperBound(int[] positions, int limit) {
        int left = 0;
        int right = positions.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (positions[mid] > limit) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right - 1;
    }

    // Helper to find the largest index where positions[index] >= limit
    private int lowerBound(int[] positions, int limit) {
        int left = 0;
        int right = positions.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (positions[mid] < limit) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
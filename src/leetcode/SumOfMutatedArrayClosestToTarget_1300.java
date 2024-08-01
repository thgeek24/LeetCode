/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1300
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/01 13:57
 */
public class SumOfMutatedArrayClosestToTarget_1300 {
    public int findBestValue(int[] arr, int target) {
        int low = 0;
        int high = 0;
        for (int num : arr) {
            high = Math.max(high, num);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            int sum = calculateSum(arr, mid);
            if (sum > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        // Check if we get a closer sum by decrementing low by 1
        int sum1 = calculateSum(arr, low);
        int sum2 = calculateSum(arr, low - 1);
        if (Math.abs(sum1 - target) >= Math.abs(sum2 - target)) {
            return low - 1;
        }
        return low;
    }

    private int calculateSum(int[] arr, int value) {
        int sum = 0;
        for (int num : arr) {
            sum += Math.min(num, value);
        }
        return sum;
    }
}

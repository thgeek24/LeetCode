/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Random;

/**
 * LeetCode 528
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/15 08:38
 */
public class RandomPickWIthWeight_528 {
    public static class Solution {
        private final int[] prefixSums;
        private final int sum;
        private final Random random;

        public Solution(int[] w) {
            this.random = new Random();
            this.prefixSums = new int[w.length];
            prefixSums[0] = w[0];
            for (int i = 1; i < w.length; i++) {
                prefixSums[i] = prefixSums[i - 1] + w[i];
            }
            this.sum = prefixSums[w.length - 1];
        }

        public int pickIndex() {
            int target = random.nextInt(sum) + 1;

            int left = 0;
            int right = prefixSums.length - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (prefixSums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }
    }
}

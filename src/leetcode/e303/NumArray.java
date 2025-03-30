/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e303;

/**
 * LeetCode 303
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/25 22:32
 */
public class NumArray {
    private final int[] prefixSum;

    public NumArray(int[] nums) {
        this.prefixSum = new int[nums.length + 1];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }
}

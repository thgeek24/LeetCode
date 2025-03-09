/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w427;

/**
 * LeetCode 3381 - Weekly Contest 427
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/08 11:37
 */
public class MaximumSubarraySumWithLengthDivisibleByK {
    public long maxSubarraySum(int[] nums, int k) {
        long[] prefixSum = new long[nums.length + 1];
        prefixSum[0] = 0;
        for (int i = 1; i <= nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        long max = Long.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            long sum = 0;
            for (int j = i; j + k <= nums.length; j += k) {
                long n = prefixSum[j + k] - prefixSum[j];
                sum = Math.max(n, sum + n);
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}

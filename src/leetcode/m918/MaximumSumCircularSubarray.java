/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m918;

/**
 * LeetCode 918
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/22 07:29
 */
public class MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] nums) {
        int maxKadane = kadane(nums);  // Step 1: Non-circular max subarray sum

        // Step 2: Circular max subarray sum
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            nums[i] = -nums[i];  // Invert the array for min subarray calculation
        }

        int maxWrap = totalSum + kadane(nums);  // totalSum - (-min subarray)

        // Step 3: Handle all-negative array case
        return (maxWrap == 0) ? maxKadane : Math.max(maxKadane, maxWrap);
    }

    private int kadane(int[] nums) {
        int maxEndingHere = nums[0], maxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}

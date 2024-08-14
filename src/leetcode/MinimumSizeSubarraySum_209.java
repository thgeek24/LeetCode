/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 209
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/03 17:20
 */
public class MinimumSizeSubarraySum_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int slow = 0;
        int fast = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        while (fast < nums.length) {
            sum += nums[fast++];

            while (sum >= target) {
                minLen = Math.min(minLen, fast - slow);
                sum -= nums[slow++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}

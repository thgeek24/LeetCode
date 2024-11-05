/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1004;

/**
 * LeetCode 1004
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 08:08
 */
public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int slow = 0;
        int fast = 0;
        int flips = k;
        int max = 0;
        int len = 0;
        while (fast < nums.length) {
            while (fast < nums.length) {
                if (nums[fast] == 0 && flips == 0) {
                    break;
                }
                if (nums[fast] == 0) {
                    flips--;
                }
                len++;
                fast++;
            }
            max = Math.max(max, len);

            while (slow < nums.length && nums[slow] == 1) {
                slow++;
                len--;
            }
            if (slow == fast) {
                slow++;
                fast++;
                continue;
            }
            len--;
            slow++;
            flips++;
        }
        return max;
    }
}

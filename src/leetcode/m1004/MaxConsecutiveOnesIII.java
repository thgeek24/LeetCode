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

            // 找到从 slow 起的第一个 0
            while (slow < nums.length && nums[slow] == 1) {
                slow++;
                len--;
            }
            if (slow == fast) {
                // 到达 fast，说明 k = 0
                slow++;
                fast++;
                continue;
            }
            // 如果没到达 fast，则再进一位，以增加一个 flip
            len--;
            slow++;
            flips++;
        }
        return max;
    }
}

/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1493;

/**
 * LeetCode 1493
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 09:49
 */
public class LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int slow = 0;
        int fast = 0;
        int k = 1;

        int max = 0;
        int len = 0;
        while (fast < nums.length) {
            while (fast < nums.length) {
                if (nums[fast] == 0 && k == 0) {
                    break;
                }
                if (nums[fast] == 0) {
                    k--;
                }
                len++;
                fast++;
            }
            max = Math.max(max, len);

            while (slow < nums.length && nums[slow] == 1) {
                slow++;
                len--;
            }
            len--;
            k++;
            slow++;
        }
        return max - 1;
    }
}

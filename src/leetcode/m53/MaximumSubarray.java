/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m53;

/**
 * LeetCode 53
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/22 10:08
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int tmp = 0;
        int max = nums[0];
        int start;
        int end;

        for (start = 0; start < nums.length; start++) {
            end = start;
            while (end < nums.length) {
                tmp = tmp + nums[end++];
                if (max < tmp) {
                    max = tmp;
                }
            }
            tmp = 0;
        }
        return max;
    }
}

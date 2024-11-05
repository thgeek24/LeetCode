/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1493;

import leetcode.m1004.MaxConsecutiveOnesIII;

/**
 * LeetCode 1493
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 09:49
 */
public class LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        MaxConsecutiveOnesIII maxOnes = new MaxConsecutiveOnesIII();
        int max = maxOnes.longestOnes(nums, 1);
        return max - 1;
    }
}

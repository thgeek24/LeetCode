/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 376
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/22 13:04
 */
public class WiggleSubsequence_376 {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int up = 1, down = 1; // Initialize the lengths
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                up = down + 1; // If current element is greater, update up
            } else if (nums[i] < nums[i - 1]) {
                down = up + 1; // If current element is smaller, update down
            }
        }

        return Math.max(up, down); // The answer is the maximum of up and down
    }
}

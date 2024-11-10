/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h41;

/**
 * LeetCode 41
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/10 19:50
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Place each number in its correct index position
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        // Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
}

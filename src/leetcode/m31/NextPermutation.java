/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m31;

/**
 * LeetCode 31
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/10 17:12
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Step 1: Find the first decreasing element
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;
            // Step 2: Find element just larger than nums[i]
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Step 3: Swap nums[i] with nums[j]
            swap(nums, i, j);
        }

        // Step 4: Reverse the subarray from i + 1 to the end
        reverse(nums, i + 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}

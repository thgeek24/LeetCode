/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1060
 * Difficulty: Medium
 * Subscription required: true
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/09 08:54
 */
public class MissingElementInSortedArray_1060 {
    public int missingElement(int[] nums, int k) {
        int n = nums.length;
        // If the k-th missing number is beyond the last element of the array
        if (k > missing(nums, n - 1)) {
            return nums[n - 1] + k - missing(nums, n - 1);
        }

        int left = 0;
        int right = n - 1;
        // Binary search to find the smallest index where the missing count is >= k
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (missing(nums, mid) < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // The k-th missing number is just before the index where the count of missing numbers is just enough
        return nums[left - 1] + k - missing(nums, left - 1);
    }

    // Helper function to calculate the number of missing elements until index idx
    private int missing(int[] nums, int idx) {
        return nums[idx] - nums[0] - idx;
    }
}

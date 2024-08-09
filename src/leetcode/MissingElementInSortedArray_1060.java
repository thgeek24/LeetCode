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
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int diff = nums[mid] - nums[left];
            int indexDiff = mid - left;
            if (diff == indexDiff) {
                left = mid + 1;
                int _diff = nums[left] - nums[mid];
                if (k < _diff) {
                    return nums[mid] + k;
                } else {
                    k -= _diff - 1;
                }
            } else {
                // diff > indexDiff, cause diff < indexDiff will not happen
                right = mid;
            }
        }
        return nums[left] + k;
    }
}

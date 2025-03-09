/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 35
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/18 20:56
 */
public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}

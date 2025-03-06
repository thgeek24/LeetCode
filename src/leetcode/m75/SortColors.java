/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m75;

/**
 * LeetCode 75
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/05 10:59
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                nums[mid] = nums[low];
                nums[low] = 0;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
            }
        }
    }
}

/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m80;

/**
 * LeetCode 80
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/17 11:23
 */
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int count = 1;
        int temp = nums[0];
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] == temp && count < 2) {
                nums[++slow] = temp;
                count++;
                continue;
            }
            if (nums[fast] != temp) {
                count = 1;
                temp = nums[fast];
                nums[++slow] = temp;
            }
        }
        return slow + 1;
    }
}

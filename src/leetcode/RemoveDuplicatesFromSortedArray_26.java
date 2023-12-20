/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Arrays;

/**
 * LeetCode 26
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/20 11:02
 */
public class RemoveDuplicatesFromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int slow = 1;
        int fast = 1;
        while (fast < nums.length) {
            if (nums[fast - 1] < nums[fast]) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicatesFromSortedArray_26 test = new RemoveDuplicatesFromSortedArray_26();
        int res = test.removeDuplicates(nums);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));
    }
}

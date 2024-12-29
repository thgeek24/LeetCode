/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e26;

/**
 * LeetCode 26
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/17 10:52
 */
public interface RemoveDuplicatesFromSortedArray {
    int removeDuplicates(int[] nums);

    class Solution1 implements RemoveDuplicatesFromSortedArray {
        @Override
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            } else {
                int tmp = nums[0];
                int len = 1;
                int index = 1;
                for (int i = 1; i < nums.length; i++) {
                    if (nums[i] != tmp) {
                        tmp = nums[i];
                        nums[index] = tmp;
                        index++;
                        len++;
                    }
                }
                return len;
            }
        }
    }

    class Solution2 implements RemoveDuplicatesFromSortedArray {
        @Override
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
    }
}

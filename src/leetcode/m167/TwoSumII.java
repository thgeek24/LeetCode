/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m167;

/**
 * LeetCode 167
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/02 10:19
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }
}

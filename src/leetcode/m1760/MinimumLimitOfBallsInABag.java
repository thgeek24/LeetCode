/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1760;

/**
 * LeetCode 1760
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/07 08:40
 */
public class MinimumLimitOfBallsInABag {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = 0;
        for (int num : nums) {
            right = Math.max(right, num);
        }

        while (left < right) {
            int mid = (left + right) / 2;
            if (canDivide(nums, maxOperations, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canDivide(int[] nums, int maxOperations, int maxBalls) {
        int operations = 0;
        for (int num : nums) {
            operations += (num - 1) / maxBalls;  // Equivalent to Math.ceil(num / maxBalls) - 1
            if (operations > maxOperations) {
                return false;
            }
        }
        return true;
    }
}

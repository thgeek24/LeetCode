/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m45;

/**
 * LeetCode 45
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/19 09:53
 */
public class JumpGameII {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            // Update the farthest point that can be reached
            farthest = Math.max(farthest, i + nums[i]);

            // If we've reached the end of the current jump range, we need to jump
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                // If the farthest point can reach the end, break early
                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}

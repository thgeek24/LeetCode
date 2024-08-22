/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 376
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/22 13:04
 */
public class WiggleSubsequence_376 {
    public int wiggleMaxLength(int[] nums) {
        int[][] numDp = new int[nums.length][2];
        int[][] lenDp = new int[nums.length][2];
        numDp[0][0] = nums[0];
        numDp[0][1] = nums[0];
        lenDp[0][0] = 1;
        lenDp[0][1] = 1;
        for (int i = 1; i < nums.length; i++) {
            // Determine the last increasing number
            boolean flag1 = false;
            if (nums[i] > numDp[i - 1][1]) {
                int newLen = lenDp[i - 1][1] + 1;
                if (newLen > lenDp[i - 1][0]) {
                    numDp[i][0] = nums[i];
                    lenDp[i][0] = newLen;
                    flag1 = true;
                }
            }
            if (!flag1) {
                numDp[i][0] = Math.max(nums[i], numDp[i - 1][0]);
                lenDp[i][0] = lenDp[i - 1][0];
            }

            // Determine the last decreasing number
            boolean flag2 = false;
            if (nums[i] < numDp[i - 1][0]) {
                int newLen = lenDp[i - 1][0] + 1;
                if (newLen > lenDp[i - 1][1]) {
                    numDp[i][1] = nums[i];
                    lenDp[i][1] = newLen;
                    flag2 = true;
                }
            }
            if (!flag2) {
                numDp[i][1] = Math.min(nums[i], numDp[i - 1][1]);
                lenDp[i][1] = lenDp[i - 1][1];
            }
        }
        return Math.max(lenDp[nums.length - 1][0], lenDp[nums.length - 1][1]);
    }
}

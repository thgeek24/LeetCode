/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 673
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/11 17:28
 */
public class NumberOfLongestIncreasingSubsequence_673 {
    public int findNumberOfLIS(int[] nums) {
        // dp[i][0]: the length of subsequences that end at i
        // dp[i][1]: the count of subsequences that end at i
        int[] lengths = new int[nums.length];
        int[] counts = new int[nums.length];
        lengths[0] = 1;
        counts[0] = 1;

        int i = 1;
        int max = lengths[0];
        while (i < nums.length) {
            int len = 0;
            int count = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < nums[i]) {
                    if (len < lengths[j]) {
                        len = lengths[j];
                        count = counts[j];
                    } else if (len == lengths[j]) {
                        count += counts[j];
                    }
                }
            }
            lengths[i] = len + 1;
            counts[i] = Math.max(count, 1);
            max = Math.max(lengths[i], max);
            i++;
        }

        int res = 0;
        for (int j = 0; j < lengths.length; j++) {
            if (lengths[j] == max) {
                res += counts[j];
            }
        }
        return res;
    }
}

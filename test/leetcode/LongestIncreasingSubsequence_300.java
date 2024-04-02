/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 300
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/02 16:06
 */
public interface LongestIncreasingSubsequence_300 {
    int lengthOfLIS(int[] nums);

    class LongestIncreasingSubsequenceSol1 implements LongestIncreasingSubsequence_300 {
        @Override
        public int lengthOfLIS(int[] nums) {
            int[] dp = new int[nums.length];
            dp[0] = 1;
            int res = 1;
            for (int i = 1; i < nums.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) {
                        dp[i] = Math.max(dp[i], dp[j]);
                    }
                }
                dp[i]++;
                res = Math.max(res, dp[i]);
            }
            return res;
        }
    }

    class LongestIncreasingSubsequenceSol2 implements LongestIncreasingSubsequence_300 {
        @Override
        public int lengthOfLIS(int[] nums) {
            int[] dp = new int[nums.length];
            int size = 0;

            for (int num : nums) {
                int i = 0;
                int j = size;
                while (i != j) {
                    int mid = (i + j) / 2;
                    if (dp[mid] < num) {
                        i = mid + 1;
                    } else {
                        j = mid;
                    }
                }
                dp[i] = num;
                if (i == size) {
                    size++;
                }
            }

            return size;
        }
    }
}

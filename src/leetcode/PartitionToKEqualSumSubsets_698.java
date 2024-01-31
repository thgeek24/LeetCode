/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 698
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/31 16:36
 */
public class PartitionToKEqualSumSubsets_698 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum % k != 0) return false;
        int subsetSum = totalSum / k;
        boolean[] dp = new boolean[1 << nums.length];
        dp[0] = true;
        int[] total = new int[1 << nums.length];

        for (int state = 0; state < dp.length; state++) {
            if (!dp[state]) continue;
            for (int i = 0; i < nums.length; i++) {
                int futureState = state | (1 << i);
                if (state != futureState && !dp[futureState]) {
                    if (nums[i] <= subsetSum - (total[state] % subsetSum)) {
                        dp[futureState] = true;
                        total[futureState] = total[state] + nums[i];
                    } else {
                        break;
                    }
                }
            }
        }
        return dp[dp.length - 1];
    }
}

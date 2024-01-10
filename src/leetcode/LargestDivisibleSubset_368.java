/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * LeetCode 368
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/08 14:16
 */
public class LargestDivisibleSubset_368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);

        // dp[i][0] = dp[dp[i][1]][0] + 1
        // 1) i corresponds to the index in nums,
        // 2) dp[i][0] is the max length when the subset ends at i
        // with nums[i] as its last element
        // 3) dp[i][1] is the previous index of element in the subset
        int len = nums.length;
        int[][] dp = new int[len][2];
        dp[0][0] = 1;
        dp[0][1] = -1;
        for (int i = 1; i < len; i++) {
            boolean found = false;
            int j = i - 1;
            int maxLen = 0;
            while (j >= 0) {
                if (nums[i] % nums[j] == 0) {
                    found = true;
                    if (maxLen < dp[j][0] + 1) {
                        dp[i][0] = dp[j][0] + 1;
                        dp[i][1] = j;
                        maxLen = dp[i][0];
                    }
                }
                if (maxLen > j + 1) {
                    break;
                }
                j--;
            }
            if (!found) {
                dp[i][0] = 1;
                dp[i][1] = -1;
            }
        }

        int subsetLen = 0;
        int lastIndex = 0;
        for (int i = 0; i < len; i++) {
            if (dp[i][0] > subsetLen) {
                subsetLen = dp[i][0];
                lastIndex = i;
            }
        }

        List<Integer> res = new ArrayList<>();
        while (lastIndex >= 0) {
            res.add(nums[lastIndex]);
            lastIndex = dp[lastIndex][1];
        }
        return res.stream().sorted().collect(Collectors.toList());
    }
}
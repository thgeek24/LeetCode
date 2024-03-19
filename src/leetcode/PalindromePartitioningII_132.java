/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 132
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/07 15:41
 */
public class PalindromePartitioningII_132 {
    public int minCut(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
            if (i < len - 1 && s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
            }
        }
        for (int j = 2; j < len; j++) {
            int i = 0;
            int temp = j;
            while (temp < len) {
                if (dp[i + 1][temp - 1] && s.charAt(i) == s.charAt(temp)) {
                    dp[i][temp] = true;
                }
                i++;
                temp++;
            }
        }

        int[] minCuts = new int[len];
        for (int i = 1; i < len; i++) {
            if (dp[0][i]) {
                minCuts[i] = 0;
                continue;
            }
            minCuts[i] = minCuts[i - 1] + 1;
            for (int j = 1; j <= i; j++) {
                if (dp[j][i]) {
                    minCuts[i] = Math.min(minCuts[j - 1] + 1, minCuts[i]);
                }
            }
        }
        return minCuts[len - 1];
    }
}


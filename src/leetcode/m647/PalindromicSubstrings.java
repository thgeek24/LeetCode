/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m647;

/**
 * LeetCode 647
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/09 12:02
 */
public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];

        int cnt = 0;
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
            cnt++;
        }
        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                cnt++;
            }
        }
        for (int j = 2; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

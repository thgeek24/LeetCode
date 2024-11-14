/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w423;

import static java.lang.Integer.bitCount;

/**
 * LeetCode 3352
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/14 10:06
 */
public class CountKReducibleNumbersLessThanN {
    public int countKReducibleNumbers(String s, int k) {
        final int mod = 1_000_000_007;
        char[] charArr = s.toCharArray();
        int n = charArr.length;
        // dp[i] means the number of operations needed to reduce i to 1
        int[] dp = new int[n + 1];
        dp[0] = k + 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[bitCount(i)] + 1;
        }

        // c[i][j] means the number of ways to choose j items from i items regardless the order
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0) {
                    c[i][j] = 1;
                    continue;
                }
                c[i][j] = (c[i - 1][j] + c[i - 1][j - 1]) % mod;
            }
        }

        int setBits = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (charArr[i] == '0') {
                continue;
            }
            // choose j set bits from i bits
            int r = n - i - 1;
            for (int j = 0; j <= r; j++) {
                if (dp[setBits + j] >= k) {
                    continue;
                }
                res = (res + c[r][j]) % mod;
            }
            setBits++;
        }

        return res;
    }
}

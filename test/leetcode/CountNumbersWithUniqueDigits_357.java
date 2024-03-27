/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Arrays;

/**
 * LeetCode 357
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/27 17:10
 */
public class CountNumbersWithUniqueDigits_357 {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 9;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] * (11 - i);
        }
        return Arrays.stream(dp).sum();
    }
}

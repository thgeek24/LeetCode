/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1137
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/10 15:46
 */
public class NthTribonacciNumber_1137 {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int dp1 = 0;
        int dp2 = 1;
        int dp3 = 1;
        int res = 0;
        for (int i = 3; i <= n; i++) {
            res = dp1 + dp2 + dp3;
            dp1 = dp2;
            dp2 = dp3;
            dp3 = res;
        }
        return res;
    }
}

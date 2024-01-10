/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 509
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/08 16:39
 */
public class FibonacciNumber_509 {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int dp1 = 0;
        int dp2 = 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = dp1 + dp2;
            dp1 = dp2;
            dp2 = res;
        }
        return res;
    }
}

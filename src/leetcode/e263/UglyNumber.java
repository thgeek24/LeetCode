/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e263;

/**
 * LeetCode 263
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/06 11:14
 */
public class UglyNumber {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] primes = {2, 3, 5};
        for (int prime : primes) {
            while (n % prime == 0) {
                n /= prime;
            }
        }
        return n == 1;
    }
}

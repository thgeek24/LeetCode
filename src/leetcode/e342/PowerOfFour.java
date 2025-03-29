/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e342;

/**
 * LeetCode 342
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/29 08:01
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if ((n & 3) == 0) {
            return isPowerOfFour(n >> 2);
        }
        return false;
    }
}

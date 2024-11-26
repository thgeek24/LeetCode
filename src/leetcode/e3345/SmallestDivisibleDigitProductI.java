/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e3345;

/**
 * LeetCode 3345
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/21 10:52
 */
public class SmallestDivisibleDigitProductI {
    public int smallestNumber(int n, int t) {
        while (true) {
            boolean divisible = isDivisible(n, t);
            if (divisible) {
                return n;
            }
            n++;
        }
    }

    private boolean isDivisible(int num, int t) {
        int product = 1;
        while (num > 0) {
            product *= num % 10;
            num /= 10;
        }
        return product % t == 0;
    }
}

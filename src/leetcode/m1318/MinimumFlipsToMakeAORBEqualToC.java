/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1318;

/**
 * LeetCode 1318
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 22:33
 */
public class MinimumFlipsToMakeAORBEqualToC {
    public int minFlips(int a, int b, int c) {
        int count = 0;
        while (a != 0 || b != 0 || c != 0) {
            int x = a & 1;
            int y = b & 1;
            int z = c & 1;
            if ((x | y) != z) {
                if (z == 0) {
                    if (x == 1) {
                        count++;
                    }
                    if (y == 1) {
                        count++;
                    }
                } else {
                    count++;
                }
            }
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return count;
    }
}

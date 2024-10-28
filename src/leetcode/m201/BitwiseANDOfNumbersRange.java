/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m201;

/**
 * LeetCode 201
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/28 09:39
 */
public class BitwiseANDOfNumbersRange {
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }

        return left << shift;
    }
}

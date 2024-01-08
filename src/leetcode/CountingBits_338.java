/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 338
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/08 14:19
 */
public class CountingBits_338 {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            int count = 0;
            int mask = 1 << 19;
            for (int j = 0; j < 20; j++) {
                if ((i & mask) > 0) {
                    count++;
                }
                mask = mask >> 1;
            }
            res[i] = count;
        }

        return res;
    }
}

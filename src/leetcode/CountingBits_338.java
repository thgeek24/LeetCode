/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 338
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/08 17:14
 */
public interface CountingBits_338 {
    int[] countBits(int n);

    class Solution1 implements CountingBits_338 {
        @Override
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

    class Solution2 implements CountingBits_338 {
        @Override
        public int[] countBits(int n) {
            // dp[i] = dp[i-offset] + 1
            int[] res = new int[n + 1];
            List<Integer> powersOfTwo = new ArrayList<>();
            powersOfTwo.add(0);

            int i = 1;
            while (i <= n) {
                if (isPowerOfTwo(i)) {
                    powersOfTwo.add(i);
                }
                int lastPowerOfTwo = powersOfTwo.get(powersOfTwo.size() - 1);
                res[i] = res[i - lastPowerOfTwo] + 1;
                i++;
            }
            return res;
        }

        private boolean isPowerOfTwo(int num) {
            return (num & (num - 1)) == 0;
        }
    }
}

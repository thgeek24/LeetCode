/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * LeetCode 528
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/15 08:38
 */
public class RandomPickWIthWeight_528 {
    public static class Solution {
        private final int[] w;
        private int sum;
        private Map<Integer, Integer> map;

        public Solution(int[] w) {
            this.w = w;
            this.map = new HashMap<>();
            for (int num : w) {
                sum += num;
                map.put(num, map.getOrDefault(num, 0) + num);
            }
        }

        public int pickIndex() {
            Random random = new Random();
            int res = 0;
            for (int i = 0; i < w.length; i++) {
                int remaining = sum - map.get(w[i]);
                if (remaining == 0) {
                    return i;
                }
                if (random.nextInt(remaining) == 0) {
                    res = i;
                }
            }
            return res;
        }
    }
}

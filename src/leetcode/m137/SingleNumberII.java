/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m137;

/**
 * LeetCode 137
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/27 22:52
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;

        for (int num : nums) {
            // Update 'ones' and 'twos' for the current number
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }

        return ones;
    }
}

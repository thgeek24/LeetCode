/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m287;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 287
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/10 19:41
 */
public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            } else {
                set.add(num);
            }
        }
        return -1;
    }
}

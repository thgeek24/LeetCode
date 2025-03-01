/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m128;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * LeetCode 128
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/24 08:57
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int res = 0;
        for (int num : nums) {
            if (numSet.contains(num)) {
                int count = 1;

                int temp1 = num;
                while (numSet.contains(--temp1)) {
                    count++;
                    numSet.remove(temp1);
                }

                int temp2 = num;
                while (numSet.contains(++temp2)) {
                    count++;
                    numSet.remove(temp2);
                }

                res = Math.max(res, count);
            }
        }
        return res;
    }
}

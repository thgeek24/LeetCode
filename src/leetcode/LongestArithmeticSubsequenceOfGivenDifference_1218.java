/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 1218
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/25 10:52
 */
public class LongestArithmeticSubsequenceOfGivenDifference_1218 {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> dp = new HashMap<>();
        int maxLen = 1;
        for (int num : arr) {
            int len = dp.getOrDefault(num - difference, 0) + 1;
            dp.put(num, len);
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}

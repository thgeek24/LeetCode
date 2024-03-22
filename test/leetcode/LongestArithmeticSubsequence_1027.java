/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 1027
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/22 12:12
 */
public class LongestArithmeticSubsequence_1027 {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        List<Map<Integer, Integer>> dp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dp.add(new HashMap<>());
        }
        int maxLen = 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int d = nums[i] - nums[j];
                dp.get(i).put(d, dp.get(j).getOrDefault(d, 1) + 1);
                maxLen = Math.max(maxLen, dp.get(i).get(d));
            }
        }
        return maxLen;
    }
}

/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * LeetCode 646
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/11 11:55
 */
public class MaximumLengthOfPairChain_646 {
    public int findLongestChain(int[][] pairs) {
        Map<Integer, int[]> map = Arrays.stream(pairs).collect(Collectors.toMap(item -> item[0], Function.identity(),
                (o1, o2) -> o2[1] < o1[1] ? o2 : o1, TreeMap::new));
        int[][] trimmedPairs = map.values().toArray(new int[][]{});

        int len = trimmedPairs.length;
        int[] dp = new int[len];
        int res = 1;
        dp[0] = 1;
        for (int i = 1; i < len; i++) {
            boolean found = false;
            int maxLen = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (trimmedPairs[j][1] < trimmedPairs[i][0] && maxLen < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    maxLen = dp[i];
                    res = Math.max(dp[i], res);
                    found = true;
                }
                if (maxLen > j + 1) {
                    break;
                }
            }
            if (!found) {
                dp[i] = 1;
            }
        }

        return res;
    }
}

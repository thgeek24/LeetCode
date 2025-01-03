/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e1422;

/**
 * LeetCode 1422
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/01 17:50
 */
public class MaximumScoreAfterSplittingAString {
    public int maxScore(String s) {
        int[] prefixSums = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            prefixSums[i + 1] = prefixSums[i] + (s.charAt(i) - '0');
        }

        int max = 0;
        int zeroCnt = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zeroCnt++;
            }
            int oneCnt = prefixSums[s.length()] - prefixSums[i + 1];
            max = Math.max(max, oneCnt + zeroCnt);
        }

        return max;
    }
}

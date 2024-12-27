/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1014
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/27 09:31
 */
public class BestSightseeingPair {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = Integer.MIN_VALUE;
        int left = values[0] - 1;
        for (int j = 1; j < values.length; j++) {
            maxScore = Math.max(maxScore, values[j] + left);
            left = Math.max(left - 1, values[j] - 1);
        }
        return maxScore;
    }
}
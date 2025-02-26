/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 56
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/26 10:03
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        List<int[]> merged = new ArrayList<>();
        int[] curr = Arrays.copyOfRange(intervals[0], 0, 2);
        for (int i = 1; i < intervals.length; i++) {
            if (curr[1] < intervals[i][0]) {
                merged.add(curr);
                curr = Arrays.copyOfRange(intervals[i], 0, 2);
            } else {
                curr[1] = Math.max(intervals[i][1], curr[1]);
            }
        }
        merged.add(curr);
        return merged.toArray(new int[merged.size()][]);
    }
}

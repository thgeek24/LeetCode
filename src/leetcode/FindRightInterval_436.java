/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 436
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/16 08:11
 */
public class FindRightInterval_436 {
    public int[] findRightInterval(int[][] intervals) {
        Map<Integer, Integer> intervalIndexes = new HashMap<>();
        for (int i = 0; i < intervals.length; i++) {
            intervalIndexes.put(intervals[i][0], i);
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        Map<Integer, Integer> indexPairs = new HashMap<>();
        for (int i = 0; i < intervals.length; i++) {
            int rightInterval = findRightInterval(i, intervals);
            int leftIndex = intervalIndexes.get(intervals[i][0]);
            int rightIndex = rightInterval == Integer.MIN_VALUE ? -1 : intervalIndexes.get(rightInterval);
            indexPairs.put(leftIndex, rightIndex);
        }

        int[] res = new int[intervals.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = indexPairs.get(i);
        }
        return res;
    }

    private int findRightInterval(int index, int[][] intervals) {
        int end = intervals[index][1];
        int left = index;
        int right = intervals.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (intervals[mid][0] == end) {
                return intervals[mid][0];
            } else if (intervals[mid][0] < end) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left == intervals.length ? Integer.MIN_VALUE : intervals[left][0];
    }
}

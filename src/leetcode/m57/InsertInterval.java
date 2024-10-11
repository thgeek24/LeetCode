/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m57;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 57
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/28 15:10
 */
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            return new int[][]{newInterval};
        }
        int startIndex = findIndex(intervals, newInterval[0]);
        int endIndex = findIndex(intervals, newInterval[1]);
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < startIndex; i++) {
            res.add(intervals[i]);
        }

        if (startIndex == -1 && endIndex == -1) {
            res.add(newInterval);
        } else if (startIndex == -1) {
            int start = newInterval[0];
            int end = Math.max(intervals[endIndex][1], newInterval[1]);
            res.add(new int[]{start, end});
        } else if (newInterval[0] > intervals[startIndex][1]) {
            res.add(intervals[startIndex]);
            int start = newInterval[0];
            int end = Math.max(intervals[endIndex][1], newInterval[1]);
            res.add(new int[]{start, end});
        } else {
            int start = Math.min(intervals[startIndex][0], intervals[endIndex][0]);
            int end = Math.max(intervals[endIndex][1], newInterval[1]);
            res.add(new int[]{start, end});
        }

        for (int i = endIndex + 1; i < intervals.length; i++) {
            res.add(intervals[i]);
        }

        return res.toArray(new int[0][]);
    }

    /**
     * 在间隔中寻找最大的脚标，让 target 大于或等于脚标处元素的 start
     *
     * @param intervals 间隔
     * @param target    值
     * @return 脚标
     */
    private int findIndex(int[][] intervals, int target) {
        int low = 0;
        int high = intervals.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (intervals[mid][0] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low - 1;
    }
}

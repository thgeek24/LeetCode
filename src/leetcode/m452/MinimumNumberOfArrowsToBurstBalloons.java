/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m452;

import java.util.Arrays;

/**
 * LeetCode 452
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/01 10:08
 */
public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int res = 1;
        int[] overlap = points[0];
        for (int i = 1; i < points.length; i++) {
            overlap = getOverlap(overlap, points[i]);
            if (overlap == null) {
                overlap = points[i];
                res++;
            }
        }
        return res;
    }

    private int[] getOverlap(int[] point1, int[] point2) {
        if (point1 == null) {
            return null;
        }
        int left = Math.max(point1[0], point2[0]);
        int right = Math.min(point1[1], point2[1]);
        if (left > right) {
            return null;
        }
        return new int[]{left, right};
    }
}

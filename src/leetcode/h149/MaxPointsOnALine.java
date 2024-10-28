/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h149;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 149
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/28 10:04
 */
public class MaxPointsOnALine {
    public int maxPoints(int[][] points) {
        if (points.length < 2) {
            return points.length;
        }

        int maxPoints = 0;
        for (int i = 0; i < points.length; i++) {
            Map<String, Integer> slopeCount = new HashMap<>();
            int duplicates = 0;
            int localMax = 0;

            for (int j = i + 1; j < points.length; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                if (dx == 0 && dy == 0) {
                    duplicates++;
                    continue;
                }

                int gcd = gcd(dx, dy);
                dx /= gcd;
                dy /= gcd;

                String slope = dx + "/" + dy;
                slopeCount.put(slope, slopeCount.getOrDefault(slope, 0) + 1);
                localMax = Math.max(localMax, slopeCount.get(slope));
            }

            maxPoints = Math.max(maxPoints, localMax + duplicates + 1);
        }

        return maxPoints;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

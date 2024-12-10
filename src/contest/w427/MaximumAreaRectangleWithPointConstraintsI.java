/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w427;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 3380 - Weekly Contest 427
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/08 10:51
 */
public class MaximumAreaRectangleWithPointConstraintsI {
    public int maxRectangleArea(int[][] points) {
        Arrays.sort(points, ((o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        }));

        Map<Integer, List<int[]>> rowMap = new HashMap<>();
        Map<Integer, List<int[]>> colMap = new HashMap<>();
        for (int[] point : points) {
            int row = point[0];
            int col = point[1];

            List<int[]> rowValues = rowMap.getOrDefault(row, new ArrayList<>());
            rowValues.add(point);
            rowMap.put(row, rowValues);

            List<int[]> colValues = colMap.getOrDefault(col, new ArrayList<>());
            colValues.add(point);
            colMap.put(col, colValues);
        }

        int area = -1;
        for (int i = 0; i <= points.length - 4; i++) {
            if (points[i + 1][0] != points[i][0]) {
                continue;
            }
            int[] btmLeft = points[i];
            int[] btmRight = points[i + 1];
            int[] topLeft = findNext(btmLeft, colMap.get(btmLeft[1]));
            int[] topRight = findNext(btmRight, colMap.get(btmRight[1]));
            if (topLeft == null || topRight == null) {
                continue;
            }

            int rowStart = btmLeft[0];
            int rowEnd = topLeft[0];
            int colStart = btmLeft[1];
            int colEnd = btmRight[1];
            if (!hasPointsInside(rowStart, rowEnd, colStart, colEnd, rowMap, colMap)) {
                area = Math.max(area, (rowEnd - rowStart) * (colEnd - colStart));
            }
        }

        return area;
    }

    private int[] findNext(int[] curr, List<int[]> source) {
        for (int[] arr : source) {
            if (arr[0] > curr[0]) {
                return arr;
            }
        }
        return null;
    }

    private boolean hasPointsInside(int rowStart, int rowEnd, int colStart, int colEnd,
                                    Map<Integer, List<int[]>> rowMap, Map<Integer, List<int[]>> colMap) {
        for (int i = rowStart + 1; i < rowEnd; i++) {
            if (rowMap.containsKey(i)) {
                return true;
            }
        }
        for (int i = colStart + 1; i < colEnd; i++) {
            if (colMap.containsKey(i)) {
                return true;
            }
        }
        return false;
    }
}

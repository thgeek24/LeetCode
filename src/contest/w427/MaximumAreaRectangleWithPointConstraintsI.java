/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w427;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * LeetCode 3380 - Weekly Contest 427
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/08 10:51
 */
public interface MaximumAreaRectangleWithPointConstraintsI {
    int maxRectangleArea(int[][] points);

    class Solution1 implements MaximumAreaRectangleWithPointConstraintsI {
        @Override
        public int maxRectangleArea(int[][] points) {
            // Step 1: Store points in a HashSet for fast lookup
            Set<String> pointSet = new HashSet<>();
            int n = points.length;

            for (int[] point : points) {
                pointSet.add(point[0] + "," + point[1]);
            }

            long maxArea = -1;

            // Step 2: Check all pairs of points to form rectangles
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int x1 = points[i][0], y1 = points[i][1];
                    int x2 = points[j][0], y2 = points[j][1];

                    // Step 3: Ensure the points are diagonally opposite
                    if (x1 != x2 && y1 != y2) {
                        // Step 4: Check if the other two corners exist
                        if (pointSet.contains(x1 + "," + y2) && pointSet.contains(x2 + "," + y1)) {
                            // Calculate the area of the rectangle
                            long area = (long) Math.abs(x2 - x1) * Math.abs(y2 - y1);

                            // Step 5: Ensure that no other points lie inside the rectangle
                            boolean validRectangle = true;
                            for (int k = 0; k < n; k++) {
                                int x = points[k][0], y = points[k][1];

                                // Skip the four corners of the rectangle
                                if ((x == x1 || x == x2) && (y == y1 || y == y2)) {
                                    continue;
                                }

                                // Check if the point lies inside the rectangle
                                if (x > Math.min(x1, x2) && x < Math.max(x1, x2) && y > Math.min(y1, y2) && y < Math.max(y1, y2)) {
                                    validRectangle = false;
                                    break;
                                }

                                // Ensure no points lie on the edges of the rectangle
                                if ((x == x1 || x == x2) && (y >= Math.min(y1, y2) && y <= Math.max(y1, y2))) {
                                    validRectangle = false;
                                    break;
                                }
                                if ((y == y1 || y == y2) && (x >= Math.min(x1, x2) && x <= Math.max(x1, x2))) {
                                    validRectangle = false;
                                    break;
                                }
                            }
                            if (validRectangle) {
                                maxArea = Math.max(maxArea, area);
                            }
                        }
                    }
                }
            }
            return (int) maxArea;
        }
    }

    class Solution2 implements MaximumAreaRectangleWithPointConstraintsI {
        @Override
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
                if (topLeft == null || topRight == null || topLeft[0] != topRight[0]) {
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
                    List<int[]> rowElements = rowMap.get(i);
                    for (int[] element : rowElements) {
                        if (element[1] >= colStart && element[1] <= colEnd) {
                            return true;
                        }
                    }
                }
            }
            for (int j = colStart + 1; j < colEnd; j++) {
                if (colMap.containsKey(j)) {
                    List<int[]> colElements = colMap.get(j);
                    for (int[] element : colElements) {
                        if (element[0] >= rowStart && element[0] <= rowEnd) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}

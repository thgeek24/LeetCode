/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m120;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 120
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/21 15:25
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rowCnt = triangle.size();
        List<List<Integer>> dp = new ArrayList<>();
        dp.add(triangle.get(0));

        for (int i = 1; i < rowCnt; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = dp.get(i - 1);
            List<Integer> triangleRow = triangle.get(i);

            for (int j = 0; j < prevRow.size() + 1; j++) {
                if (j == 0) {
                    row.add(prevRow.get(j) + triangleRow.get(j));
                    continue;
                }
                if (j == prevRow.size()) {
                    row.add(prevRow.get(j - 1) + triangleRow.get(j));
                    continue;
                }
                int sum = Math.min(prevRow.get(j - 1), prevRow.get(j)) + triangleRow.get(j);
                row.add(sum);
            }
            dp.add(row);
        }

        int minSum = Integer.MAX_VALUE;
        for (Integer sum : dp.get(rowCnt - 1)) {
            minSum = Math.min(sum, minSum);
        }
        return minSum;
    }
}

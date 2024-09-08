/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * LeetCode 1386
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/08 11:56
 */
public class CinemaSeatAllocation_1386 {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Set<Integer>> reservedMap = new HashMap<>();

        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];
            reservedMap.putIfAbsent(row, new HashSet<>());
            reservedMap.get(row).add(col);
        }

        int maxFamilies = 0;

        for (int row : reservedMap.keySet()) {
            Set<Integer> reservedCols = reservedMap.get(row);

            boolean leftBlock = !reservedCols.contains(2) && !reservedCols.contains(3) &&
                    !reservedCols.contains(4) && !reservedCols.contains(5);
            boolean middleBlock = !reservedCols.contains(4) && !reservedCols.contains(5) &&
                    !reservedCols.contains(6) && !reservedCols.contains(7);
            boolean rightBlock = !reservedCols.contains(6) && !reservedCols.contains(7) &&
                    !reservedCols.contains(8) && !reservedCols.contains(9);

            if (leftBlock && rightBlock) {
                maxFamilies += 2;
            } else if (leftBlock || middleBlock || rightBlock) {
                maxFamilies += 1;
            }
        }

        // Rows without any reserved seats can seat 2 families
        maxFamilies += 2 * (n - reservedMap.size());

        return maxFamilies;
    }
}

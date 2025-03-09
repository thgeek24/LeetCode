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
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] reserved : reservedSeats) {
            int row = reserved[0];
            int col = reserved[1];
            map.putIfAbsent(row, new HashSet<>());
            map.get(row).add(col);
        }

        int maxFamilies = 0;
        for (Set<Integer> reservedCols : map.values()) {
            boolean leftBlock = !reservedCols.contains(2) &&
                    !reservedCols.contains(3) &&
                    !reservedCols.contains(4) &&
                    !reservedCols.contains(5);
            boolean middleBlock = !reservedCols.contains(4) &&
                    !reservedCols.contains(5) &&
                    !reservedCols.contains(6) &&
                    !reservedCols.contains(7);
            boolean rightBlock = !reservedCols.contains(6) &&
                    !reservedCols.contains(7) &&
                    !reservedCols.contains(8) &&
                    !reservedCols.contains(9);
            if (leftBlock && rightBlock) {
                maxFamilies += 2;
            } else if (leftBlock || middleBlock || rightBlock) {
                maxFamilies++;
            }
        }

        maxFamilies += 2 * (n - map.size());
        return maxFamilies;
    }
}

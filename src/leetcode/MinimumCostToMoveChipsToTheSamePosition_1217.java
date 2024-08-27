/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1217
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/27 11:13
 */
public class MinimumCostToMoveChipsToTheSamePosition_1217 {
    public int minCostToMoveChips(int[] position) {
        int odds = 0;
        int evens = 0;
        for (int i : position) {
            if (i % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }
        return Math.min(odds, evens);
    }
}

/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Arrays;

/**
 * LeetCode 174
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/19 17:11
 */
public class DungeonGame_174 {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[m - 1][n] = 1;
        dp[m][n - 1] = 1;

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int needHp = Math.min(dp[i + 1][j], dp[i][j + 1]);
                dp[i][j] = Math.max(1, needHp - dungeon[i][j]);
            }
        }
        return dp[0][0];
    }
}

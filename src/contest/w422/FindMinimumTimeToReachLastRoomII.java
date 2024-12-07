/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w422;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode 3342
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/03 10:35
 */
public class FindMinimumTimeToReachLastRoomII {
    private final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int minTimeToReach(int[][] moveTime) {
        int m = moveTime.length;
        int n = moveTime[0].length;
        int[][] dp = new int[m][n];
        for (int[] item : dp) {
            Arrays.fill(item, Integer.MAX_VALUE);
        }
        dp[0][0] = 0;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int i = curr[0];
            int j = curr[1];
            int stepTime = curr[2];
            for (int[] dir : directions) {
                int x = i + dir[0];
                int y = j + dir[1];
                if (reachable(x, y, m, n)) {
                    // 检查四个方向能不能更新
                    // 如果能更新，就更新，且将被更新的坐标加入队列
                    int time = Math.max(dp[i][j] + stepTime, moveTime[x][y] + stepTime);
                    if (time < dp[x][y]) {
                        dp[x][y] = time;
                        int _stepTime = stepTime == 1 ? 2 : 1;
                        queue.add(new int[]{x, y, _stepTime});
                    }
                }
            }
        }

        return dp[m - 1][n - 1];
    }

    private boolean reachable(int x, int y, int m, int n) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}

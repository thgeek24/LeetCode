/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m289;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 289
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/27 09:11
 */
public class GameOfLife {
    private final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1},
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

    public void gameOfLife(int[][] board) {
        List<int[]> lifeChanges = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int count = countLiveNeighbors(i, j, board);
                if (count < 2 && board[i][j] == 1) {
                    lifeChanges.add(new int[]{i, j});
                } else if (count > 3 && board[i][j] == 1) {
                    lifeChanges.add(new int[]{i, j});
                } else if (count == 3 && board[i][j] == 0) {
                    lifeChanges.add(new int[]{i, j});
                }
            }
        }

        for (int[] change : lifeChanges) {
            int i = change[0];
            int j = change[1];
            board[i][j] = 1 - board[i][j];
        }
    }

    private int countLiveNeighbors(int i, int j, int[][] board) {
        int count = 0;
        for (int[] direction : directions) {
            int m = i + direction[0];
            int n = j + direction[1];
            if (m >= 0 && m < board.length && n >= 0 && n < board[0].length && board[m][n] == 1) {
                count++;
            }
        }
        return count;
    }
}

/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h52;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 52
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/20 10:56
 */
public class NQueensII {
    private final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};
    private int[][] board;
    private int n;
    private int total;
    private List<List<int[]>> res;

    public int totalNQueens(int n) {
        init(n);
        backtrack(0, 0, new ArrayList<>());
        return res.size();
    }

    private void init(int n) {
        this.board = new int[n][n];
        this.res = new ArrayList<>();
        this.n = n;
        this.total = n * n;
    }

    private void backtrack(int row, int col, List<int[]> queens) {
        int idx = row * n + col;
        while (idx < total) {
            int i = idx / n;
            int j = idx % n;
            if (board[i][j] == 0) {
                queens.add(new int[]{i, j});
                occupy(i, j);
                if (queens.size() == n) {
                    res.add(new ArrayList<>(queens));
                } else if (queens.size() < n) {
                    int[] next = getNext(i, j);
                    if (next != null) {
                        backtrack(next[0], next[1], queens);
                    }
                }
                queens.remove(queens.size() - 1);
                clear(i, j);
            }
            idx++;
        }
    }

    private int[] getNext(int row, int col) {
        int idx = n * row + col + 1;
        while (idx < total) {
            int i = idx / n;
            int j = idx % n;
            if (board[i][j] == 0) {
                return new int[]{i, j};
            }
            idx++;
        }
        return null;
    }

    private void occupy(int row, int col) {
        for (int[] dir : directions) {
            int i = row;
            int j = col;
            while (i >= 0 && i < n && j >= 0 && j < n) {
                board[i][j]++;
                i += dir[0];
                j += dir[1];
            }
        }
        board[row][col] -= 7;
    }

    private void clear(int row, int col) {
        for (int[] dir : directions) {
            int i = row;
            int j = col;
            while (i >= 0 && i < n && j >= 0 && j < n) {
                board[i][j]--;
                i += dir[0];
                j += dir[1];
            }
        }
        board[row][col] += 7;
    }
}

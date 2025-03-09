/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m909;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * LeetCode 909
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/13 12:44
 */
public class SnakesAndLadders {
    private final List<Integer> path = new ArrayList<>();
    private final Set<Integer> seen = new HashSet<>();

    public int snakesAndLadders(int[][] board) {
        init(board);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        int moves = 0;
        while (!queue.isEmpty()) {
            int roundSize = queue.size();
            moves++;
            while (roundSize-- > 0) {
                int curr = queue.poll();
                if (seen.contains(curr)) {
                    continue;
                }
                int lastCell = Integer.MIN_VALUE;
                for (int i = 1; i <= 6; i++) {
                    int _curr = curr + i;
                    if (_curr == path.size() - 1) {
                        return moves;
                    }
                    int next = path.get(_curr);
                    if (next == path.size() - 1) {
                        return moves;
                    } else if (next != -1) {
                        seen.add(curr);
                        queue.offer(next);
                    } else {
                        lastCell = Math.max(lastCell, _curr);
                    }
                }
                if (lastCell != Integer.MIN_VALUE) {
                    seen.add(curr);
                    queue.offer(lastCell);
                }
            }
        }

        return -1;
    }

    private void init(int[][] board) {
        path.add(0);
        int len = board.length;

        boolean leftToRight = true;
        for (int i = len - 1; i >= 0; i--) {
            if (leftToRight) {
                for (int j = 0; j < len; j++) {
                    path.add(board[i][j]);
                }
                leftToRight = false;
            } else {
                for (int j = len - 1; j >= 0; j--) {
                    path.add(board[i][j]);
                }
                leftToRight = true;
            }
        }
    }
}

/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 130
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/03 15:41
 */
public class SurroundedRegion_130 {
    private static final int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int dummy = m * n;
        UnionFind uf = new UnionFind(m * n + 1);

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                uf.union(i * n, dummy);
            }
            if (board[i][n - 1] == 'O') {
                uf.union(i * n + n - 1, dummy);
            }
        }

        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                uf.union(j, dummy);
            }
            if (board[m - 1][j] == 'O') {
                uf.union((m - 1) * n + j, dummy);
            }
        }

        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (i * n + j == 87) {
                    System.out.println("Stop here!");
                }
                if (board[i][j] == 'O') {
                    for (int k = 0; k < 4; k++) {
                        int x = i + dir[k][0];
                        int y = j + dir[k][1];
                        if (board[x][y] == 'O') {
                            uf.union(i * n + j, x * n + y);
                        }
                    }
                }
            }
        }

        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (board[i][j] == 'O' && !uf.connected(i * n + j, dummy)) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public static class UnionFind {
        private int count;
        private final int[] root;

        public UnionFind(int n) {
            this.count = n;
            root = new int[n];
            for (int i = 0; i < n; i++) {
                root[i] = i;
            }
        }

        /* 将 p 和 q 连接 */
        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) {
                return;
            }
            root[rootP] = rootQ;
            count--;
        }

        /* 判断 p 和 q 是否连通 */
        public boolean connected(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            return rootP == rootQ;
        }

        /* 返回某个节点 x 的根节点 */
        public int find(int x) {
            if (root[x] == x) {
                return x;
            }
            return root[x] = find(root[x]);
        }

        /* 返回图中有多少个连通分量 */
        public int count() {
            return count;
        }
    }
}
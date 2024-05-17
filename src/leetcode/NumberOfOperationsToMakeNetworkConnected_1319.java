/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1319
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/05/17 09:32
 */
public class NumberOfOperationsToMakeNetworkConnected_1319 {
    public int makeConnected(int n, int[][] connections) {
        if (n > connections.length + 1) {
            return -1;
        }
        UnionFind uf = new UnionFind(n, connections);
        uf.union();
        return uf.getCount() - 1;
    }

    private static class UnionFind {
        private int count;
        private final int[] roots;
        private final int[][] connections;

        public UnionFind(int n, int[][] connections) {
            this.count = n;
            this.roots = new int[n];
            this.connections = connections;
            for (int i = 0; i < n; i++) {
                roots[i] = i;
            }
        }

        public void union() {
            for (int[] connection : connections) {
                doUnion(connection[0], connection[1]);
            }
        }

        private void doUnion(int i, int j) {
            int rootI = getRoot(i);
            int rootJ = getRoot(j);
            if (rootI != rootJ) {
                roots[rootI] = rootJ;
                count--;
            }
        }

        public int getRoot(int i) {
            if (i == roots[i]) {
                return i;
            }
            return roots[i] = getRoot(roots[i]);
        }

        public int getCount() {
            return count;
        }
    }
}

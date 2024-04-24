/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 684
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/24 16:50
 */
public class RedundantConnection_684 {
    public int[] findRedundantConnection(int[][] edges) {
        UnionFind uf = new UnionFind(edges);
        uf.union();
        return uf.getExtra();
    }

    private static class UnionFind {
        private final int[] root;
        private final int[][] edges;
        private int[] extra;

        public int[] getExtra() {
            return extra;
        }

        public UnionFind(int[][] edges) {
            int len = edges.length;
            this.root = new int[len];
            this.edges = edges;
            for (int i = 0; i < len; i++) {
                root[i] = i;
            }
        }

        public void union() {
            for (int[] edge : edges) {
                int a = edge[0] - 1;
                int b = edge[1] - 1;
                if (isConnected(a, b)) {
                    extra = edge;
                } else {
                    doUnion(a, b);
                }
            }
        }

        private void doUnion(int i, int j) {
            if (root[i] == root[j]) {
                return;
            }
            int rootI = getRoot(i);
            int rootJ = getRoot(j);
            root[rootJ] = root[rootI];
        }

        public boolean isConnected(int i, int j) {
            int rootI = getRoot(i);
            int rootJ = getRoot(j);
            return rootI == rootJ;
        }

        public int getRoot(int i) {
            if (root[i] == i) {
                return i;
            }
            return root[i] = getRoot(root[i]);
        }
    }
}

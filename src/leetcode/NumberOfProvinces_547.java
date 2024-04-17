/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 547
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/17 15:36
 */
public class NumberOfProvinces_547 {
    public int findCircleNum(int[][] isConnected) {
        UnionFind uf = new UnionFind(isConnected);
        uf.union();
        return uf.count();
    }

    public static class UnionFind {
        private final int len;
        private final int[] root;
        private final int[][] isConnected;

        public UnionFind(int[][] isConnected) {
            len = isConnected.length;
            this.root = new int[len];
            this.isConnected = isConnected;
            for (int i = 0; i < len; i++) {
                root[i] = i;
            }
        }

        public void union() {
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    if (isConnected[i][j] == 1) {
                        doUnion(i, j);
                    }
                }
            }
        }

        public void doUnion(int p, int q) {
            int rootP = findRoot(p);
            int rootQ = findRoot(q);
            if (rootP == rootQ) {
                return;
            }
            root[rootP] = rootQ;
        }

        public int findRoot(int p) {
            if (root[p] == p) {
                return p;
            }
            return root[p] = findRoot(root[p]);
        }

        public int count() {
            int count = 0;
            for (int i = 0; i < root.length; i++) {
                if (root[i] == i) {
                    count++;
                }
            }
            return count;
        }
    }
}

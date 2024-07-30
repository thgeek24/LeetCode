/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 959
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/30 10:23
 */
public class RegionsCutBySlashes_959 {
    private static class UnionFind {
        private int[] root;
        private int count;

        public UnionFind(int n) {
            this.root = new int[n];
            for (int i = 0; i < n; i++) {
                root[i] = i;
            }
            this.count = n;
        }

        public int findRoot(int p) {
            if (root[p] == p) {
                return p;
            }
            return root[p] = findRoot(root[p]);
        }

        public void union(int p, int q) {
            int rootP = findRoot(p);
            int rootQ = findRoot(q);
            if (rootP != rootQ) {
                root[rootP] = rootQ;
                count--;
            }
        }
    }

    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int numTriangles = n * n * 4;
        UnionFind uf = new UnionFind(numTriangles);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int root = 4 * (i * n + j);
                char var = grid[i].charAt(j);
                if (var == '/') {
                    uf.union(root, root + 3);
                    uf.union(root + 1, root + 2);
                } else if (var == '\\') {
                    uf.union(root, root + 1);
                    uf.union(root + 2, root + 3);
                } else {
                    uf.union(root, root + 1);
                    uf.union(root + 1, root + 2);
                    uf.union(root + 2, root + 3);
                }

                if (j + 1 < n) {
                    uf.union(root + 1, root + 4 + 3);
                }

                if (i + 1 < n) {
                    uf.union(root + 2, root + n * 4);
                }
            }
        }

        return uf.count;
    }
}

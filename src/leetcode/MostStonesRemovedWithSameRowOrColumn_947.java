/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 947
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/28 10:35
 */
public class MostStonesRemovedWithSameRowOrColumn_947 {
    public int removeStones(int[][] stones) {
        UnionFind uf = new UnionFind(stones);
        uf.union();
        return uf.getLen() - uf.getCount();
    }

    private static class UnionFind {
        private final int len;
        private final int[] root;
        private final int[][] stones;
        private int count;

        public UnionFind(int[][] stones) {
            this.len = stones.length;
            this.root = new int[len];
            this.count = len;
            this.stones = stones;
            for (int i = 0; i < len; i++) {
                root[i] = i;
            }
        }

        public void union() {
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    if (isConnected(i, j)) {
                        continue;
                    }
                    if (stones[i][0] == stones[j][0]
                            || stones[i][1] == stones[j][1]) {
                        doUnion(i, j);
                    }
                }
            }
        }

        private void doUnion(int i, int j) {
            int rootI = getRoot(i);
            int rootJ = getRoot(j);
            if (rootI == rootJ) {
                return;
            }
            root[rootJ] = rootI;
            count--;
        }

        public int getRoot(int i) {
            if (root[i] == i) {
                return i;
            }
            return root[i] = getRoot(root[i]);
        }

        public boolean isConnected(int i, int j) {
            int rootI = getRoot(i);
            int rootJ = getRoot(j);
            return rootI == rootJ;
        }

        public int getLen() {
            return len;
        }

        public int getCount() {
            return count;
        }
    }
}

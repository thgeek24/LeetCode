/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 990
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/04 11:36
 */
public class SatisfiabilityOfEqualityEquations_990 {
    public boolean equationsPossible(String[] equations) {
        List<String> notEquals = new ArrayList<>();
        UnionFind uf = new UnionFind(26);
        for (String equation : equations) {
            if (equation.charAt(1) == '!') {
                notEquals.add(equation);
                continue;
            }
            int p = equation.charAt(0) - 97;
            int q = equation.charAt(3) - 97;
            uf.union(p, q);
        }
        for (String notEqual : notEquals) {
            int p = notEqual.charAt(0) - 97;
            int q = notEqual.charAt(3) - 97;
            if (uf.connected(p, q)) {
                return false;
            }
        }
        return true;
    }

    private static class UnionFind {
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

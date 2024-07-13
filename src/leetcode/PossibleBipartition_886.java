/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 886
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/13 17:30
 */
public class PossibleBipartition_886 {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        if (n == 1) {
            return false;
        }
        if (dislikes.length == 0) {
            return true;
        }
        boolean[] visited = new boolean[n + 1];
        UnionFind uf = new UnionFind(n);
        List<List<Integer>> dislikeList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            dislikeList.add(new ArrayList<>());
        }

        for (int[] dislike : dislikes) {
            dislikeList.get(dislike[0]).add(dislike[1]);
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;

                List<Integer> dislikedPeople = dislikeList.get(i);
                if (dislikedPeople.isEmpty()) {
                    continue;
                }
                for (Integer dislikedPerson : dislikedPeople) {
                    if (uf.isConnected(i, dislikedPerson)) {
                        return false;
                    }
                }
                uf.unionAll(dislikedPeople);
            }
        }

        return true;
    }

    private static class UnionFind {
        private final int[] roots;

        public UnionFind(int n) {
            this.roots = new int[n + 1];
            for (int i = 0; i < n + 1; i++) {
                roots[i] = i;
            }
        }

        public void union(int p, int q) {
            int rootP = getRoot(p);
            int rootQ = getRoot(q);
            if (rootP != rootQ) {
                roots[rootQ] = rootP;
            }
        }

        public void unionAll(List<Integer> points) {
            if (points.size() < 2) {
                return;
            }
            int firstPoint = points.get(0);
            for (int i = 1; i < points.size(); i++) {
                union(firstPoint, points.get(i));
            }
        }

        public int getRoot(int n) {
            if (roots[n] == n) {
                return n;
            }
            return roots[n] = getRoot(roots[n]);
        }

        public boolean isConnected(int p, int q) {
            return getRoot(p) == getRoot(q);
        }
    }
}

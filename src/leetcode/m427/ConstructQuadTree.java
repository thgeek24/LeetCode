/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m427;

/**
 * LeetCode 427
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/20 20:49
 */
public class ConstructQuadTree {
    public static class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;

        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }

    public Node construct(int[][] grid) {
        return construct(grid, 0, 0, grid.length);
    }

    private Node construct(int[][] grid, int i, int j, int len) {
        boolean hasSameValue = hasSameValue(grid, i, j, len);
        if (hasSameValue) {
            return new Node(grid[i][j] == 1, true);
        }

        if (len == 2) {
            Node topLeft = new Node(grid[i][j] == 1, true);
            Node topRight = new Node(grid[i][j + 1] == 1, true);
            Node bottomLeft = new Node(grid[i + 1][j] == 1, true);
            Node bottomRight = new Node(grid[i + 1][j + 1] == 1, true);
            return new Node(grid[i][j] == 1, false, topLeft, topRight, bottomLeft, bottomRight);
        }

        int halfLen = len / 2;
        Node topLeft = construct(grid, i, j, halfLen);
        Node topRight = construct(grid, i, j + halfLen, halfLen);
        Node bottomLeft = construct(grid, i + halfLen, j, halfLen);
        Node bottomRight = construct(grid, i + halfLen, j + halfLen, halfLen);
        return new Node(true, false, topLeft, topRight, bottomLeft, bottomRight);
    }

    private boolean hasSameValue(int[][] grid, int i, int j, int len) {
        int val = grid[i][j];
        for (int k = i; k < i + len; k++) {
            for (int l = j; l < j + len; l++) {
                if (grid[k][l] != val) {
                    return false;
                }
            }
        }
        return true;
    }
}

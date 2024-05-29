/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 1376
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/05/29 09:17
 */
public class TimeNeededToInformAllEmployees_1376 {
    private int max = 0;

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Tree head = buildTree(n, headID, manager, informTime);
        inform(head, 0);
        return max;
    }

    private void inform(Tree tree, int pathSum) {
        if (tree.children.isEmpty()) {
            max = Math.max(pathSum, max);
            return;
        }
        tree.getChildren().forEach(item -> inform(item, pathSum + tree.getValue()));
    }

    private Tree buildTree(int n, int headID, int[] manager, int[] informTime) {
        List<Tree> trees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            trees.add(new Tree(i, informTime[i]));
        }

        for (int i = 0; i < n; i++) {
            int managerID = manager[i];
            if (managerID != -1) {
                Tree parent = trees.get(managerID);
                parent.addChild(trees.get(i));
            }
        }
        return trees.get(headID);
    }

    private static class Tree {
        private final int key;
        private final int value;
        private final List<Tree> children;

        public Tree(int key, int value) {
            this.key = key;
            this.value = value;
            this.children = new ArrayList<>();
        }

        public void addChild(Tree child) {
            this.children.add(child);
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

        public List<Tree> getChildren() {
            return children;
        }
    }
}
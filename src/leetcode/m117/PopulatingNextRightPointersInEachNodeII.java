/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m117;

import leetcode.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 117
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/06 09:55
 */
public class PopulatingNextRightPointersInEachNodeII {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Map<Integer, List<Node>> leveledNodes = new HashMap<>();
        addNodes(leveledNodes, 0, root);

        leveledNodes.values().forEach(this::connectNodes);
        return root;
    }


    private void addNodes(Map<Integer, List<Node>> leveledNodes, int level, Node node) {
        if (node == null) {
            return;
        }
        List<Node> nodes = leveledNodes.getOrDefault(level, new ArrayList<>());
        nodes.add(node);
        leveledNodes.put(level, nodes);
        addNodes(leveledNodes, level + 1, node.left);
        addNodes(leveledNodes, level + 1, node.right);
    }

    private void connectNodes(List<Node> nodes) {
        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).next = nodes.get(i + 1);
        }
    }
}

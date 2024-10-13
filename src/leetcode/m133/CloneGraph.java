/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 133
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/12 19:59
 */
public class CloneGraph {
    public static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    private final Map<Integer, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        int index = node.val;
        if (map.containsKey(index)) {
            return map.get(index);
        }

        Node curr = new Node(index);
        map.put(index, curr);
        for (Node neighbor : node.neighbors) {
            curr.neighbors.add(cloneGraph(neighbor));
        }
        return curr;
    }
}



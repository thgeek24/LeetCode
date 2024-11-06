/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1372;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * LeetCode 1372
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/04 21:06
 */
class LongestZigZagPathInABinaryTreeTest {
    private LongestZigZagPathInABinaryTree test;

    @BeforeEach
    void setUp() {
        test = new LongestZigZagPathInABinaryTree();
    }

    @Test
    void equalsThree() {
        TreeNode node1 = new TreeNode(1, null, new TreeNode(1));
        TreeNode node2 = new TreeNode(1, null, node1);
        TreeNode node3 = new TreeNode(1, node2, new TreeNode(1));
        TreeNode node4 = new TreeNode(1, new TreeNode(1), node3);
        TreeNode root = new TreeNode(1, null, node4);
        int expected = 3;
        assertEquals(expected, test.longestZigZag(root));
    }

    @Test
    void equalsFour() {
        TreeNode node1 = new TreeNode(1, null, new TreeNode(1));
        TreeNode node2 = new TreeNode(1, node1, new TreeNode(1));
        TreeNode node3 = new TreeNode(1, null, node2);
        TreeNode root = new TreeNode(1, node3, new TreeNode(1));
        int expected = 4;
        assertEquals(expected, test.longestZigZag(root));
    }

    @Test
    void equalsZero() {
        TreeNode root = new TreeNode(1);
        int expected = 0;
        assertEquals(expected, test.longestZigZag(root));
    }
}
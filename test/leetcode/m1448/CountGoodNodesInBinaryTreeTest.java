/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1448;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link CountGoodNodesInBinaryTree}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/04 20:47
 */
class CountGoodNodesInBinaryTreeTest {
    private CountGoodNodesInBinaryTree test;

    @BeforeEach
    void setUp() {
        test = new CountGoodNodesInBinaryTree();
    }

    @Test
    void equalsFour() {
        TreeNode left = new TreeNode(1, new TreeNode(3), null);
        TreeNode right = new TreeNode(4, new TreeNode(1), new TreeNode(5));
        TreeNode root = new TreeNode(3, left, right);
        int expected = 4;
        assertEquals(expected, test.goodNodes(root));
    }

    @Test
    void equalsThree() {
        TreeNode left = new TreeNode(3, new TreeNode(4), new TreeNode(2));
        TreeNode root = new TreeNode(3, left, null);
        int expected = 3;
        assertEquals(expected, test.goodNodes(root));
    }

    @Test
    void equalsOne() {
        TreeNode root = new TreeNode(1);
        int expected = 1;
        assertEquals(expected, test.goodNodes(root));
    }
}
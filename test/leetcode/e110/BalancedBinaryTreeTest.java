/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e110;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link BalancedBinaryTree}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/05 10:11
 */
class BalancedBinaryTreeTest {
    private BalancedBinaryTree test;

    @BeforeEach
    void setUp() {
        test = new BalancedBinaryTree();
    }

    @Test
    void test1() {
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode left = new TreeNode(9);
        TreeNode root = new TreeNode(3, left, right);
        assertTrue(test.isBalanced(root));
    }

    @Test
    void test2() {
        TreeNode right = new TreeNode(2, null, new TreeNode(3));
        TreeNode root = new TreeNode(1, null, right);
        assertFalse(test.isBalanced(root));
    }
}
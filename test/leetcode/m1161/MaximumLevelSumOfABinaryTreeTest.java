/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1161;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link MaximumLevelSumOfABinaryTree}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/04 21:47
 */
class MaximumLevelSumOfABinaryTreeTest {
    private MaximumLevelSumOfABinaryTree test;

    @BeforeEach
    void setUp() {
        test = new MaximumLevelSumOfABinaryTree();
    }

    @Test
    void equalsTwo() {
        TreeNode left = new TreeNode(7, new TreeNode(7), new TreeNode(-8));
        TreeNode right = new TreeNode(0);
        TreeNode root = new TreeNode(1, left, right);
        int expected = 2;
        assertEquals(expected, test.maxLevelSum(root));
    }
}
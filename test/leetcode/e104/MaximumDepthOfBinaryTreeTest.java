/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e104;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MaximumDepthOfBinaryTree}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/04/05 10:45
 */
class MaximumDepthOfBinaryTreeTest {
    private MaximumDepthOfBinaryTree test;

    @BeforeEach
    void setUp() {
        test = new MaximumDepthOfBinaryTree();
    }

    @Test
    void test1() {
        TreeNode root = new TreeNode(3, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        int expected = 3;
        int actual = test.maxDepth(root);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        int expected = 2;
        int actual = test.maxDepth(root);
        assertEquals(expected, actual);
    }
}
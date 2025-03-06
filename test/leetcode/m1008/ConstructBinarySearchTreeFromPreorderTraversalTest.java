/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m1008;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.TreeNodeComparator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ConstructBinarySearchTreeFromPreorderTraversal}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/05 10:09
 */
class ConstructBinarySearchTreeFromPreorderTraversalTest {
    private ConstructBinarySearchTreeFromPreorderTraversal test;

    @BeforeEach
    void setUp() {
        test = new ConstructBinarySearchTreeFromPreorderTraversal();
    }

    @Test
    void test1() {
        int[] preorder = {8, 5, 1, 7, 10, 12};
        TreeNode left = new TreeNode(5, new TreeNode(1), new TreeNode(7));
        TreeNode right = new TreeNode(10, null, new TreeNode(12));
        TreeNode expected = new TreeNode(8, left, right);
        TreeNode actual = test.bstFromPreorder(preorder);
        assertTrue(TreeNodeComparator.equals(expected, actual));
    }

    @Test
    void test2() {
        int[] preorder = {1, 3};
        TreeNode right = new TreeNode(3);
        TreeNode expected = new TreeNode(1, null, right);
        TreeNode actual = test.bstFromPreorder(preorder);
        assertTrue(TreeNodeComparator.equals(expected, actual));
    }

    @Test
    void test3() {
        int[] preorder = {3, 1, 2};
        TreeNode left = new TreeNode(1, null, new TreeNode(2));
        TreeNode expected = new TreeNode(3, left, null);
        TreeNode actual = test.bstFromPreorder(preorder);
        assertTrue(TreeNodeComparator.equals(expected, actual));
    }
}
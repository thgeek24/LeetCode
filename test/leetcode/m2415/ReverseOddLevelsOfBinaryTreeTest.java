/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2415;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.TreeNodeComparator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ReverseOddLevelsOfBinaryTree}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/20 09:42
 */
class ReverseOddLevelsOfBinaryTreeTest {
    private ReverseOddLevelsOfBinaryTree test;

    @BeforeEach
    void setUp() {
        test = new ReverseOddLevelsOfBinaryTree();
    }

    @Test
    void test1() {
        TreeNode left = new TreeNode(3, new TreeNode(8), new TreeNode(13));
        TreeNode right = new TreeNode(5, new TreeNode(21), new TreeNode(34));
        TreeNode root = new TreeNode(2, left, right);

        TreeNode expectedLeft = new TreeNode(5, new TreeNode(8), new TreeNode(13));
        TreeNode expectedRight = new TreeNode(3, new TreeNode(21), new TreeNode(34));
        TreeNode expected = new TreeNode(2, expectedLeft, expectedRight);

        TreeNode actual = test.reverseOddLevels(root);
        assertTrue(TreeNodeComparator.equals(expected, actual));
    }

    @Test
    void test2() {
        TreeNode left = new TreeNode(13);
        TreeNode right = new TreeNode(11);
        TreeNode root = new TreeNode(7, left, right);

        TreeNode expectedLeft = new TreeNode(11);
        TreeNode expectedRight = new TreeNode(13);
        TreeNode expected = new TreeNode(7, expectedLeft, expectedRight);

        TreeNode actual = test.reverseOddLevels(root);
        assertTrue(TreeNodeComparator.equals(expected, actual));
    }
}
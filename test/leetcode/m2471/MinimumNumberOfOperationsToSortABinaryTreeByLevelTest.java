/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2471;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/23 08:56
 */
class MinimumNumberOfOperationsToSortABinaryTreeByLevelTest {
    private MinimumNumberOfOperationsToSortABinaryTreeByLevel test;

    @BeforeEach
    void setUp() {
        test = new MinimumNumberOfOperationsToSortABinaryTreeByLevel();
    }

    @Test
    void test1() {
        TreeNode left = new TreeNode(4, new TreeNode(7), new TreeNode(6));
        TreeNode right = new TreeNode(3, new TreeNode(8, new TreeNode(9), null), new TreeNode(5, new TreeNode(10), null));
        TreeNode root = new TreeNode(1, left, right);
        int expected = 3;
        assertEquals(expected, test.minimumOperations(root));
    }

    @Test
    void test2() {
        TreeNode left = new TreeNode(3, new TreeNode(7), new TreeNode(6));
        TreeNode right = new TreeNode(2, new TreeNode(5), new TreeNode(4));
        TreeNode root = new TreeNode(1, left, right);
        int expected = 3;
        assertEquals(expected, test.minimumOperations(root));
    }

    @Test
    void test3() {
        TreeNode left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        TreeNode right = new TreeNode(3, new TreeNode(6), null);
        TreeNode root = new TreeNode(1, left, right);
        int expected = 0;
        assertEquals(expected, test.minimumOperations(root));
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m106;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test for {@link ConstructBinaryTreeFromInorderAndPostorderTraversal}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/05 11:19
 */
class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {
    private ConstructBinaryTreeFromInorderAndPostorderTraversal test;

    @BeforeEach
    void setUp() {
        test = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
    }

    @Test
    void test1() {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode root = test.buildTree(inorder, postorder);
    }

    @Test
    void test2() {
        int[] inorder = {-1};
        int[] postorder = {-1};
        TreeNode root = test.buildTree(inorder, postorder);
    }

    @Test
    void test3() {
        int[] inorder = {2, 1};
        int[] postorder = {2, 1};
        TreeNode root = test.buildTree(inorder, postorder);
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m105;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test for {@link ConstructBinaryTreeFromPreorderAndInorderTraversal}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/07 11:40
 */
class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    private ConstructBinaryTreeFromPreorderAndInorderTraversal test;

    @BeforeEach
    void setUp() {
        test = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
    }

    @Test
    void test1() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = test.buildTree(preorder, inorder);
    }

    @Test
    void test2() {
        int[] preorder = {-1};
        int[] inorder = {-1};
        TreeNode root = test.buildTree(preorder, inorder);
    }

    @Test
    void test3() {
        int[] preorder = {3, 9};
        int[] inorder = {9, 3};
        TreeNode root = test.buildTree(preorder, inorder);
    }

    @Test
    void test4() {
        int[] preorder = {1, 2};
        int[] inorder = {1, 2};
        TreeNode root = test.buildTree(preorder, inorder);
    }
}
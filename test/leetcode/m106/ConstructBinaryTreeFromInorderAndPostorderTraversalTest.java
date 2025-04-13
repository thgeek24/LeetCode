/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m106;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Test for {@link ConstructBinaryTreeFromInorderAndPostorderTraversal}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/05 11:19
 */
class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {
    private List<ConstructBinaryTreeFromInorderAndPostorderTraversal> tests;

    @BeforeEach
    void setUp() {
        tests = List.of(new ConstructBinaryTreeFromInorderAndPostorderTraversal.Solution1());
    }

    @Test
    void test1() {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        tests.forEach(item -> item.buildTree(inorder, postorder));
    }

    @Test
    void test2() {
        int[] inorder = {-1};
        int[] postorder = {-1};
        tests.forEach(item -> item.buildTree(inorder, postorder));
    }

    @Test
    void test3() {
        int[] inorder = {2, 1};
        int[] postorder = {2, 1};
        tests.forEach(item -> item.buildTree(inorder, postorder));
    }
}
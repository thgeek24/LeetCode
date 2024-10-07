/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m114;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test for {@link FlattenBinaryTreeToLinkedList}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/07 09:09
 */
class FlattenBinaryTreeToLinkedListTest {
    private FlattenBinaryTreeToLinkedList test;

    @BeforeEach
    void setUp() {
        test = new FlattenBinaryTreeToLinkedList();
    }

    @Test
    void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        test.flatten(root);
    }
}
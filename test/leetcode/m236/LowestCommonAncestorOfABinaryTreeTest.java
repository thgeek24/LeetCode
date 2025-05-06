/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m236;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2025/05/06 13:53
 */
class LowestCommonAncestorOfABinaryTreeTest {
    private LowestCommonAncestorOfABinaryTree test;

    @BeforeEach
    void setUp() {
        test = new LowestCommonAncestorOfABinaryTree();
    }

    @Test
    void equalsThree() {
        TreeNode p = new TreeNode(5, new TreeNode(6),
                new TreeNode(2, new TreeNode(7), new TreeNode(4)));
        TreeNode q = new TreeNode(1, new TreeNode(0), new TreeNode(8));
        TreeNode root = new TreeNode(3, p, q);
        assertEquals(root, test.lowestCommonAncestor(root, p, q));
    }
}
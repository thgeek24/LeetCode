/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e101;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link SymmetricTree}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/04/08 07:19
 */
class SymmetricTreeTest {
    private SymmetricTree test;

    @BeforeEach
    void setUp() {
        test = new SymmetricTree();
    }

    @Test
    void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        assertTrue(test.isSymmetric(root));
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3)));
        assertFalse(test.isSymmetric(root));
    }
}
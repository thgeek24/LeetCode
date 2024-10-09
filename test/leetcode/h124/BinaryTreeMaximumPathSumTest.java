/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h124;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link BinaryTreeMaximumPathSum}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/09 09:53
 */
class BinaryTreeMaximumPathSumTest {
    private BinaryTreeMaximumPathSum test;

    @BeforeEach
    void setUp() {
        test = new BinaryTreeMaximumPathSum();
    }

    @Test
    void equalsSix() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        int expected = 6;
        assertEquals(expected, test.maxPathSum(root));
    }

    @Test
    void equalsFortyTwo() {
        TreeNode twenty = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(-10, new TreeNode(9), twenty);
        int expected = 42;
        assertEquals(expected, test.maxPathSum(root));
    }

    @Test
    void equalsTwo() {
        TreeNode root = new TreeNode(2, new TreeNode(-1), null);
        int expected = 2;
        assertEquals(expected, test.maxPathSum(root));
    }
}
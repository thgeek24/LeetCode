/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m129;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link SumRootToLeafNumbers}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/08 08:27
 */
class SumRootToLeafNumbersTest {
    private SumRootToLeafNumbers test;

    @BeforeEach
    void setUp() {
        test = new SumRootToLeafNumbers();
    }

    @Test
    void equalsTwentyFive() {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);
        assertEquals(25, test.sumNumbers(root));
    }

    @Test
    void equalsOneZeroTwoSix() {
        TreeNode left = new TreeNode(9, new TreeNode(5), new TreeNode(1));
        TreeNode right = new TreeNode(0);
        TreeNode root = new TreeNode(4, left, right);
        assertEquals(1026, test.sumNumbers(root));
    }
}
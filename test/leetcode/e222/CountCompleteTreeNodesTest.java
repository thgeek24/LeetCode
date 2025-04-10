/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e222;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link CountCompleteTreeNodes}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/24 22:35
 */
class CountCompleteTreeNodesTest {
    private CountCompleteTreeNodes test;

    @BeforeEach
    void setUp() {
        test = new CountCompleteTreeNodes();
    }

    @Test
    void equalsThree() {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);
        assertEquals(3, test.countNodes(root));
    }

}
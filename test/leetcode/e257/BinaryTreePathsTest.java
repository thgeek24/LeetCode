/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e257;

import leetcode.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link BinaryTreePaths}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/04 13:30
 */
class BinaryTreePathsTest {
    private BinaryTreePaths test;

    @BeforeEach
    void setUp() {
        test = new BinaryTreePaths();
    }

    @Test
    void test1() {
        TreeNode left = new TreeNode(2, null, new TreeNode(5));
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);
        List<String> expected = Arrays.asList("1->2->5", "1->3");
        List<String> actual = test.binaryTreePaths(root);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(1);
        List<String> expected = Collections.singletonList("1");
        List<String> actual = test.binaryTreePaths(root);
        assertEquals(expected, actual);
    }
}
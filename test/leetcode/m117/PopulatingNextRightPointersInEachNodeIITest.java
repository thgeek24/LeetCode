/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m117;

import leetcode.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test for {@link PopulatingNextRightPointersInEachNodeII}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/06 10:22
 */
class PopulatingNextRightPointersInEachNodeIITest {
    private PopulatingNextRightPointersInEachNodeII test;

    @BeforeEach
    void setUp() {
        test = new PopulatingNextRightPointersInEachNodeII();
    }

    @Test
    void test1() {
        Node left = new Node(2, new Node(4), new Node(5), null);
        Node right = new Node(3, null, new Node(7), null);
        Node root = new Node(1, left, right, null);
        test.connect(root);
    }

    @Test
    void test2() {
        Node root = null;
        test.connect(root);
    }
}
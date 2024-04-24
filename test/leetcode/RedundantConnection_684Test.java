/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test for {@link RedundantConnection_684}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/24 17:00
 */
class RedundantConnection_684Test {
    private RedundantConnection_684 test;

    @BeforeEach
    void setUp() {
        test = new RedundantConnection_684();
    }

    @Test
    void test1() {
        int[][] edges = {{1, 2}, {1, 3}, {2, 3}};
        int[] actual = test.findRedundantConnection(edges);
        int[] expected = {2, 3};
        assertArrayEquals(actual, expected);
    }

    @Test
    void test2() {
        int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
        int[] actual = test.findRedundantConnection(edges);
        int[] expected = {1, 4};
        assertArrayEquals(actual, expected);
    }
}
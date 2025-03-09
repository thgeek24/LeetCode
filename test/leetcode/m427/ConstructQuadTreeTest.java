/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m427;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test for {@link ConstructQuadTree}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/20 20:49
 */
class ConstructQuadTreeTest {
    private ConstructQuadTree test;

    @BeforeEach
    void setUp() {
        test = new ConstructQuadTree();
    }

    @Test
    void test1() {
        int[][] grid = {{0, 1}, {1, 0}};
        ConstructQuadTree.Node node = test.construct(grid);
    }

    @Test
    void test2() {
        int[][] grid = {{1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0}};
        ConstructQuadTree.Node node = test.construct(grid);
    }
}
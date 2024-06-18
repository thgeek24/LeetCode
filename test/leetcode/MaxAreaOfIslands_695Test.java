/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MaxAreaOfIslands_695}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/06/18 15:49
 */
class MaxAreaOfIslands_695Test {
    private MaxAreaOfIslands_695 test;

    @BeforeEach
    void setUp() {
        test = new MaxAreaOfIslands_695();
    }

    @Test
    void equalsSix() {
        int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        assertEquals(6, test.maxAreaOfIsland(grid));
    }

    @Test
    void equalsZero() {
        int[][] grid = {{0, 0, 0, 0, 0, 0, 0, 0}};
        assertEquals(0, test.maxAreaOfIsland(grid));
    }
}
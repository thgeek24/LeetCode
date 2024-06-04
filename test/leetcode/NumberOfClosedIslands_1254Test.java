/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link NumberOfClosedIslands_1254}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/06/04 10:03
 */
class NumberOfClosedIslands_1254Test {
    private NumberOfClosedIslands_1254 test;

    @BeforeEach
    void setUp() {
        test = new NumberOfClosedIslands_1254();
    }

    @Test
    void equalsTwo() {
        int[][] grid = {{1, 1, 1, 1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 0}};
        assertEquals(2, test.closedIsland(grid));
    }

    @Test
    void equalsOne() {
        int[][] grid = {{0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 1, 0}};
        assertEquals(1, test.closedIsland(grid));
    }

    @Test
    void equalsTwo_() {
        int[][] grid = {{1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1}};
        assertEquals(2, test.closedIsland(grid));
    }
}
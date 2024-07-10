/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link RottingOranges_994}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/10 15:59
 */
class RottingOrangesTest {
    private RottingOranges_994 test;

    @BeforeEach
    void setUp() {
        test = new RottingOranges_994();
    }

    @Test
    void equalsFour() {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int actual = test.orangesRotting(grid);
        assertEquals(4, actual);
    }

    @Test
    void equalsMinusOne() {
        int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        int actual = test.orangesRotting(grid);
        assertEquals(-1, actual);
    }

    @Test
    void equalsZero() {
        int[][] grid = {{0, 2}};
        int actual = test.orangesRotting(grid);
        assertEquals(0, actual);
    }
}
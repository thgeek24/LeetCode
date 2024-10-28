/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m64;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MinimumPathSum}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/28 12:21
 */
class MinimumPathSumTest {
    private MinimumPathSum test;

    @BeforeEach
    void setUp() {
        test = new MinimumPathSum();
    }

    @Test
    void equalsSeven() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int expected = 7;
        assertEquals(expected, test.minPathSum(grid));
    }

    @Test
    void equalsTwelve() {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
        int expected = 12;
        assertEquals(expected, test.minPathSum(grid));
    }
}
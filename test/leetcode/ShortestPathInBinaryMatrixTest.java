/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import leetcode.m1091.ShortestPathInBinaryMatrix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ShortestPathInBinaryMatrix}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/11 21:10
 */
class ShortestPathInBinaryMatrixTest {
    private ShortestPathInBinaryMatrix test;

    @BeforeEach
    void setUp() {
        test = new ShortestPathInBinaryMatrix();
    }

    @Test
    void equalsTwo() {
        int[][] grid = {{0, 1}, {1, 0}};
        assertEquals(2, test.shortestPathBinaryMatrix(grid));
    }

    @Test
    void equalsFour() {
        int[][] grid = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        assertEquals(4, test.shortestPathBinaryMatrix(grid));
    }

    @Test
    void equalsMinusOne() {
        int[][] grid = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        assertEquals(-1, test.shortestPathBinaryMatrix(grid));
    }
}
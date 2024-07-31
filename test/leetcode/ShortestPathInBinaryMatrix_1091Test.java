/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ShortestPathInBinaryMatrix_1091}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/11 21:10
 */
class ShortestPathInBinaryMatrix_1091Test {
    private ShortestPathInBinaryMatrix_1091 test;

    @BeforeEach
    void setUp() {
        test = new ShortestPathInBinaryMatrix_1091();
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
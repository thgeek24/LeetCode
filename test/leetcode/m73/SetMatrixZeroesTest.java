/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m73;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link SetMatrixZeroes}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/14 08:46
 */
class SetMatrixZeroesTest {
    private SetMatrixZeroes test;

    @BeforeEach
    void setUp() {
        test = new SetMatrixZeroes();
    }

    @Test
    void test1() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        test.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    void test2() {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] expected = {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};
        test.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }
}
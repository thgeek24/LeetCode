/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1975;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MaximumMatrixSum}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/24 08:53
 */
class MaximumMatrixSumTest {
    private MaximumMatrixSum test;

    @BeforeEach
    void setUp() {
        test = new MaximumMatrixSum();
    }

    @Test
    void equalsFour() {
        int[][] matrix = {{1, -1}, {-1, 1}};
        int expected = 4;
        assertEquals(expected, test.maxMatrixSum(matrix));
    }

    @Test
    void equalsSixteen() {
        int[][] matrix = {{1, 2, 3}, {-1, -2, -3}, {1, 2, 3}};
        int expected = 16;
        assertEquals(expected, test.maxMatrixSum(matrix));
    }

    @Test
    void equalsSixteen2() {
        int[][] matrix = {{3, 2, 1}, {-1, -2, -3}, {1, 2, 3}};
        int expected = 16;
        assertEquals(expected, test.maxMatrixSum(matrix));
    }
}
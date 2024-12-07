/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m74;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link SearchA2DMatrix}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/23 07:52
 */
class SearchA2DMatrixTest {
    private SearchA2DMatrix test;

    @BeforeEach
    void setUp() {
        test = new SearchA2DMatrix();
    }

    @Test
    void isTrue() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        assertTrue(test.searchMatrix(matrix, target));
    }

    @Test
    void isTrue2() {
        int[][] matrix = {{1, 3}};
        int target = 3;
        assertTrue(test.searchMatrix(matrix, target));
    }

    @Test
    void isFalse() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;
        assertFalse(test.searchMatrix(matrix, target));
    }

    @Test
    void isFalse2() {
        int[][] matrix = {{1, 1}};
        int target = 2;
        assertFalse(test.searchMatrix(matrix, target));
    }
}
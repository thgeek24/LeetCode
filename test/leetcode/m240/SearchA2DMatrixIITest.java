/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m240;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link SearchA2DMatrixII}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/13 09:33
 */
class SearchA2DMatrixIITest {
    private SearchA2DMatrixII test;

    @BeforeEach
    void setUp() {
        test = new SearchA2DMatrixII();
    }

    @Test
    void isTrue() {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;
        assertTrue(test.searchMatrix(matrix, target));
    }

    @Test
    void isFalse() {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 20;
        assertFalse(test.searchMatrix(matrix, target));
    }
}
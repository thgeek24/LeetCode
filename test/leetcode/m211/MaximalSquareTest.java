/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m211;

import leetcode.m221.MaximalSquare;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link MaximalSquare}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/21 16:40
 */
class MaximalSquareTest {
    private MaximalSquare test;

    @BeforeEach
    void setUp() {
        test = new MaximalSquare();
    }

    @Test
    void equalsFour() {
        char[][] matrix = {{'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}};
        assertEquals(4, this.test.maximalSquare(matrix));
    }

    @Test
    void equalsOne() {
        char[][] matrix = {{'0', '1'}, {'1', '0'}};
        assertEquals(1, this.test.maximalSquare(matrix));
    }

    @Test
    void equalsZero() {
        char[][] matrix = {{'0'}};
        assertEquals(0, this.test.maximalSquare(matrix));
    }
}
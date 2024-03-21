/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link MaximalSquare_221}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/21 16:40
 */
class MaximalSquare_221Test {
    private MaximalSquare_221 test;

    @BeforeEach
    void setUp() {
        test = new MaximalSquare_221();
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
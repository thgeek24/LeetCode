/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m48;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link RotateImage}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/13 09:56
 */
class RotateImageTest {
    private RotateImage test;

    @BeforeEach
    void setUp() {
        test = new RotateImage();
    }

    @Test
    void test1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        test.rotate(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    void test2() {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int[][] expected = {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
        test.rotate(matrix);
        assertArrayEquals(expected, matrix);
    }
}
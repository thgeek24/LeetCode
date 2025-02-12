/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m54;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link SpiralMatrix}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/12 08:55
 */
class SpiralMatrixTest {
    private SpiralMatrix test;

    @BeforeEach
    void setUp() {
        test = new SpiralMatrix();
    }

    @Test
    void test1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);
        assertEquals(expected, test.spiralOrder(matrix));
    }

    @Test
    void test2() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> expected = List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        assertEquals(expected, test.spiralOrder(matrix));
    }
}
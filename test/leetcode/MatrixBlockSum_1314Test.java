/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/19 11:15
 */
class MatrixBlockSum_1314Test {
    private MatrixBlockSum_1314 test;

    @BeforeEach
    void setUp() {
        test = new MatrixBlockSum_1314();
    }

    @Test
    void test1() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 1;
        int[][] expected = {{12, 21, 16}, {27, 45, 33}, {24, 39, 28}};
        int[][] actual = test.matrixBlockSum(mat, k);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].length, actual[i].length);
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }

    @Test
    void test2() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 2;
        int[][] expected = {{45, 45, 45}, {45, 45, 45}, {45, 45, 45}};
        int[][] actual = test.matrixBlockSum(mat, k);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].length, actual[i].length);
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }
}
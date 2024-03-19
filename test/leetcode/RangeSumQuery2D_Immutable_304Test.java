/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link RangeSumQuery2D_Immutable_304}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/19 16:33
 */
class RangeSumQuery2D_Immutable_304Test {
    private RangeSumQuery2D_Immutable_304 test;

    @BeforeEach
    void setUp() {
        int[][] matrix = {{3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}};
        test = new RangeSumQuery2D_Immutable_304(matrix);
    }

    @Test
    void equalsEight() {
        int row1 = 2;
        int col1 = 1;
        int row2 = 4;
        int col2 = 3;
        assertEquals(8, test.sumRegion(row1, col1, row2, col2));
    }

    @Test
    void equalsEleven() {
        int row1 = 1;
        int col1 = 1;
        int row2 = 2;
        int col2 = 2;
        assertEquals(11, test.sumRegion(row1, col1, row2, col2));
    }

    @Test
    void equalsTwelve() {
        int row1 = 1;
        int col1 = 2;
        int row2 = 2;
        int col2 = 4;
        assertEquals(12, test.sumRegion(row1, col1, row2, col2));
    }

}
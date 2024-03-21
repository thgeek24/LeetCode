/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MinimumFallingPathSum_931}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/21 17:37
 */
class MinimumFallingPathSum_931Test {
    private MinimumFallingPathSum_931 test;

    @BeforeEach
    void setUp() {
        test = new MinimumFallingPathSum_931();
    }

    @Test
    void equalsThirteen() {
        int[][] matrix = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        assertEquals(13, test.minFallingPathSum(matrix));
    }

    @Test
    void equalsMinusFiftyNine() {
        int[][] matrix = {{-19, 57}, {-40, -5}};
        assertEquals(-59, test.minFallingPathSum(matrix));
    }
}
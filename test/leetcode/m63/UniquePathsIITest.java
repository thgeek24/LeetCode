/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m63;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link UniquePathsII}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/28 12:33
 */
class UniquePathsIITest {
    private UniquePathsII test;

    @BeforeEach
    void setUp() {
        test = new UniquePathsII();
    }

    @Test
    void equalsTwo() {
        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int expected = 2;
        assertEquals(expected, test.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    void equalsOne() {
        int[][] obstacleGrid = {{0, 1}, {0, 0}};
        int expected = 1;
        assertEquals(expected, test.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    void equalsZero() {
        int[][] obstacleGrid = {{1}};
        int expected = 0;
        assertEquals(expected, test.uniquePathsWithObstacles(obstacleGrid));
    }
}
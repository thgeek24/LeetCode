/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m452;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MinimumNumberOfArrowsToBurstBalloons}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/01 10:13
 */
class MinimumNumberOfArrowsToBurstBalloonsTest {
    private MinimumNumberOfArrowsToBurstBalloons test;

    @BeforeEach
    void setUp() {
        test = new MinimumNumberOfArrowsToBurstBalloons();
    }

    @Test
    void test1() {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        assertEquals(2, test.findMinArrowShots(points));
    }

    @Test
    void test2() {
        int[][] points = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        assertEquals(4, test.findMinArrowShots(points));
    }

    @Test
    void test3() {
        int[][] points = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        assertEquals(2, test.findMinArrowShots(points));
    }
}
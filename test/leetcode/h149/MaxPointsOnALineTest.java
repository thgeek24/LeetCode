/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h149;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * LeetCode 149
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/28 10:11
 */
class MaxPointsOnALineTest {
    private MaxPointsOnALine test;

    @BeforeEach
    void setUp() {
        test = new MaxPointsOnALine();
    }

    @Test
    void equalsThree() {
        int[][] points = {{1, 1}, {2, 2}, {3, 3}};
        int expected = 3;
        assertEquals(expected, test.maxPoints(points));
    }

    @Test
    void equalsFour() {
        int[][] points = {{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
        int expected = 4;
        assertEquals(expected, test.maxPoints(points));
    }

    @Test
    void equalsTwo() {
        int[][] points = {{0, 1}, {0, 0}};
        int expected = 2;
        assertEquals(expected, test.maxPoints(points));
    }

    @Test
    void equalsTwo2() {
        int[][] points = {{2, 3}, {1, 1}};
        int expected = 2;
        assertEquals(expected, test.maxPoints(points));
    }
}
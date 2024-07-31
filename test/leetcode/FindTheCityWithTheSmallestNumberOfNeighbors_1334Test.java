/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link FindTheCityWithTheSmallestNumberOfNeighbors_1334}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/25 09:40
 */
class FindTheCityWithTheSmallestNumberOfNeighbors_1334Test {
    private FindTheCityWithTheSmallestNumberOfNeighbors_1334 test;

    @BeforeEach
    void setUp() {
        test = new FindTheCityWithTheSmallestNumberOfNeighbors_1334();
    }

    @Test
    void equalsThree() {
        int n = 4;
        int[][] edges = {{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}};
        int distanceThreshold = 4;
        int actual = test.findTheCity(n, edges, distanceThreshold);
        assertEquals(3, actual);
    }

    @Test
    void equalsZero() {
        int n = 5;
        int[][] edges = {{0, 1, 2}, {0, 4, 8}, {1, 2, 3}, {1, 4, 2}, {2, 3, 1}, {3, 4, 1}};
        int distanceThreshold = 2;
        int actual = test.findTheCity(n, edges, distanceThreshold);
        assertEquals(0, actual);
    }

    @Test
    void equalsFive() {
        int n = 6;
        int[][] edges = {{2, 3, 7}, {2, 5, 8}, {0, 2, 8}, {4, 5, 5}, {1, 5, 10}, {3, 4, 3}, {0, 5, 9}, {1, 2, 1}};
        int distanceThreshold = 3269;
        int actual = test.findTheCity(n, edges, distanceThreshold);
        assertEquals(5, actual);
    }
}
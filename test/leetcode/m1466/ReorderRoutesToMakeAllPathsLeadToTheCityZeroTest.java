/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1466;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link  ReorderRoutesToMakeAllPathsLeadToTheCityZero}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 19:54
 */
class ReorderRoutesToMakeAllPathsLeadToTheCityZeroTest {
    private ReorderRoutesToMakeAllPathsLeadToTheCityZero test;

    @BeforeEach
    void setUp() {
        test = new ReorderRoutesToMakeAllPathsLeadToTheCityZero();
    }

    @Test
    void equalsThree() {
        int n = 6;
        int[][] connections = {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};
        int expected = 3;
        assertEquals(expected, test.minReorder(n, connections));
    }

    @Test
    void equalsTwo() {
        int n = 5;
        int[][] connections = {{1, 0}, {1, 2}, {3, 2}, {3, 4}};
        int expected = 2;
        assertEquals(expected, test.minReorder(n, connections));
    }

    @Test
    void equalsZero() {
        int n = 3;
        int[][] connections = {{1, 0}, {2, 0}};
        int expected = 0;
        assertEquals(expected, test.minReorder(n, connections));
    }

    @Test
    void equalsThree2() {
        int n = 6;
        int[][] connections = {{0, 2}, {0, 3}, {4, 1}, {4, 5}, {5, 0}};
        int expected = 3;
        assertEquals(expected, test.minReorder(n, connections));
    }
}
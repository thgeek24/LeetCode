/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m56;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MergeIntervals}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/26 10:03
 */
class MergeIntervalsTest {
    private MergeIntervals test;

    @BeforeEach
    void setUp() {
        test = new MergeIntervals();
    }

    @Test
    void test1() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(expected, test.merge(intervals));
    }

    @Test
    void test2() {
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] expected = {{1, 5}};
        assertArrayEquals(expected, test.merge(intervals));
    }

    @Test
    void test3() {
        int[][] intervals = {{1, 4}, {2, 3}};
        int[][] expected = {{1, 4}};
        assertArrayEquals(expected, test.merge(intervals));
    }
}
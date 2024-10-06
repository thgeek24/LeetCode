/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m57;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test for {@link InsertInterval}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/28 15:13
 */
class InsertIntervalTest {
    private InsertInterval test;

    @BeforeEach
    void setUp() {
        test = new InsertInterval();
    }

    @Test
    void test1() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] expected = {{1, 5}, {6, 9}};
        assertArrayEquals(expected, test.insert(intervals, newInterval));
    }

    @Test
    void test2() {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        int[][] expected = {{1, 2}, {3, 10}, {12, 16}};
        assertArrayEquals(expected, test.insert(intervals, newInterval));
    }

    @Test
    void test3() {
        int[][] intervals = {{1, 5}};
        int[] newInterval = {6, 8};
        int[][] expected = {{1, 5}, {6, 8}};
        assertArrayEquals(expected, test.insert(intervals, newInterval));
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * LeetCode 436
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/16 08:14
 */
class FindRightInterval_436Test {
    private FindRightInterval_436 test;

    @BeforeEach
    void setUp() {
        test = new FindRightInterval_436();
    }

    @Test
    void test1() {
        int[][] intervals = {{1, 2}};
        int[] expected = {-1};
        int[] actual = test.findRightInterval(intervals);
        assertArrayEquals(actual, expected);
    }

    @Test
    void test2() {
        int[][] intervals = {{3, 4}, {2, 3}, {1, 2}};
        int[] expected = {-1, 0, 1};
        int[] actual = test.findRightInterval(intervals);
        assertArrayEquals(actual, expected);
    }

    @Test
    void test3() {
        int[][] intervals = {{1, 4}, {2, 3}, {3, 4}};
        int[] expected = {-1, 2, -1};
        int[] actual = test.findRightInterval(intervals);
        assertArrayEquals(actual, expected);
    }

    @Test
    void test4() {
        int[][] intervals = {{1, 1}, {3, 4}};
        int[] expected = {0, -1};
        int[] actual = test.findRightInterval(intervals);
        assertArrayEquals(actual, expected);
    }
}
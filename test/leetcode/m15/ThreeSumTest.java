/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ThreeSum}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/05 11:26
 */
class ThreeSumTest {
    private ThreeSum test;

    @BeforeEach
    void setUp() {
        test = new ThreeSum();
    }

    @Test
    void test1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[][] expected = {{-1, -1, 2}, {-1, 0, 1}};
        int[][] actual = test.threeSum(nums).stream()
                .map(item -> item.stream()
                        .mapToInt(Integer::intValue)
                        .toArray())
                .toArray(int[][]::new);
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        int[] nums = {0, 1, 1};
        int[][] expected = {};
        int[][] actual = test.threeSum(nums).stream()
                .map(item -> item.stream()
                        .mapToInt(Integer::intValue)
                        .toArray())
                .toArray(int[][]::new);
        assertArrayEquals(expected, actual);
    }

    @Test
    void test3() {
        int[] nums = {0, 0, 0};
        int[][] expected = {{0, 0, 0}};
        int[][] actual = test.threeSum(nums).stream()
                .map(item -> item.stream()
                        .mapToInt(Integer::intValue)
                        .toArray())
                .toArray(int[][]::new);
        assertArrayEquals(expected, actual);
    }

    @Test
    void test4() {
        int[] nums = {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        int[][] expected = {{-4, 0, 4}, {-4, 1, 3}, {-3, -1, 4}, {-3, 0, 3}, {-3, 1, 2}, {-2, -1, 3}, {-2, 0, 2}, {-1, -1, 2}, {-1, 0, 1}};
        int[][] actual = test.threeSum(nums).stream()
                .map(item -> item.stream()
                        .mapToInt(Integer::intValue)
                        .toArray())
                .toArray(int[][]::new);
        assertArrayEquals(expected, actual);
    }
}
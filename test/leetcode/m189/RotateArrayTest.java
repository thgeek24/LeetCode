/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m189;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test for {@link RotateArray}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/29 11:48
 */
class RotateArrayTest {
    private RotateArray test;

    @BeforeEach
    void setUp() {
        test = new RotateArray();
    }

    @Test
    void test1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        test.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    void test2() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        int[] expected = {3, 99, -1, -100};
        test.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    void test3() {
        int[] nums = {1};
        int k = 0;
        int[] expected = {1};
        test.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    void test4() {
        int[] nums = {1};
        int k = 1;
        int[] expected = {1};
        test.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    void test5() {
        int[] nums = {1, 2};
        int k = 0;
        int[] expected = {1, 2};
        test.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    void test6() {
        int[] nums = {1, 2};
        int k = 2;
        int[] expected = {1, 2};
        test.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }
}
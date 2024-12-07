/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m31;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test for {@link NextPermutation}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/10 17:12
 */
class NextPermutationTest {
    private NextPermutation test;

    @BeforeEach
    void setUp() {
        test = new NextPermutation();
    }

    @Test
    void test1() {
        int[] nums = {1, 2, 3};
        int[] expected = {1, 3, 2};
        test.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void test2() {
        int[] nums = {3, 2, 1};
        int[] expected = {1, 2, 3};
        test.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void test3() {
        int[] nums = {1, 1, 5};
        int[] expected = {1, 5, 1};
        test.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void test4() {
        int[] nums = {1, 3, 2};
        int[] expected = {2, 1, 3};
        test.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void test5() {
        int[] nums = {2, 3, 1};
        int[] expected = {3, 1, 2};
        test.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void test6() {
        int[] nums = {4, 2, 0, 2, 3, 2, 0};
        int[] expected = {4, 2, 0, 3, 0, 2, 2};
        test.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }
}
/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m167;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link TwoSumII}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/02 10:19
 */
class TwoSumIITest {
    private TwoSumII test;

    @BeforeEach
    void setUp() {
        test = new TwoSumII();
    }

    @Test
    void test1() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {1, 2};
        int[] actual = test.twoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        int[] numbers = {2, 3, 4};
        int target = 6;
        int[] expected = {1, 3};
        int[] actual = test.twoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    void test3() {
        int[] numbers = {-1, 0};
        int target = -1;
        int[] expected = {1, 2};
        int[] actual = test.twoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1004;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MaxConsecutiveOnesIII}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 08:09
 */
class MaxConsecutiveOnesIIITest {
    private MaxConsecutiveOnesIII test;

    @BeforeEach
    void setUp() {
        test = new MaxConsecutiveOnesIII();
    }

    @Test
    void equalsSix() {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int expected = 6;
        assertEquals(expected, test.longestOnes(nums, k));
    }

    @Test
    void equalsTen() {
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        int expected = 10;
        assertEquals(expected, test.longestOnes(nums, k));
    }

    @Test
    void equalsThree() {
        int[] nums = {0, 0, 1, 1, 1, 0, 0};
        int k = 0;
        int expected = 3;
        assertEquals(expected, test.longestOnes(nums, k));
    }

    @Test
    void equalsFour() {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 0;
        int expected = 4;
        assertEquals(expected, test.longestOnes(nums, k));
    }
}
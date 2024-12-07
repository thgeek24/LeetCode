/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m918;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MaximumSumCircularSubarray}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/22 07:35
 */
class MaximumSumCircularSubarrayTest {
    private MaximumSumCircularSubarray test;

    @BeforeEach
    void setUp() {
        test = new MaximumSumCircularSubarray();
    }

    @Test
    void equalsThree() {
        int[] nums = {1, -2, 3, -2};
        assertEquals(3, test.maxSubarraySumCircular(nums));
    }

    @Test
    void equalsTen() {
        int[] nums = {5, -3, 5};
        assertEquals(10, test.maxSubarraySumCircular(nums));
    }

    @Test
    void equalsMinusTwo() {
        int[] nums = {-3, -2, -3};
        assertEquals(-2, test.maxSubarraySumCircular(nums));
    }
}
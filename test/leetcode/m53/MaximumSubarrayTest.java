/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m53;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link MaximumSubarray}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/22 10:08
 */
class MaximumSubarrayTest {
    private MaximumSubarray test;

    @BeforeEach
    void setUp() {
        test = new MaximumSubarray();
    }

    @Test
    void equalsSix() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, test.maxSubArray(nums));
    }

    @Test
    void equalsOne() {
        int[] nums = {1};
        assertEquals(1, test.maxSubArray(nums));
    }

    @Test
    void equalsTwentyTwo() {
        int[] nums = {5, 4, -1, 7, 8};
        assertEquals(23, test.maxSubArray(nums));
    }
}
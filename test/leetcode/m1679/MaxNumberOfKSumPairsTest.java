/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1679;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MaxNumberOfKSumPairs}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/04 22:09
 */
class MaxNumberOfKSumPairsTest {
    private MaxNumberOfKSumPairs test;

    @BeforeEach
    void setUp() {
        test = new MaxNumberOfKSumPairs();
    }

    @Test
    void equalsTwo() {
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        int expected = 2;
        assertEquals(expected, test.maxOperations(nums, k));
    }

    @Test
    void equalsOne() {
        int[] nums = {3, 1, 3, 4, 3};
        int k = 6;
        int expected = 1;
        assertEquals(expected, test.maxOperations(nums, k));
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1493;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link LongestSubarrayOf1sAfterDeletingOneElement}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 09:49
 */
class LongestSubarrayOf1sAfterDeletingOneElementTest {
    private LongestSubarrayOf1sAfterDeletingOneElement test;

    @BeforeEach
    void setUp() {
        test = new LongestSubarrayOf1sAfterDeletingOneElement();
    }

    @Test
    void equalsThree() {
        int[] nums = {1, 1, 0, 1};
        int expected = 3;
        assertEquals(expected, test.longestSubarray(nums));
    }

    @Test
    void equalsFive() {
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        int expected = 5;
        assertEquals(expected, test.longestSubarray(nums));
    }

    @Test
    void equalsTwo() {
        int[] nums = {1, 1, 1};
        int expected = 2;
        assertEquals(expected, test.longestSubarray(nums));
    }
}
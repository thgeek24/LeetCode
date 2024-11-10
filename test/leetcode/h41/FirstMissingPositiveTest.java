/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h41;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link FirstMissingPositive}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/10 19:50
 */
class FirstMissingPositiveTest {
    private FirstMissingPositive test;

    @BeforeEach
    void setUp() {
        test = new FirstMissingPositive();
    }

    @Test
    void equalsThree() {
        int[] nums = {1, 2, 0};
        int expected = 3;
        assertEquals(expected, test.firstMissingPositive(nums));
    }

    @Test
    void equalsTwo() {
        int[] nums = {3, 4, -1, 1};
        int expected = 2;
        assertEquals(expected, test.firstMissingPositive(nums));
    }

    @Test
    void equalsOne() {
        int[] nums = {7, 8, 9, 11, 12};
        int expected = 1;
        assertEquals(expected, test.firstMissingPositive(nums));
    }
}
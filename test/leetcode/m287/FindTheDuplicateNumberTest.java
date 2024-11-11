/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m287;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link FindTheDuplicateNumber}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/10 19:41
 */
class FindTheDuplicateNumberTest {
    private FindTheDuplicateNumber test;

    @BeforeEach
    void setUp() {
        test = new FindTheDuplicateNumber();
    }

    @Test
    void equalsTwo() {
        int[] nums = {1, 3, 4, 2, 2};
        int expected = 2;
        assertEquals(expected, test.findDuplicate(nums));
    }

    @Test
    void equalsThree() {
        int[] nums = {3, 1, 3, 4, 2};
        int expected = 3;
        assertEquals(expected, test.findDuplicate(nums));
    }

    @Test
    void equalsThree2() {
        int[] nums = {3, 3, 3, 3, 3};
        int expected = 3;
        assertEquals(expected, test.findDuplicate(nums));
    }
}
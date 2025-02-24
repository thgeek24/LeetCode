/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m128;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link LongestConsecutiveSequence}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/24 08:58
 */
class LongestConsecutiveSequenceTest {
    private LongestConsecutiveSequence test;

    @BeforeEach
    void setUp() {
        test = new LongestConsecutiveSequence();
    }

    @Test
    void test1() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        assertEquals(4, test.longestConsecutive(nums));
    }

    @Test
    void test2() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        assertEquals(9, test.longestConsecutive(nums));
    }

    @Test
    void test3() {
        int[] nums = {1, 0, 1, 2};
        assertEquals(3, test.longestConsecutive(nums));
    }
}
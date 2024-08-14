/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MinimumSizeSubarraySum_209}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/03 17:24
 */
class MinimumSizeSubarraySum_209Test {
    private MinimumSizeSubarraySum_209 test;

    @BeforeEach
    void setUp() {
        test = new MinimumSizeSubarraySum_209();
    }

    @Test
    void equalsTwo() {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        assertEquals(2, test.minSubArrayLen(target, nums));
    }

    @Test
    void equalsOne() {
        int target = 4;
        int[] nums = {1, 4, 4};
        assertEquals(1, test.minSubArrayLen(target, nums));
    }

    @Test
    void equalsZero() {
        int target = 11;
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        assertEquals(0, test.minSubArrayLen(target, nums));
    }

    @Test
    void equalsFive() {
        int target = 15;
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(5, test.minSubArrayLen(target, nums));
    }
}
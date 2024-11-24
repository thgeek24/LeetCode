/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w425;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/24 10:37
 */
class MinimumPositiveSumSubarrayTest {
    private MinimumPositiveSumSubarray test;

    @BeforeEach
    void setUp() {
        test = new MinimumPositiveSumSubarray();
    }

    @Test
    void equalsOne() {
        List<Integer> nums = Arrays.asList(3, -2, 1, 4);
        int l = 2;
        int r = 3;
        int expected = 1;
        assertEquals(expected, test.minimumSumSubarray(nums, l, r));
    }

    @Test
    void equalsMinusOne() {
        List<Integer> nums = Arrays.asList(-2, 2, -3, 1);
        int l = 2;
        int r = 3;
        int expected = -1;
        assertEquals(expected, test.minimumSumSubarray(nums, l, r));
    }

    @Test
    void equalsThree() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        int l = 2;
        int r = 4;
        int expected = 3;
        assertEquals(expected, test.minimumSumSubarray(nums, l, r));
    }

    @Test
    void equalsEight() {
        List<Integer> nums = Arrays.asList(-12, 8);
        int l = 1;
        int r = 1;
        int expected = 8;
        assertEquals(expected, test.minimumSumSubarray(nums, l, r));
    }
}
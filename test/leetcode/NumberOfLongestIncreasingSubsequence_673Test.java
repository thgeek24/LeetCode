/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link NumberOfLongestIncreasingSubsequence_673}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/11 17:29
 */
class NumberOfLongestIncreasingSubsequence_673Test {
    private NumberOfLongestIncreasingSubsequence_673 test;

    @BeforeEach
    void setUp() {
        test = new NumberOfLongestIncreasingSubsequence_673();
    }

    @Test
    void equalsTwo() {
        int[] nums = {1, 3, 5, 4, 7};
        int two = test.findNumberOfLIS(nums);
        assertEquals(2, two);
    }

    @Test
    void equalsFive() {
        int[] nums = {2, 2, 2, 2, 2};
        int five = test.findNumberOfLIS(nums);
        assertEquals(5, five);
    }

    @Test
    void equalsFour() {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int four = test.findNumberOfLIS(nums);
        assertEquals(4, four);
    }

    @Test
    void equalsThree() {
        int[] nums = {1, 2, 4, 3, 5, 4, 7, 2};
        int three = test.findNumberOfLIS(nums);
        assertEquals(3, three);
    }

    @Test
    void equalsOne() {
        int[] nums = {1};
        int one = test.findNumberOfLIS(nums);
        assertEquals(1, one);
    }

    @Test
    void equalsTwentySeven() {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 3};
        int twentySeven = test.findNumberOfLIS(nums);
        assertEquals(27, twentySeven);
    }
}
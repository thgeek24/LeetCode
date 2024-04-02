/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/02 16:11
 */
class LongestIncreasingSubsequence_300Test {
    private LongestIncreasingSubsequence_300 test;

    @BeforeEach
    void setUp() {
        test = new LongestIncreasingSubsequence_300();
    }

    @Test
    void equalFour() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, test.lengthOfLIS(nums));
    }

    @Test
    void equalFour_() {
        int[] nums = {0, 1, 0, 3, 2, 3};
        assertEquals(4, test.lengthOfLIS(nums));
    }

    @Test
    void equalOne() {
        int[] nums = {7, 7, 7, 7, 7, 7, 7};
        assertEquals(1, test.lengthOfLIS(nums));
    }
}
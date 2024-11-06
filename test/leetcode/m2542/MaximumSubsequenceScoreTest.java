/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2542;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 11:08
 */
class MaximumSubsequenceScoreTest {
    private MaximumSubsequenceScore test;

    @BeforeEach
    void setUp() {
        test = new MaximumSubsequenceScore();
    }

    @Test
    void equalsTwelve() {
        int[] nums1 = {1, 3, 3, 2};
        int[] nums2 = {2, 1, 3, 4};
        int k = 3;
        int expected = 12;
        assertEquals(expected, test.maxScore(nums1, nums2, k));
    }

    @Test
    void equalsThirty() {
        int[] nums1 = {4, 2, 3, 1, 1};
        int[] nums2 = {7, 5, 10, 9, 6};
        int k = 1;
        int expected = 30;
        assertEquals(expected, test.maxScore(nums1, nums2, k));
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m215;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/23 08:32
 */
class KthLargestElementInAnArrayTest {
    private KthLargestElementInAnArray test;

    @BeforeEach
    void setUp() {
        test = new KthLargestElementInAnArray();
    }

    @Test
    void equalsFive() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int expected = 5;
        assertEquals(expected, test.findKthLargest(nums, k));
    }

    @Test
    void equalsFour() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int expected = 4;
        assertEquals(expected, test.findKthLargest(nums, k));
    }
}
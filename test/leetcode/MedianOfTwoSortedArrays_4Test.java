/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MedianOfTwoSortedArrays_4}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/17 09:15
 */
class MedianOfTwoSortedArrays_4Test {
    private MedianOfTwoSortedArrays_4 test;

    @BeforeEach
    void setUp() {
        test = new MedianOfTwoSortedArrays_4();
    }

    @Test
    void equalsTwo() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double actual = test.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.0, actual);
    }

    @Test
    void equalsTwoPointFive() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double actual = test.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.5, actual);
    }

    @Test
    void equalsPointFive() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        double actual = test.findMedianSortedArrays(nums1, nums2);
        assertEquals(0.5, actual);
    }

    @Test
    void equalOnePointFive() {
        int[] nums1 = {3};
        int[] nums2 = {0, 1, 2};
        double actual = test.findMedianSortedArrays(nums1, nums2);
        assertEquals(1.5, actual);
    }

    @Test
    void equalOneThreePointFive() {
        int[] nums1 = {1, 3, 4};
        int[] nums2 = {2, 5, 6};
        double actual = test.findMedianSortedArrays(nums1, nums2);
        assertEquals(3.5, actual);
    }
}
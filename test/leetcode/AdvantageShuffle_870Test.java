/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test for {@link AdvantageShuffle_870}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/10 08:22
 */
class AdvantageShuffle_870Test {
    private AdvantageShuffle_870 test;

    @BeforeEach
    void setUp() {
        test = new AdvantageShuffle_870();
    }

    @Test
    void test1() {
        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {1, 10, 4, 11};
        int[] expected = {2, 11, 7, 15};
        assertArrayEquals(expected, test.advantageCount(nums1, nums2));
    }

    @Test
    void test2() {
        int[] nums1 = {12, 24, 8, 32};
        int[] nums2 = {13, 25, 32, 11};
        int[] expected = {24, 32, 8, 12};
        assertArrayEquals(expected, test.advantageCount(nums1, nums2));
    }
}
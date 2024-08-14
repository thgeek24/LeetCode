/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link FindTheSmallestDivisorGivenAThreshold_1283}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/03 13:37
 */
class FindTheSmallestDivisorGivenAThreshold_1283Test {
    private FindTheSmallestDivisorGivenAThreshold_1283 test;

    @BeforeEach
    void setUp() {
        test = new FindTheSmallestDivisorGivenAThreshold_1283();
    }

    @Test
    void equalsFive() {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        int actual = test.smallestDivisor(nums, threshold);
        assertEquals(5, actual);
    }

    @Test
    void equalsFortyFour() {
        int[] nums = {44, 22, 33, 11, 1};
        int threshold = 5;
        int actual = test.smallestDivisor(nums, threshold);
        assertEquals(44, actual);
    }
}
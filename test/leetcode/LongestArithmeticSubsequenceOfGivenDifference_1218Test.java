/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link LongestArithmeticSubsequenceOfGivenDifference_1218}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/25 10:52
 */
class LongestArithmeticSubsequenceOfGivenDifference_1218Test {
    private LongestArithmeticSubsequenceOfGivenDifference_1218 test;

    @BeforeEach
    void setUp() {
        test = new LongestArithmeticSubsequenceOfGivenDifference_1218();
    }

    @Test
    void equalsFour() {
        int[] arr = {1, 2, 3, 4};
        int difference = 1;
        assertEquals(4, test.longestSubsequence(arr, difference));
    }

    @Test
    void equalsOne() {
        int[] arr = {1, 3, 5, 7};
        int difference = 1;
        assertEquals(1, test.longestSubsequence(arr, difference));
    }

    @Test
    void equalsFour_() {
        int[] arr = {1, 5, 7, 8, 5, 3, 4, 2, 1};
        int difference = -2;
        assertEquals(4, test.longestSubsequence(arr, difference));
    }
}
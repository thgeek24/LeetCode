/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link LongestArithmeticSubsequence_1027}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/22 12:13
 */
class LongestArithmeticSubsequence_1027Test {
    private LongestArithmeticSubsequence_1027 test;

    @BeforeEach
    void setUp() {
        test = new LongestArithmeticSubsequence_1027();
    }

    @Test
    void equalsFour() {
        int[] nums = {3, 6, 9, 12};
        assertEquals(4, test.longestArithSeqLength(nums));
    }

    @Test
    void equalsThree() {
        int[] nums = {9, 4, 7, 2, 10};
        assertEquals(3, test.longestArithSeqLength(nums));
    }

    @Test
    void equalsFour_() {
        int[] nums = {20, 1, 15, 3, 10, 5, 8};
        assertEquals(4, test.longestArithSeqLength(nums));
    }
}
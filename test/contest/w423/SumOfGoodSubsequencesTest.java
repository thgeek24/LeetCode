/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w423;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/10 11:36
 */
class SumOfGoodSubsequencesTest {
    private SumOfGoodSubsequences test;

    @BeforeEach
    void setUp() {
        test = new SumOfGoodSubsequences();
    }

    @Test
    void equalsFourteen() {
        int[] nums = {1, 2, 1};
        assertEquals(14, test.sumOfGoodSubsequences(nums));
    }

    @Test
    void equalsForty() {
        int[] nums = {3, 4, 5};
        assertEquals(40, test.sumOfGoodSubsequences(nums));
    }
}
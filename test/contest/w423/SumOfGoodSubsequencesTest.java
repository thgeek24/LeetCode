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

    @Test
    void test3() {
        int[] nums = {89, 88, 89, 89, 90, 88, 88, 90, 89, 87, 75, 45, 90, 87, 88, 19, 89, 88, 88, 89, 28, 18, 27, 81, 70, 99, 91, 89, 44, 90, 89, 18, 90, 20, 48, 28, 64, 82, 87, 88, 8, 28, 68, 91, 89, 90, 68, 9, 88, 90, 89, 0, 74, 21, 1, 69, 45, 4, 89, 90, 100, 9, 84, 88, 26, 66, 29, 90, 2, 87, 10, 5, 63, 21, 70, 42, 56, 49, 2, 91, 6, 88, 18, 62, 46, 99, 91, 57, 52, 89, 27, 63, 29, 62, 66};
        assertEquals(513210180, test.sumOfGoodSubsequences(nums));
    }
}
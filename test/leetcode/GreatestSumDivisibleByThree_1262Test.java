/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link GreatestSumDivisibleByThree_1262}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/27 11:51
 */
class GreatestSumDivisibleByThree_1262Test {
    private GreatestSumDivisibleByThree_1262 test;

    @BeforeEach
    void setUp() {
        test = new GreatestSumDivisibleByThree_1262();
    }

    @Test
    void equalsEighteen() {
        int[] nums = {3, 6, 5, 1, 8};
        assertEquals(18, test.maxSumDivThree(nums));
    }

    @Test
    void equalsZero() {
        int[] nums = {4};
        assertEquals(0, test.maxSumDivThree(nums));
    }

    @Test
    void equalsTwelve() {
        int[] nums = {1, 2, 3, 4, 4};
        assertEquals(12, test.maxSumDivThree(nums));
    }

    @Test
    void equalsFifteen() {
        int[] nums = {2, 6, 2, 2, 7};
        assertEquals(15, test.maxSumDivThree(nums));
    }
}
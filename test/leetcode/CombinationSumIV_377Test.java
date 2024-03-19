/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link CombinationSumIV_377}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/10 19:26
 */
class CombinationSumIV_377Test {
    private CombinationSumIV_377 test;

    @BeforeEach
    void setUp() {
        test = new CombinationSumIV_377();
    }

    @Test
    void equalsSeven() {
        int[] nums = {1, 2, 3};
        int target = 4;
        assertEquals(7, test.combinationSum4(nums, target));
    }

    @Test
    void equalsZero() {
        int[] nums = {9};
        int target = 3;
        assertEquals(0, test.combinationSum4(nums, target));
    }

    @Test
    void equalsEight() {
        int[] nums = {3, 1, 2, 4};
        int target = 4;
        assertEquals(8, test.combinationSum4(nums, target));
    }
}
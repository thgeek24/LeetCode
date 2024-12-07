/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w425;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/24 11:28
 */
class MinimumArraySumTest {
    private MinimumArraySum test;

    @BeforeEach
    void setUp() {
        test = new MinimumArraySum();
    }

    @Test
    void equalsTwentyThree() {
        int[] nums = {2, 8, 3, 19, 3};
        int k = 3;
        int op1 = 1;
        int op2 = 1;
        int expected = 23;
        assertEquals(expected, test.minArraySum(nums, k, op1, op2));
    }

    @Test
    void equalsThree() {
        int[] nums = {2, 4, 3};
        int k = 3;
        int op1 = 2;
        int op2 = 1;
        int expected = 3;
        assertEquals(expected, test.minArraySum(nums, k, op1, op2));
    }
}
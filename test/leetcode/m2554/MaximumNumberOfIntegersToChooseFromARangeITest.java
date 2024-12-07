/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2554;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MaximumNumberOfIntegersToChooseFromARangeI}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/06 08:51
 */
class MaximumNumberOfIntegersToChooseFromARangeITest {
    private MaximumNumberOfIntegersToChooseFromARangeI test;

    @BeforeEach
    void setUp() {
        test = new MaximumNumberOfIntegersToChooseFromARangeI();
    }

    @Test
    void equalsTwo() {
        int[] banned = {1, 6, 5};
        int n = 5;
        int maxSum = 6;
        assertEquals(2, test.maxCount(banned, n, maxSum));
    }

    @Test
    void equalsZero() {
        int[] banned = {1, 2, 3, 4, 5, 6, 75};
        int n = 8;
        int maxSum = 1;
        assertEquals(0, test.maxCount(banned, n, maxSum));
    }

    @Test
    void equalsSeven() {
        int[] banned = {11};
        int n = 7;
        int maxSum = 50;
        assertEquals(7, test.maxCount(banned, n, maxSum));
    }
}
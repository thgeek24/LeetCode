/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MinimumNumberOfDaysToMakeMBouquets_1482}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/31 08:51
 */
class MinimumNumberOfDaysToMakeMBouquets_1482Test {
    private MinimumNumberOfDaysToMakeMBouquets_1482 test;

    @BeforeEach
    void setUp() {
        test = new MinimumNumberOfDaysToMakeMBouquets_1482();
    }

    @Test
    void equalsThree() {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;
        assertEquals(3, test.minDays(bloomDay, m, k));
    }

    @Test
    void equalsMinusOne() {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 2;
        assertEquals(-1, test.minDays(bloomDay, m, k));
    }

    @Test
    void equalsTwelve() {
        int[] bloomDay = {7, 7, 7, 7, 12, 7, 7};
        int m = 2;
        int k = 3;
        assertEquals(12, test.minDays(bloomDay, m, k));
    }
}
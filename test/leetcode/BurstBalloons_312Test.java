/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link BurstBalloons_312}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/18 11:13
 */
class BurstBalloons_312Test {
    private BurstBalloons_312 test;

    @BeforeEach
    void setUp() {
        test = new BurstBalloons_312();
    }

    @Test
    void equalsOneSixSeven() {
        int[] nums = {3, 1, 5, 8};
        assertEquals(167, test.maxCoins(nums));
    }

    @Test
    void equalsTen() {
        int[] nums = {1, 5};
        assertEquals(10, test.maxCoins(nums));
    }

}
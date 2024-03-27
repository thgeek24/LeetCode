/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link PredictTheWinner_486}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/27 09:48
 */
class PredictTheWinner_486Test {
    private PredictTheWinner_486 test;

    @BeforeEach
    void setUp() {
        test = new PredictTheWinner_486();
    }

    @Test
    void equalsTrue() {
        int[] nums = {1, 5, 233, 7};
        assertTrue(test.predictTheWinner(nums));
    }

    @Test
    void equalsFalse() {
        int[] nums = {1, 5, 2};
        assertFalse(test.predictTheWinner(nums));
    }
}
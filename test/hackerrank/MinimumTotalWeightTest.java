/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package hackerrank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MinimumTotalWeight}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/04 20:35
 */
class MinimumTotalWeightTest {
    private MinimumTotalWeight test;

    @BeforeEach
    void setUp() {
        test = new MinimumTotalWeight();
    }

    @Test
    void equalsThirtyOne() {
        int[] chocolates = {30, 20, 25};
        int d = 4;
        int expected = 31;
        assertEquals(expected, test.findMinWeight(chocolates, d));
    }
}
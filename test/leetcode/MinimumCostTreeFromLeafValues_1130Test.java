/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MinimumCostTreeFromLeafValues_1130}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/13 21:26
 */
class MinimumCostTreeFromLeafValues_1130Test {
    private MinimumCostTreeFromLeafValues_1130 test;

    @BeforeEach
    void setUp() {
        test = new MinimumCostTreeFromLeafValues_1130();
    }

    @Test
    void equalsThirtyTwo() {
        int[] arr = {6, 2, 4};
        assertEquals(32, test.mctFromLeafValues(arr));
    }

    @Test
    void equalsFortyFour() {
        int[] arr = {4, 11};
        assertEquals(44, test.mctFromLeafValues(arr));
    }

    @Test
    void equalsFortyFourII() {
        int[] arr = {6, 3, 2, 1, 4};
        assertEquals(44, test.mctFromLeafValues(arr));
    }
}
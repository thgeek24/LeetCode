/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MinimumCostToMoveChipsToTheSamePosition_1217}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/27 12:15
 */
class MinimumCostToMoveChipsToTheSamePosition_1217Test {
    private MinimumCostToMoveChipsToTheSamePosition_1217 test;

    @BeforeEach
    void setUp() {
        test = new MinimumCostToMoveChipsToTheSamePosition_1217();
    }

    @Test
    void equalsOne() {
        int[] positions = {1, 2, 3};
        int actual = test.minCostToMoveChips(positions);
        assertEquals(1, actual);
    }

    @Test
    void equalsTwo() {
        int[] positions = {2, 2, 2, 3, 3};
        int actual = test.minCostToMoveChips(positions);
        assertEquals(2, actual);
    }

    @Test
    void equalsOne2() {
        int[] positions = {1, 1000000000};
        int actual = test.minCostToMoveChips(positions);
        assertEquals(1, actual);
    }
}
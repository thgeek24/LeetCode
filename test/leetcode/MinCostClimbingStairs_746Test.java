/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MinCostClimbingStairs_746}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/09 15:03
 */
class MinCostClimbingStairs_746Test {
    private MinCostClimbingStairs_746 test;
    private final int[] cost1 = {10, 15, 20};
    private final int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

    @BeforeEach
    void setUp() {
        test = new MinCostClimbingStairs_746();
    }

    @Test
    void equalsFifteen() {
        int fifteen = test.minCostClimbingStairs(cost1);
        assertEquals(15, fifteen);
    }

    @Test
    void equalsSix() {
        int six = test.minCostClimbingStairs(cost2);
        assertEquals(6, six);
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2462;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link TotalCostToHireKWorkers}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 14:22
 */
class TotalCostToHireKWorkersTest {
    private TotalCostToHireKWorkers test;

    @BeforeEach
    void setUp() {
        test = new TotalCostToHireKWorkers();
    }

    @Test
    void equalsEleven() {
        int[] costs = {17, 12, 10, 2, 7, 2, 11, 20, 8};
        int k = 3;
        int candidates = 4;
        int expected = 11;
        assertEquals(expected, test.totalCost(costs, k, candidates));
    }

    @Test
    void equalsFour() {
        int[] costs = {1, 2, 4, 1};
        int k = 3;
        int candidates = 3;
        int expected = 4;
        assertEquals(expected, test.totalCost(costs, k, candidates));
    }
}
/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m134;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link GasStation}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/02 10:21
 */
class GasStationTest {
    private GasStation test;

    @BeforeEach
    void setUp() {
        test = new GasStation();
    }

    @Test
    void test1() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int expected = 3;
        assertEquals(expected, test.canCompleteCircuit(gas, cost));
    }

    @Test
    void test2() {
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};
        int expected = -1;
        assertEquals(expected, test.canCompleteCircuit(gas, cost));
    }
}
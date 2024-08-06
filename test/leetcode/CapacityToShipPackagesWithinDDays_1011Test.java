/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link CapacityToShipPackagesWithinDDays_1011}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/06 15:17
 */
class CapacityToShipPackagesWithinDDays_1011Test {
    private CapacityToShipPackagesWithinDDays_1011 test;

    @BeforeEach
    void setUp() {
        test = new CapacityToShipPackagesWithinDDays_1011();
    }

    @Test
    void equalsFifteen() {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int actual = test.shipWithinDays(weights, days);
        assertEquals(15, actual);
    }

    @Test
    void equalsSix() {
        int[] weights = {3, 2, 2, 4, 1, 4};
        int days = 3;
        int actual = test.shipWithinDays(weights, days);
        assertEquals(6, actual);
    }

    @Test
    void equalsThree() {
        int[] weights = {1, 2, 3, 1, 1};
        int days = 4;
        int actual = test.shipWithinDays(weights, days);
        assertEquals(3, actual);
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link CarPooling_1094}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/02 16:29
 */
class CarPooling_1094Test {
    private CarPooling_1094 test;

    @BeforeEach
    void setUp() {
        test = new CarPooling_1094();
    }

    @Test
    void isFalse() {
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        int capacity = 4;
        assertFalse(test.carPooling(trips, capacity));
    }

    @Test
    void isTrue() {
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        int capacity = 5;
        assertTrue(test.carPooling(trips, capacity));
    }

    @Test
    void isTrue2() {
        int[][] trips = {{3, 2, 8}, {4, 4, 6}, {10, 8, 9}};
        int capacity = 11;
        assertTrue(test.carPooling(trips, capacity));
    }
}
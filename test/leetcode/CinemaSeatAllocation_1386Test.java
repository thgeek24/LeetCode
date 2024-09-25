/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link CinemaSeatAllocation_1386}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/08 11:58
 */
class CinemaSeatAllocation_1386Test {
    private CinemaSeatAllocation_1386 test;

    @BeforeEach
    void setUp() {
        test = new CinemaSeatAllocation_1386();
    }

    @Test
    void equalsFour() {
        int n = 3;
        int[][] reservedSeats = {{1, 2}, {1, 3}, {1, 8}, {2, 6}, {3, 1}, {3, 10}};
        assertEquals(4, test.maxNumberOfFamilies(n, reservedSeats));
    }

    @Test
    void equalsTwo() {
        int n = 2;
        int[][] reservedSeats = {{2, 1}, {1, 8}, {2, 6}};
        assertEquals(2, test.maxNumberOfFamilies(n, reservedSeats));
    }

    @Test
    void equalsFour2() {
        int n = 4;
        int[][] reservedSeats = {{4, 3}, {1, 4}, {4, 6}, {1, 7}};
        assertEquals(4, test.maxNumberOfFamilies(n, reservedSeats));
    }

}
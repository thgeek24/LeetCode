/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link NumberOfProvinces_547}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/17 15:57
 */
class NumberOfProvinces_547Test {
    private NumberOfProvinces_547 test;

    @BeforeEach
    void setUp() {
        test = new NumberOfProvinces_547();
    }

    @Test
    void equalsTwo() {
        int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        assertEquals(2, test.findCircleNum(isConnected));
    }

    @Test
    void equalsThree() {
        int[][] isConnected = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        assertEquals(3, test.findCircleNum(isConnected));
    }

    @Test
    void equalsOne() {
        int[][] isConnected = {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};
        assertEquals(1, test.findCircleNum(isConnected));
    }
}
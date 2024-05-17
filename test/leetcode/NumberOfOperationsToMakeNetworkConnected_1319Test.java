/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link NumberOfOperationsToMakeNetworkConnected_1319}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/05/17 09:37
 */
class NumberOfOperationsToMakeNetworkConnected_1319Test {
    private NumberOfOperationsToMakeNetworkConnected_1319 test;

    @BeforeEach
    void setUp() {
        test = new NumberOfOperationsToMakeNetworkConnected_1319();
    }

    @Test
    void equalsOne() {
        int n = 4;
        int[][] connections = {{0, 1}, {0, 2}, {1, 2}};
        int expected = 1;
        int actual = test.makeConnected(n, connections);
        assertEquals(expected, actual);
    }

    @Test
    void equalsTwo() {
        int n = 6;
        int[][] connections = {{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}};
        int expected = 2;
        int actual = test.makeConnected(n, connections);
        assertEquals(expected, actual);
    }

    @Test
    void equalsMinusOne() {
        int n = 6;
        int[][] connections = {{0, 1}, {0, 2}, {0, 3}, {1, 2}};
        int expected = -1;
        int actual = test.makeConnected(n, connections);
        assertEquals(expected, actual);
    }
}
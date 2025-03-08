/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m743;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link NetworkDelayTime}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/20 03:11
 */
class NetworkDelayTimeTest {
    private NetworkDelayTime test;

    @BeforeEach
    void setUp() {
        test = new NetworkDelayTime();
    }

    @Test
    void equalsTwo() {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4;
        int k = 2;
        int actual = test.networkDelayTime(times, n, k);
        assertEquals(2, actual);
    }

    @Test
    void equalsOne() {
        int[][] times = {{1, 2, 1}};
        int n = 2;
        int k = 1;
        int actual = test.networkDelayTime(times, n, k);
        assertEquals(1, actual);
    }

    @Test
    void equalsMinusOne() {
        int[][] times = {{1, 2, 1}};
        int n = 2;
        int k = 2;
        int actual = test.networkDelayTime(times, n, k);
        assertEquals(-1, actual);
    }
}
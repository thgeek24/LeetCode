/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m62;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link UniquePaths}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/06 08:57
 */
class UniquePathsTest {
    private UniquePaths test;

    @BeforeEach
    void setUp() {
        test = new UniquePaths();
    }

    @Test
    void test1() {
        int m = 3;
        int n = 7;
        int expected = 28;
        assertEquals(expected, test.uniquePaths(m, n));
    }

    @Test
    void test2() {
        int m = 3;
        int n = 2;
        int expected = 3;
        assertEquals(expected, test.uniquePaths(m, n));
    }
}
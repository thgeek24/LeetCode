/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link OutOfBoundaryPaths_576}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/26 09:34
 */
class OutOfBoundaryPaths_576Test {
    private OutOfBoundaryPaths_576 test;

    @BeforeEach
    void setUp() {
        test = new OutOfBoundaryPaths_576();
    }

    @Test
    void equalsSix() {
        assertEquals(6, test.findPaths(2, 2, 2, 0, 0));
    }

    @Test
    void equalsTwelve() {
        assertEquals(12, test.findPaths(1, 3, 3, 0, 1));
    }

    @Test
    void equalsZero() {
        assertEquals(0, test.findPaths(10, 10, 0, 5, 5));
    }

    @Test
    void testOverflow() {
        assertEquals(390153306, test.findPaths(36, 5, 50, 15, 3));
    }
}
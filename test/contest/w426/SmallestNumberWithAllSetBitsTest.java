/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w426;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link SmallestNumberWithAllSetBits}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/01 10:34
 */
class SmallestNumberWithAllSetBitsTest {
    private SmallestNumberWithAllSetBits test;

    @BeforeEach
    void setUp() {
        test = new SmallestNumberWithAllSetBits();
    }

    @Test
    void equalsSeven() {
        int n = 5;
        int expected = 7;
        assertEquals(expected, test.smallestNumber(n));
    }

    @Test
    void equalsFifteen() {
        int n = 10;
        int expected = 15;
        assertEquals(expected, test.smallestNumber(n));
    }

    @Test
    void equalsThree() {
        int n = 3;
        int expected = 3;
        assertEquals(expected, test.smallestNumber(n));
    }
}
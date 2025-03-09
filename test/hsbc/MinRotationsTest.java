/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package hsbc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/09 18:15
 */
class MinRotationsTest {
    private MinRotations test;

    @BeforeEach
    void setUp() {
        test = new MinRotations();
    }

    @Test
    void test1() {
        String firstString = "abc4x1543j";
        String secondString = "2asdfaabc4";
        int expected = 4;
        int actual = test.minRotations(firstString, secondString);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        String firstString = "abc4x1543j";
        String secondString = "dfaabcj2as";
        int expected = 3;
        int actual = test.minRotations(firstString, secondString);
        assertEquals(expected, actual);
    }
}
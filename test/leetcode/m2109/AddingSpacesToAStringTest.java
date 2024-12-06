/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2109;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link AddingSpacesToAString}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/03 09:23
 */
class AddingSpacesToAStringTest {
    private AddingSpacesToAString test;

    @BeforeEach
    void setUp() {
        test = new AddingSpacesToAString();
    }

    @Test
    void test1() {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};
        String expected = "Leetcode Helps Me Learn";
        assertEquals(expected, test.addSpaces(s, spaces));
    }

    @Test
    void test2() {
        String s = "icodeinpython";
        int[] spaces = {1, 5, 7, 9};
        String expected = "i code in py thon";
        assertEquals(expected, test.addSpaces(s, spaces));
    }

    @Test
    void test3() {
        String s = "spacing";
        int[] spaces = {0, 1, 2, 3, 4, 5, 6};
        String expected = " s p a c i n g";
        assertEquals(expected, test.addSpaces(s, spaces));
    }
}
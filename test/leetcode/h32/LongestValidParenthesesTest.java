/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link LongestValidParentheses}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/09 09:17
 */
class LongestValidParenthesesTest {
    private LongestValidParentheses test;

    @BeforeEach
    void setUp() {
        test = new LongestValidParentheses();
    }

    @Test
    void equalsTwo() {
        String s = "(()";
        int expected = 2;
        assertEquals(expected, test.longestValidParentheses(s));
    }

    @Test
    void equalsFour() {
        String s = ")()())";
        int expected = 4;
        assertEquals(expected, test.longestValidParentheses(s));
    }

    @Test
    void equalsZero() {
        String s = "";
        int expected = 0;
        assertEquals(expected, test.longestValidParentheses(s));
    }

    @Test
    void equalsTwo2() {
        String s = "())";
        int expected = 2;
        assertEquals(expected, test.longestValidParentheses(s));
    }
}
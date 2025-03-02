/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e20;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ValidParentheses}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/02 09:36
 */
class ValidParenthesesTest {
    private ValidParentheses test;

    @BeforeEach
    void setUp() {
        test = new ValidParentheses();
    }

    @Test
    void test1() {
        String s = "()";
        assertTrue(test.isValid(s));
    }

    @Test
    void test2() {
        String s = "()[]{}";
        assertTrue(test.isValid(s));
    }

    @Test
    void test3() {
        String s = "(]";
        assertFalse(test.isValid(s));
    }

    @Test
    void test4() {
        String s = "([])";
        assertTrue(test.isValid(s));
    }
}
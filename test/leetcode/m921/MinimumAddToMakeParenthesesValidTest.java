/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m921;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link MinimumAddToMakeParenthesesValid}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/15 13:22
 */
class MinimumAddToMakeParenthesesValidTest {
    private MinimumAddToMakeParenthesesValid test;

    @BeforeEach
    void setUp() {
        test = new MinimumAddToMakeParenthesesValid();
    }

    @Test
    void equalsOne() {
        String s = "())";
        assertEquals(1, test.minAddToMakeValid(s));
    }

    @Test
    void equalsThree() {
        String s = "(((";
        assertEquals(3, test.minAddToMakeValid(s));
    }

    @Test
    void equalsFour() {
        String s = "()))((";
        assertEquals(4, test.minAddToMakeValid(s));
    }
}
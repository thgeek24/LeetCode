/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m150;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link EvaluateReversePolishNotation}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/30 13:00
 */
class EvaluateReversePolishNotationTest {
    private EvaluateReversePolishNotation test;

    @BeforeEach
    void setUp() {
        test = new EvaluateReversePolishNotation();
    }

    @Test
    void equalsNine() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int expected = 9;
        assertEquals(expected, test.evalRPN(tokens));
    }

    @Test
    void equalsSix() {
        String[] tokens = {"4", "13", "5", "/", "+"};
        int expected = 6;
        assertEquals(expected, test.evalRPN(tokens));
    }

    @Test
    void equalsTwentyTwo() {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int expected = 22;
        assertEquals(expected, test.evalRPN(tokens));
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h224;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link BasicCalculator}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/01 08:58
 */
class BasicCalculatorTest {
    private BasicCalculator test;

    @BeforeEach
    void setUp() {
        test = new BasicCalculator();
    }

    @Test
    void equalsTwo() {
        String s = "1 + 1";
        assertEquals(2, test.calculate(s));
    }

    @Test
    void equalsThree() {
        String s = " 2-1 + 2 ";
        assertEquals(3, test.calculate(s));
    }

    @Test
    void equalsTwentyThree() {
        String s = "(1+(4+5+2)-3)+(6+8)";
        assertEquals(23, test.calculate(s));
    }

    @Test
    void test4() {
        String s = "2147483647";
        assertEquals(2147483647, test.calculate(s));
    }

    @Test
    void test5() {
        String s = "1-(     -2)";
        assertEquals(3, test.calculate(s));
    }
}
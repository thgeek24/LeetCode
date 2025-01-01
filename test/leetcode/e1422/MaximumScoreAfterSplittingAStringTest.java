/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e1422;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MaximumScoreAfterSplittingAString}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/01 17:50
 */
class MaximumScoreAfterSplittingAStringTest {
    private MaximumScoreAfterSplittingAString test;

    @BeforeEach
    void setUp() {
        test = new MaximumScoreAfterSplittingAString();
    }

    @Test
    void test1() {
        String input = "011101";
        int expected = 5;
        assertEquals(expected, test.maxScore(input));
    }

    @Test
    void test2() {
        String input = "00111";
        int expected = 5;
        assertEquals(expected, test.maxScore(input));
    }

    @Test
    void test3() {
        String input = "1111";
        int expected = 3;
        assertEquals(expected, test.maxScore(input));
    }

    @Test
    void test4() {
        String input = "00";
        int expected = 1;
        assertEquals(expected, test.maxScore(input));
    }
}
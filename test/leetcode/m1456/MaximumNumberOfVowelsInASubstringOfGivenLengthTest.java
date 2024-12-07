/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1456;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MaximumNumberOfVowelsInASubstringOfGivenLength}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/04 22:20
 */
class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {
    private MaximumNumberOfVowelsInASubstringOfGivenLength test;

    @BeforeEach
    void setUp() {
        test = new MaximumNumberOfVowelsInASubstringOfGivenLength();
    }

    @Test
    void equalsThree() {
        String s = "abciiidef";
        int k = 3;
        int expected = 3;
        assertEquals(expected, test.maxVowels(s, k));
    }

    @Test
    void equalsTwo() {
        String s = "aeiou";
        int k = 2;
        int expected = 2;
        assertEquals(expected, test.maxVowels(s, k));
    }

    @Test
    void equalsTwo2() {
        String s = "leetcode";
        int k = 3;
        int expected = 2;
        assertEquals(expected, test.maxVowels(s, k));
    }
}
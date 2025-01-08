/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e3042;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/08 10:52
 */
class CountPrefixAndSuffixPairsITest {
    private CountPrefixAndSuffixPairsI test;

    @BeforeEach
    void setUp() {
        test = new CountPrefixAndSuffixPairsI();
    }

    @Test
    void test1() {
        String[] words = {"a", "aba", "ababa", "aa"};
        int expected = 4;
        assertEquals(expected, test.countPrefixSuffixPairs(words));
    }

    @Test
    void test2() {
        String[] words = {"pa", "papa", "ma", "mama"};
        int expected = 2;
        assertEquals(expected, test.countPrefixSuffixPairs(words));
    }

    @Test
    void test3() {
        String[] words = {"ababa", "ab"};
        int expected = 0;
        assertEquals(expected, test.countPrefixSuffixPairs(words));
    }
}
/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m72;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link EditDistance}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/27 10:16
 */
class EditDistanceTest {
    private EditDistance test;

    @BeforeEach
    void setUp() {
        test = new EditDistance();
    }

    @Test
    void test1() {
        String word1 = "horse";
        String word2 = "ros";
        int expected = 3;
        assertEquals(expected, test.minDistance(word1, word2));
    }

    @Test
    void test2() {
        String word1 = "intention";
        String word2 = "execution";
        int expected = 5;
        assertEquals(expected, test.minDistance(word1, word2));
    }
}
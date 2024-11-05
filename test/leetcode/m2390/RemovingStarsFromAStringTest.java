/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2390;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link RemovingStarsFromAString}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 10:55
 */
class RemovingStarsFromAStringTest {
    private RemovingStarsFromAString test;

    @BeforeEach
    void setUp() {
        test = new RemovingStarsFromAString();
    }

    @Test
    void test1() {
        String s = "leet**cod*e";
        String expected = "lecoe";
        assertEquals(expected, test.removeStars(s));
    }

    @Test
    void test2() {
        String s = "erase*****";
        String expected = "";
        assertEquals(expected, test.removeStars(s));
    }
}